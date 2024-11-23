package kryptonbutterfly.collections;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;

import kryptonbutterfly.bounded.presets._int.int_not_negative;
import kryptonbutterfly.math.utils.limit.LimitInt;
import kryptonbutterfly.math.utils.limit.OutOfBoundsException;
import kryptonbutterfly.monads.opt.Opt;

public class CyclicBuffer<T> implements Iterable<T>
{
	private final Consumer<T>	evictionListener;
	private final T[]			content;
	private int					start		= 0;
	private int					occupancy	= 0;
	
	/**
	 * @param size
	 *            The maximum size of the buffer.
	 */
	public CyclicBuffer(int_not_negative size)
	{
		this(size, e -> {});
	}
	
	/**
	 * @param size
	 *            The maximum size of the buffer.
	 * @param evicionListener
	 *            A listener to be called when an element is evicted from this
	 *            buffer.
	 */
	public CyclicBuffer(int_not_negative size, Consumer<T> evicionListener)
	{
		this(size.value(), evicionListener);
	}
	
	/**
	 * @param size
	 *            The maximum size of the buffer.
	 * @param evictionListener
	 *            A listener to be called when an element is evicted from this
	 *            buffer.
	 */
	@Deprecated(since = "Use the bounded constructor instead!")
	@SuppressWarnings("unchecked")
	public CyclicBuffer(int size, Consumer<T> evictionListener)
	{
		LimitInt.assertLimit(0, size, Integer.MAX_VALUE, "size");
		this.content			= (T[]) new Object[size];
		this.evictionListener	= evictionListener;
	}
	
	/**
	 * Pushes the specified element to the front of the buffer and evacuates the
	 * oldest element if the buffer is full.
	 * 
	 * @param element
	 *            The element to be added to the buffer.
	 */
	public void push(T element)
	{
		int	i	= nextPosition();
		T	old	= content[i];
		content[i] = element;
		if (occupancy < content.length)
		{
			occupancy++;
		}
		else
		{
			start = (start + 1) % content.length;
			evictionListener.accept(old);
		}
	}
	
	/**
	 * removes the oldest element from the buffer and returns {@link Opt#of(it)} or
	 * {@link Opt#empty()} if the buffer is empty
	 * 
	 * @return An Opt of the oldest element of this buffer or an empty Opt if the
	 *         buffer is empty.
	 */
	public Opt<T> pop()
	{
		if (occupancy > 0)
		{
			T element = content[start];
			content[start]	= null;
			start			= (start + 1) % content.length;
			occupancy--;
			return Opt.of(element);
		}
		else
		{
			return Opt.empty();
		}
	}
	
	/**
	 * @param index
	 * @return The element at the specified index.
	 * @throws OutOfBoundsException
	 *             if {@code index >= } {@link #size()} or {@code index < 0}
	 */
	public T get(int index)
	{
		LimitInt.assertLimit(0, index, occupancy - 1, "index");
		return content[(start + index) % content.length];
	}
	
	/**
	 * Removes all entities after and including the given {@code index}.
	 * 
	 * @param index
	 */
	public void removeFrom(int index)
	{
		index++;
		while (index < occupancy)
			removeLast();
	}
	
	/**
	 * If present removes the last element in the buffer.
	 */
	public void removeLast()
	{
		if (occupancy == 0)
			return;
		occupancy--;
		final int index = (start + occupancy) % content.length;
		content[index] = null;
	}
	
	/**
	 * Moves the specified element to the front of the buffer, if it is an element
	 * of the buffer.
	 * 
	 * @param element
	 *            The element to be moved to the front
	 */
	public void moveToFront(T element)
	{
		final int index = ArrayUtils.find(content, element);
		if (index > -1)
		{
			moveToFrontRaw(index);
		}
	}
	
	/**
	 * Moves the specified element to the front of the buffer. If this element is
	 * not contained in the buffer the behavior is undefined.
	 * 
	 * @param element
	 * @deprecated This method lacks sanity checks. Use {@link #moveToFront(Object)}
	 *             or ensure that the given object exists in this buffer!
	 */
	public void moveToFrontRaw(T element)
	{
		moveToFrontRaw(ArrayUtils.find(content, element));
	}
	
	/**
	 * Moves the element at the specified index to the front of the buffer.
	 * 
	 * @param index
	 *            The index of the element to be moved to the front of the buffer.
	 * @throws OutOfBoundsException
	 *             if {@code index < 0} or {@code >=} {@link #size()}
	 */
	public void moveToFront(int index)
	{
		LimitInt.assertLimit(0, index, occupancy, "index");
		moveToFrontRaw(index);
	}
	
	/**
	 * Moves the element at the specified index to the front of the buffer. If this
	 * index is out of bounds of the current buffer the behavior is undefined.
	 * 
	 * @param index
	 *            The index of the element to be moved to the front of the buffer.
	 * @deprecated This method lacks sanity checks. Use {@link #moveToFront(int)} or
	 *             ensure {@code index >= 0} and {@code <} {@link #size()}
	 */
	@Deprecated
	public void moveToFrontRaw(int index)
	{
		final int	actualPos	= (start + index) % content.length;
		final T		element		= content[actualPos];
		final int	end			= nextPosition();
		if (start == actualPos)
		{
			if (occupancy != content.length)
			{
				content[actualPos]	= null;
				content[end]		= element;
			}
			moveStart();
		}
		else if (end > actualPos)
		{
			final int lastPos = (start + occupancy - 1) % content.length;
			System.arraycopy(content, actualPos + 1, content, actualPos, occupancy - index);
			content[lastPos] = element;
		}
		else if (end < actualPos)
		{
			System.arraycopy(content, start, content, start + 1, index);
			content[start]	= null;
			content[end]	= element;
			moveStart();
		}
	}
	
	/**
	 * @return The next position an element can be stored in.
	 */
	private int nextPosition()
	{
		return (start + occupancy) % content.length;
	}
	
	/**
	 * Shifts the start marker to the right, wraps around to the beginning of the
	 * backing array when the marker has reached the end.
	 */
	private void moveStart()
	{
		start = (start + 1) % content.length;
	}
	
	/**
	 * @return The amount of contained elements in this buffer.
	 */
	public int size()
	{
		return occupancy;
	}
	
	/**
	 * @return The maximum amount of elements this buffer can contain.
	 */
	public int capacity()
	{
		return content.length;
	}
	
	/**
	 * resets the buffer and clears the backing array
	 */
	public void clear()
	{
		Arrays.fill(content, null);
		start		= 0;
		occupancy	= 0;
	}
	
	@Override
	public Iterator<T> iterator()
	{
		return new Iterator<>()
		{
			public int index = 0;
			
			@Override
			public boolean hasNext()
			{
				return index < size();
			}
			
			@Override
			public T next()
			{
				return get(index++);
			}
		};
	}
}