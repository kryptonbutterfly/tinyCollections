package kryptonbutterfly.collections;

import static kryptonbutterfly.math.utils.range.Range.*;

import java.util.Collection;
import java.util.Iterator;

import kryptonbutterfly.math.utils.limit.LimitInt;

public class Stack<E> implements Iterable<E>, Cloneable
{
	private static final int	MIN_INITIAL_CAPACITY	= 8;
	transient E[]				stackArray;
	int							size;
	
	@SuppressWarnings("unchecked")
	public Stack()
	{
		this.stackArray = (E[]) new Object[MIN_INITIAL_CAPACITY];
	}
	
	@SuppressWarnings("unchecked")
	public Stack(int numElements)
	{
		if (numElements < MIN_INITIAL_CAPACITY)
		{
			this.stackArray = (E[]) new Object[MIN_INITIAL_CAPACITY];
		}
		else
		{
			int capacity = MIN_INITIAL_CAPACITY;
			while ((capacity > 0) && (capacity < numElements))
			{
				capacity <<= 1;
			}
			this.stackArray = (E[]) new Object[capacity];
		}
	}
	
	public int size()
	{
		return this.size;
	}
	
	public void push(E element)
	{
		if (this.size >= this.stackArray.length)
		{
			expand(1);
		}
		this.stackArray[this.size]	= element;
		this.size					+= 1;
	}
	
	public void pushAll(Collection<E> elements)
	{
		if (elements.size() > 0)
		{
			if (this.size + elements.size() >= this.stackArray.length)
			{
				expand(elements.size());
			}
			for (E e : elements)
			{
				this.stackArray[this.size]	= e;
				this.size					+= 1;
			}
		}
	}
	
	/**
	 * @param elements
	 */
	public void pushAll(E[] elements)
	{
		if (elements.length > 0)
		{
			int required = this.size + elements.length;
			if (required > this.stackArray.length)
			{
				expand(this.stackArray.length - required);
			}
			System.arraycopy(elements, 0, this.stackArray, this.size, elements.length);
			this.size += elements.length;
		}
	}
	
	/**
	 * expands the underlying array by at least minAmount
	 * 
	 * @param minAmount
	 */
	private void expand(int minAmount)
	{
		int capacity = this.stackArray.length;
		while (capacity < this.stackArray.length + minAmount)
		{
			capacity <<= 1;
		}
		if (capacity < 0)
		{
			throw new IllegalStateException("Stack to big, can't add Element");
		}
		@SuppressWarnings("unchecked")
		E[] newArray = (E[]) new Object[capacity];
		System.arraycopy(this.stackArray, 0, newArray, 0, this.stackArray.length);
		this.stackArray = newArray;
	}
	
	/**
	 * Removes and returns the top element of the Stack
	 * 
	 * @return the top element of the stack
	 */
	public E pop()
	{
		this.size -= 1;
		
		E e = this.stackArray[this.size];
		this.stackArray[this.size] = null;
		return e;
	}
	
	/**
	 * @param index
	 * @return the element at the index
	 */
	public E get(int index)
	{
		LimitInt.assertLimit(0, index, size - 1, "index");
		return this.stackArray[index];
	}
	
	/**
	 * @return the last/top element of the Stack
	 */
	public E getLast()
	{
		return (E) get(this.size - 1);
	}
	
	public boolean isEmpty()
	{
		return this.size == 0;
	}
	
	/**
	 * @return a new stack where the element order is reversed
	 */
	public Stack<E> flip()
	{
		Stack<E> stack = new Stack<E>(this.size);
		for (int i : range(size).reverse())
		{
			stack.push(this.stackArray[i]);
		}
		return stack;
	}
	
	/**
	 * @return a shallow copy of this stack
	 * @throws CloneNotSupportedException
	 */
	@Override
	public Stack<E> clone() throws CloneNotSupportedException
	{
		@SuppressWarnings("unchecked")
		Stack<E> stack = (Stack<E>) super.clone();
		stack.stackArray	= stackArray.clone();
		stack.size			= size;
		// System.arraycopy(this.stackArray, 0, stack.stackArray, 0, size);
		// stack.size = this.size;
		return stack;
	}
	
	/**
	 * removes all elements from this Stack
	 */
	public void clear()
	{
		for (int i : range(size))
		{
			stackArray[i] = null;
		}
		size = 0;
	}
	
	@Override
	public Iterator<E> iterator()
	{
		return new Iterator<E>()
		{
			int index = size - 1;
			
			@Override
			public boolean hasNext()
			{
				return index >= 0;
			}
			
			@Override
			public E next()
			{
				return Stack.this.get(index--);
			}
		};
	}
	
	@Override
	public String toString()
	{
		StringBuilder sb = new StringBuilder();
		sb.append("(");
		for (Iterator<E> iterator = this.iterator(); iterator.hasNext();)
		{
			sb.append(iterator.next());
			if (iterator.hasNext())
			{
				sb.append(", ");
			}
		}
		sb.append(")");
		return sb.toString();
	}
}