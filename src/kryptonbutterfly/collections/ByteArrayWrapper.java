package kryptonbutterfly.collections;

import java.util.Arrays;

public record ByteArrayWrapper(byte[] data)
{
	public ByteArrayWrapper(byte[] data)
	{
		this.data = Arrays.copyOf(data, data.length);
	}
	
	public byte[] getArray()
	{
		return Arrays.copyOf(data, data.length);
	}
}