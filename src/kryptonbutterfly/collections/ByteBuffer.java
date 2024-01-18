package kryptonbutterfly.collections;

import java.util.Arrays;

import kryptonbutterfly.math.utils.limit.LimitInt;

public class ByteBuffer
{
	protected byte[] elementData;
	
	protected int elementCount;
	
	protected int capacityIncrement;
	
	public ByteBuffer(byte[] content)
	{
		this(content, 0);
	}
	
	public ByteBuffer(byte[] content, int capacityIncrement)
	{
		this.elementData		= content.clone();
		this.elementCount		= content.length;
		this.capacityIncrement	= capacityIncrement;
	}
	
	public ByteBuffer(int initialCapacity, int capacityIncrement)
	{
		if (initialCapacity < 0)
		{
			throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
		}
		this.elementData		= new byte[initialCapacity];
		this.capacityIncrement	= capacityIncrement;
	}
	
	public ByteBuffer(int initialCapacity)
	{
		this(initialCapacity, 0);
	}
	
	public ByteBuffer()
	{
		this(200);
	}
	
	public void trimToSize()
	{
		int oldCapacity = elementData.length;
		if (elementCount < oldCapacity)
		{
			byte[] oldData = elementData;
			elementData = new byte[elementCount];
			System.arraycopy(oldData, 0, elementData, 0, elementCount);
		}
	}
	
	private void ensureCapacity(int minCapacity)
	{
		int oldCapacity = elementData.length;
		if (minCapacity > oldCapacity)
		{
			byte	oldData[]	= elementData;
			int		newCapacity;
			if (capacityIncrement > 0)
			{
				newCapacity = oldCapacity + capacityIncrement;
			}
			else
			{
				newCapacity = oldCapacity * 2;
			}
			newCapacity	= Math.max(newCapacity, minCapacity);
			elementData	= new byte[newCapacity];
			System.arraycopy(oldData, 0, elementData, 0, elementCount);
		}
	}
	
	public int capacity()
	{
		return elementData.length;
	}
	
	public int size()
	{
		return elementCount;
	}
	
	public boolean isEmpty()
	{
		return elementCount == 0;
	}
	
	public void append(byte value)
	{
		ensureCapacity(elementCount + 1);
		elementData[elementCount++] = value;
	}
	
	public void append(byte[] value)
	{
		ensureCapacity(elementCount + value.length);
		System.arraycopy(value, 0, elementData, elementCount, value.length);
		elementCount += value.length;
	}
	
	public void append(ByteBuffer value)
	{
		append(value.toArray());
	}
	
	public int pop(byte[] destination)
	{
		if (size() == 0)
		{
			return -1;
		}
		else
		{
			int amount = LimitInt.clamp(0, destination.length, size());
			System.arraycopy(toArray(0, amount), 0, destination, 0, amount);
			this.elementData	= toArray(amount, size());
			this.elementCount	= elementData.length;
			return amount;
		}
	}
	
	public byte[] pop(int amount)
	{
		amount = LimitInt.clamp(0, amount, size());
		byte[] result = this.toArray(0, amount);
		this.elementData	= this.toArray(amount, size());
		this.elementCount	= this.elementData.length;
		return result;
	}
	
	public ByteBuffer popBuffer(int amount)
	{
		amount = LimitInt.clamp(0, amount, size());
		ByteBuffer result = this.subSegment(0, amount);
		this.elementData	= this.toArray(amount, size());
		this.elementCount	= this.elementData.length;
		return result;
	}
	
	public int indexOf(byte[] value)
	{
		return ArrayUtils.indexOf(toArray(), value);
	}
	
	public int indexOf(ByteBuffer value)
	{
		return indexOf(value.toArray());
	}
	
	public ByteBuffer subSegment(int start, int end)
	{
		return new ByteBuffer(toArray(start, end), this.capacityIncrement);
	}
	
	public byte[] toArray()
	{
		return toArray(0, this.elementCount);
	}
	
	public byte[] toArray(int start, int end)
	{
		return Arrays.copyOfRange(elementData, start, end);
	}
}