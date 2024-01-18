package kryptonbutterfly.collections;

import static kryptonbutterfly.math.utils.range.Range.*;

import java.util.Arrays;
import java.util.Objects;

import kryptonbutterfly.math.utils.range.ArrayRange;
import kryptonbutterfly.math.utils.range.IndexElement;

public class ArrayUtils
{
	/**
	 * @param <T>
	 * @param target
	 *            The array to perform a swap of two elements on.
	 * @param first
	 *            The index of the first item to swap
	 * @param second
	 *            The index of the second item to swap
	 * @return the supplied target array for convenience
	 */
	public static <T> T[] swap(T[] target, int first, int second)
	{
		T tmp = target[first];
		target[first]	= target[second];
		target[second]	= tmp;
		return target;
	}
	
	/**
	 * @param target
	 *            The array to perform a swap of two elements on.
	 * @param first
	 *            The index of the first item to swap
	 * @param second
	 *            The index of the second item to swap
	 * @return the supplied target array for convenience
	 */
	public static boolean[] swap(boolean[] target, int first, int second)
	{
		boolean tmp = target[first];
		target[first]	= target[second];
		target[second]	= tmp;
		return target;
	}
	
	/**
	 * @param target
	 *            The array to perform a swap of two elements on.
	 * @param first
	 *            The index of the first item to swap
	 * @param second
	 *            The index of the second item to swap
	 * @return the supplied target array for convenience
	 */
	public static byte[] swap(byte[] target, int first, int second)
	{
		byte tmp = target[first];
		target[first]	= target[second];
		target[second]	= tmp;
		return target;
	}
	
	/**
	 * @param target
	 *            The array to perform a swap of two elements on.
	 * @param first
	 *            The index of the first item to swap
	 * @param second
	 *            The index of the second item to swap
	 * @return the supplied target array for convenience
	 */
	public static char[] swap(char[] target, int first, int second)
	{
		char tmp = target[first];
		target[first]	= target[second];
		target[second]	= tmp;
		return target;
	}
	
	/**
	 * @param target
	 *            The array to perform a swap of two elements on.
	 * @param first
	 *            The index of the first item to swap
	 * @param second
	 *            The index of the second item to swap
	 * @return the supplied target array for convenience
	 */
	public static short[] swap(short[] target, int first, int second)
	{
		short tmp = target[first];
		target[first]	= target[second];
		target[second]	= tmp;
		return target;
	}
	
	/**
	 * @param target
	 *            The array to perform a swap of two elements on.
	 * @param first
	 *            The index of the first item to swap
	 * @param second
	 *            The index of the second item to swap
	 * @return the supplied target array for convenience
	 */
	public static int[] swap(int[] target, int first, int second)
	{
		int tmp = target[first];
		target[first]	= target[second];
		target[second]	= tmp;
		return target;
	}
	
	/**
	 * @param target
	 *            The array to perform a swap of two elements on.
	 * @param first
	 *            The index of the first item to swap
	 * @param second
	 *            The index of the second item to swap
	 * @return the supplied target array for convenience
	 */
	public static long[] swap(long[] target, int first, int second)
	{
		long tmp = target[first];
		target[first]	= target[second];
		target[second]	= tmp;
		return target;
	}
	
	/**
	 * @param target
	 *            The array to perform a swap of two elements on.
	 * @param first
	 *            The index of the first item to swap
	 * @param second
	 *            The index of the second item to swap
	 * @return the supplied target array for convenience
	 */
	public static float[] swap(float[] target, int first, int second)
	{
		float tmp = target[first];
		target[first]	= target[second];
		target[second]	= tmp;
		return target;
	}
	
	/**
	 * @param target
	 *            The array to perform a swap of two elements on.
	 * @param first
	 *            The index of the first item to swap
	 * @param second
	 *            The index of the second item to swap
	 * @return the supplied target array for convenience
	 */
	public static double[] swap(double[] target, int first, int second)
	{
		double tmp = target[first];
		target[first]	= target[second];
		target[second]	= tmp;
		return target;
	}
	
	/**
	 * @param target
	 *            The array to search in
	 * @param element
	 *            The element to search for
	 * @return An array of indices where the target array contains the supplied
	 *         element
	 */
	public static int[] findAll(boolean[] target, boolean element)
	{
		int count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				count++;
			}
		}
		int[] indices = new int[count];
		if (count == 0)
		{
			return indices;
		}
		count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				indices[count++] = i;
				if (count == indices.length)
				{
					return indices;
				}
			}
		}
		return indices;
	}
	
	/**
	 * @param target
	 *            The array to search in
	 * @param element
	 *            The element to search for
	 * @return An array of indices where the target array contains the supplied
	 *         element
	 */
	public static int[] findAll(byte[] target, byte element)
	{
		int count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				count++;
			}
		}
		int[] indices = new int[count];
		if (count == 0)
		{
			return indices;
		}
		count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				indices[count++] = i;
				if (count == indices.length)
				{
					return indices;
				}
			}
		}
		return indices;
	}
	
	/**
	 * @param target
	 *            The array to search in
	 * @param element
	 *            The element to search for
	 * @return An array of indices where the target array contains the supplied
	 *         element
	 */
	public static int[] findAll(char[] target, char element)
	{
		int count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				count++;
			}
		}
		int[] indices = new int[count];
		if (count == 0)
		{
			return indices;
		}
		count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				indices[count++] = i;
				if (count == indices.length)
				{
					return indices;
				}
			}
		}
		return indices;
	}
	
	/**
	 * @param target
	 *            The array to search in
	 * @param element
	 *            The element to search for
	 * @return An array of indices where the target array contains the supplied
	 *         element
	 */
	public static int[] findAll(short[] target, short element)
	{
		int count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				count++;
			}
		}
		int[] indices = new int[count];
		if (count == 0)
		{
			return indices;
		}
		count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				indices[count++] = i;
				if (count == indices.length)
				{
					return indices;
				}
			}
		}
		return indices;
	}
	
	/**
	 * @param target
	 *            The array to search in
	 * @param element
	 *            The element to search for
	 * @return An array of indices where the target array contains the supplied
	 *         element
	 */
	public static int[] findAll(int[] target, int element)
	{
		int count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				count++;
			}
		}
		int[] indices = new int[count];
		if (count == 0)
		{
			return indices;
		}
		count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				indices[count++] = i;
				if (count == indices.length)
				{
					return indices;
				}
			}
		}
		return indices;
	}
	
	/**
	 * @param target
	 *            The array to search in
	 * @param element
	 *            The element to search for
	 * @return An array of indices where the target array contains the supplied
	 *         element
	 */
	public static int[] findAll(long[] target, long element)
	{
		int count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				count++;
			}
		}
		int[] indices = new int[count];
		if (count == 0)
		{
			return indices;
		}
		count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				indices[count++] = i;
				if (count == indices.length)
				{
					return indices;
				}
			}
		}
		return indices;
	}
	
	/**
	 * @param target
	 *            The array to search in
	 * @param element
	 *            The element to search for
	 * @return An array of indices where the target array contains the supplied
	 *         element
	 */
	public static int[] findAll(float[] target, float element)
	{
		int count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				count++;
			}
		}
		int[] indices = new int[count];
		if (count == 0)
		{
			return indices;
		}
		count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				indices[count++] = i;
				if (count == indices.length)
				{
					return indices;
				}
			}
		}
		return indices;
	}
	
	/**
	 * @param target
	 *            The array to search in
	 * @param element
	 *            The element to search for
	 * @return An array of indices where the target array contains the supplied
	 *         element
	 */
	public static int[] findAll(double[] target, double element)
	{
		int count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				count++;
			}
		}
		int[] indices = new int[count];
		if (count == 0)
		{
			return indices;
		}
		count = 0;
		for (final int i : range(target.length))
		{
			if (target[i] == element)
			{
				indices[count++] = i;
				if (count == indices.length)
				{
					return indices;
				}
			}
		}
		return indices;
	}
	
	/**
	 * @param target
	 *            The array to search in
	 * @param element
	 *            The element to search for
	 * @return An array of indices where the target array contains the supplied
	 *         element
	 */
	public static <T, E extends T> int[] findAll(T[] target, E element)
	{
		int count = 0;
		for (final int i : range(target.length))
		{
			if (Objects.deepEquals(element, target[i]))
			{
				count++;
			}
		}
		int[] indices = new int[count];
		if (count == 0)
		{
			return indices;
		}
		count = 0;
		for (final int i : range(target.length))
		{
			if (Objects.deepEquals(element, target[i]))
			{
				indices[count++] = i;
				if (count == indices.length)
				{
					return indices;
				}
			}
		}
		return indices;
	}
	
	/**
	 * @param <T>
	 * @param target
	 *            The array to be searched.
	 * @param element
	 *            The element to search for.
	 * @return the index of the element searched for or -1 if it wasn't found.
	 */
	public static <T> int find(T[] target, T element)
	{
		for (IndexElement<T> iElement : ArrayRange.range(target))
		{
			if (Objects.deepEquals(iElement.element(), element))
			{
				return iElement.index();
			}
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param element
	 *            The element to search for.
	 * @return the index of the element searched for or -1 if it wasn't found.
	 */
	public static int find(boolean[] target, boolean element)
	{
		for (int i : range(target.length))
		{
			if (target[i] == element)
			{
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param element
	 *            The element to search for.
	 * @return the index of the element searched for or -1 if it wasn't found.
	 */
	public static int find(byte[] target, byte element)
	{
		for (int i : range(target.length))
		{
			if (target[i] == element)
			{
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param element
	 *            The element to search for.
	 * @return the index of the element searched for or -1 if it wasn't found.
	 */
	public static int find(short[] target, short element)
	{
		for (int i : range(target.length))
		{
			if (target[i] == element)
			{
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param element
	 *            The element to search for.
	 * @return the index of the element searched for or -1 if it wasn't found.
	 */
	public static int find(char[] target, char element)
	{
		for (int i : range(target.length))
		{
			if (target[i] == element)
			{
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param element
	 *            The element to search for.
	 * @return the index of the element searched for or -1 if it wasn't found.
	 */
	public static int find(int[] target, int element)
	{
		for (int i : range(target.length))
		{
			if (target[i] == element)
			{
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param element
	 *            The element to search for.
	 * @return the index of the element searched for or -1 if it wasn't found.
	 */
	public static int find(long[] target, long element)
	{
		for (int i : range(target.length))
		{
			if (target[i] == element)
			{
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param element
	 *            The element to search for.
	 * @return the index of the element searched for or -1 if it wasn't found.
	 */
	public static int find(float[] target, float element)
	{
		for (int i : range(target.length))
		{
			if (target[i] == element)
			{
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param element
	 *            The element to search for.
	 * @return the index of the element searched for or -1 if it wasn't found.
	 */
	public static int find(double[] target, double element)
	{
		for (int i : range(target.length))
		{
			if (target[i] == element)
			{
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * @param <T>
	 * @param target
	 *            The array to be searched.
	 * @param selection
	 *            The sequence of elements to search for.
	 * @return the index of the sequence searched for or -1 if it wasn't found.
	 */
	public static <T> int indexOf(T[] target, T[] selection)
	{
		if (target.length < selection.length)
		{
			return -1;
		}
		outer:
		for (int i : range(target.length - selection.length))
		{
			for (int k : range(selection.length))
			{
				if (Objects.deepEquals(target[i + k], selection[k]))
				{
					continue outer;
				}
			}
			return i;
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param selection
	 *            The sequence of elements to search for.
	 * @return the index of the sequence searched for or -1 if it wasn't found.
	 */
	public static int indexOf(byte[] target, byte[] selection)
	{
		if (target.length < selection.length)
		{
			return -1;
		}
		outer:
		for (int i : range(target.length - selection.length))
		{
			for (int k : range(selection.length))
			{
				if (target[i + k] != selection[k])
				{
					continue outer;
				}
			}
			return i;
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param selection
	 *            The sequence of elements to search for.
	 * @return the index of the sequence searched for or -1 if it wasn't found.
	 */
	public static int indexOf(char[] target, char[] selection)
	{
		if (target.length < selection.length)
		{
			return -1;
		}
		outer:
		for (int i : range(target.length - selection.length))
		{
			for (int k : range(selection.length))
			{
				if (target[i + k] != selection[k])
				{
					continue outer;
				}
			}
			return i;
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param selection
	 *            The sequence of elements to search for.
	 * @return the index of the sequence searched for or -1 if it wasn't found.
	 */
	public static int indexOf(short[] target, short[] selection)
	{
		if (target.length < selection.length)
		{
			return -1;
		}
		outer:
		for (int i : range(target.length - selection.length))
		{
			for (int k : range(selection.length))
			{
				if (target[i + k] != selection[k])
				{
					continue outer;
				}
			}
			return i;
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param selection
	 *            The sequence of elements to search for.
	 * @return the index of the sequence searched for or -1 if it wasn't found.
	 */
	public static int indexOf(int[] target, int[] selection)
	{
		if (target.length < selection.length)
		{
			return -1;
		}
		outer:
		for (int i : range(target.length - selection.length))
		{
			for (int k : range(selection.length))
			{
				if (target[i + k] != selection[k])
				{
					continue outer;
				}
			}
			return i;
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param selection
	 *            The sequence of elements to search for.
	 * @return the index of the sequence searched for or -1 if it wasn't found.
	 */
	public static int indexOf(long[] target, long[] selection)
	{
		if (target.length < selection.length)
		{
			return -1;
		}
		outer:
		for (int i : range(target.length - selection.length))
		{
			for (int k : range(selection.length))
			{
				if (target[i + k] != selection[k])
				{
					continue outer;
				}
			}
			return i;
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param selection
	 *            The sequence of elements to search for.
	 * @return the index of the sequence searched for or -1 if it wasn't found.
	 */
	public static int indexOf(float[] target, float[] selection)
	{
		if (target.length < selection.length)
		{
			return -1;
		}
		outer:
		for (int i : range(target.length - selection.length))
		{
			for (int k : range(selection.length))
			{
				if (target[i + k] != selection[k])
				{
					continue outer;
				}
			}
			return i;
		}
		return -1;
	}
	
	/**
	 * @param target
	 *            The array to be searched.
	 * @param selection
	 *            The sequence of elements to search for.
	 * @return the index of the sequence searched for or -1 if it wasn't found.
	 */
	public static int indexOf(double[] target, double[] selection)
	{
		if (target.length < selection.length)
		{
			return -1;
		}
		outer:
		for (int i : range(target.length - selection.length))
		{
			for (int k : range(selection.length))
			{
				if (target[i + k] != selection[k])
				{
					continue outer;
				}
			}
			return i;
		}
		return -1;
	}
	
	/**
	 * @param first
	 *            An array of distinct sorted ints.
	 * @param second
	 *            An array of distinct sorted ints.
	 * @return An array containing the union of the given arrays sorted and
	 *         distinct.
	 */
	public static int[] unionSortedDistinct(int[] first, int[] second)
	{
		int[]	buffer	= new int[first.length + second.length];
		int		size	= 0;
		int		i0		= 0;
		int		i1		= 0;
		while (i0 < first.length || i1 < second.length)
		{
			if (i0 < first.length)
			{
				if (i1 < second.length)
				{
					int	v0	= first[i0];
					int	v1	= second[i1];
					if (v0 == v1)
					{
						buffer[size++] = v0;
						i0++;
						i1++;
					}
					else if (v0 < v1)
					{
						buffer[size++] = v0;
						i0++;
					}
					else
					{
						buffer[size++] = v1;
						i1++;
					}
				}
				else
				{
					buffer[size++] = first[i0++];
				}
			}
			else
			{
				buffer[size++] = second[i1++];
			}
		}
		return Arrays.copyOf(buffer, size);
	}
	
	/**
	 * <img src=
	 * "data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9Im5vIj8+CjwhLS0gQ3JlYXRlZCB3aXRoIElua3NjYXBlIChodHRwOi8vd3d3Lmlua3NjYXBlLm9yZy8pIC0tPgoKPHN2ZwogICB4bWxuczpkYz0iaHR0cDovL3B1cmwub3JnL2RjL2VsZW1lbnRzLzEuMS8iCiAgIHhtbG5zOmNjPSJodHRwOi8vY3JlYXRpdmVjb21tb25zLm9yZy9ucyMiCiAgIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyIKICAgeG1sbnM6c3ZnPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIKICAgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIgogICB4bWxuczpzb2RpcG9kaT0iaHR0cDovL3NvZGlwb2RpLnNvdXJjZWZvcmdlLm5ldC9EVEQvc29kaXBvZGktMC5kdGQiCiAgIHhtbG5zOmlua3NjYXBlPSJodHRwOi8vd3d3Lmlua3NjYXBlLm9yZy9uYW1lc3BhY2VzL2lua3NjYXBlIgogICB3aWR0aD0iMTI4bW0iCiAgIGhlaWdodD0iOTZtbSIKICAgdmlld0JveD0iMCAwIDEyOCA5NiIKICAgdmVyc2lvbj0iMS4xIgogICBpZD0ic3ZnOCIKICAgaW5rc2NhcGU6dmVyc2lvbj0iMC45Mi41ICgyMDYwZWMxZjlmLCAyMDIwLTA0LTA4KSIKICAgc29kaXBvZGk6ZG9jbmFtZT0iSW50ZXJzZWN0aW9uLnN2ZyI+CiAgPGRlZnMKICAgICBpZD0iZGVmczIiIC8+CiAgPHNvZGlwb2RpOm5hbWVkdmlldwogICAgIGlkPSJiYXNlIgogICAgIHBhZ2Vjb2xvcj0iIzM0MzkzZCIKICAgICBib3JkZXJjb2xvcj0iI2ZmZmZmZiIKICAgICBib3JkZXJvcGFjaXR5PSIxIgogICAgIGlua3NjYXBlOnBhZ2VvcGFjaXR5PSIxIgogICAgIGlua3NjYXBlOnBhZ2VzaGFkb3c9IjIiCiAgICAgaW5rc2NhcGU6em9vbT0iMS45Nzk4OTkiCiAgICAgaW5rc2NhcGU6Y3g9IjIyMi45MTQxMSIKICAgICBpbmtzY2FwZTpjeT0iMTc5LjYwMjI5IgogICAgIGlua3NjYXBlOmRvY3VtZW50LXVuaXRzPSJtbSIKICAgICBpbmtzY2FwZTpjdXJyZW50LWxheWVyPSJzdmc4IgogICAgIHNob3dncmlkPSJmYWxzZSIKICAgICBpbmtzY2FwZTp3aW5kb3ctd2lkdGg9IjE4NjQiCiAgICAgaW5rc2NhcGU6d2luZG93LWhlaWdodD0iMTAxNiIKICAgICBpbmtzY2FwZTp3aW5kb3cteD0iNTYiCiAgICAgaW5rc2NhcGU6d2luZG93LXk9IjI3IgogICAgIGlua3NjYXBlOndpbmRvdy1tYXhpbWl6ZWQ9IjEiIC8+CiAgPG1ldGFkYXRhCiAgICAgaWQ9Im1ldGFkYXRhNSI+CiAgICA8cmRmOlJERj4KICAgICAgPGNjOldvcmsKICAgICAgICAgcmRmOmFib3V0PSIiPgogICAgICAgIDxkYzpmb3JtYXQ+aW1hZ2Uvc3ZnK3htbDwvZGM6Zm9ybWF0PgogICAgICAgIDxkYzp0eXBlCiAgICAgICAgICAgcmRmOnJlc291cmNlPSJodHRwOi8vcHVybC5vcmcvZGMvZGNtaXR5cGUvU3RpbGxJbWFnZSIgLz4KICAgICAgICA8ZGM6dGl0bGUgLz4KICAgICAgPC9jYzpXb3JrPgogICAgPC9yZGY6UkRGPgogIDwvbWV0YWRhdGE+CiAgPHBhdGgKICAgICBpbmtzY2FwZTpsYWJlbD0iQm9yZGVyIgogICAgIGlua3NjYXBlOmNvbm5lY3Rvci1jdXJ2YXR1cmU9IjAiCiAgICAgaWQ9InBhdGg0NTY2IgogICAgIGQ9Ik0gMCwwLjUzNDU0IEMgMS4wMDc0MDk2ZS04LDMyLjM1NjM2IDAsNjQuMTc4MTggMCw5NiBjIDQyLjY2NjY2NSwwIDg1LjMzMzMyOSwwIDEyOCwwIDAsLTMyIDAsLTY0IDAsLTk2IEMgODUuMzMzMzI5LDAgNDIuNjY2NjY1LDAgMCwwIHYgMC41MzQ0MSB6IgogICAgIHN0eWxlPSJkaXNwbGF5OmlubGluZTtmaWxsOiM1MTU2NTg7ZmlsbC1vcGFjaXR5OjE7c3Ryb2tlLXdpZHRoOjAuMjY2ODczNDIiIC8+CiAgPHBhdGgKICAgICBzdHlsZT0iZGlzcGxheTppbmxpbmU7ZmlsbDojMzQzOTNkO2ZpbGwtb3BhY2l0eToxO3N0cm9rZS13aWR0aDowLjI2MjAwNzU5IgogICAgIGQ9Ik0gMSwxLjUyMzQwMzggQyAxLDMyLjY4MjI2OSAxLDYzLjg0MTEzNSAxLDk1IGMgNDEuOTk5OTk4LDAgODMuOTk5OTk2LDAgMTI2LDAgMCwtMzEuMzMzMzMzIDAsLTYyLjY2NjY2NyAwLC05My45OTk5OTk5IC00Mi4wMDAwMDQsMCAtODQuMDAwMDAyLDAgLTEyNiwwIHYgMC41MjMyNzY0IHoiCiAgICAgaWQ9InJlY3QzNzM4IgogICAgIGlua3NjYXBlOmNvbm5lY3Rvci1jdXJ2YXR1cmU9IjAiCiAgICAgaW5rc2NhcGU6bGFiZWw9IkJHIiAvPgogIDxwYXRoCiAgICAgc3R5bGU9ImZpbGw6IzUxNTY1ODtmaWxsLW9wYWNpdHk6MTtzdHJva2Utd2lkdGg6MC4yNjQ1ODMzMiIKICAgICBkPSJtIDQ1Ljk5OTc3NSwyMy41MDAxMDYgYyAtMTYuODk3LDAgLTMwLjQ5OTk0NiwxMy42MDI5NDcgLTMwLjQ5OTk0NiwzMC40OTk5NDcgMCwxNi44OTY5OTggMTMuNjAyOTQ2LDMwLjQ5OTk0NyAzMC40OTk5NDYsMzAuNDk5OTQ3IDYuNzQzNjY2LDAgMTIuOTYxNTA2LC0yLjE2ODUzOCAxOC4wMDA0NTEsLTUuODQ2NjcyIEMgNjkuMDM5MTE1LDgyLjMzMTMxMSA3NS4yNTY2NDgsODQuNSA4Mi4wMDAxNjMsODQuNSBjIDE2Ljg5Njk5OCwwIDMwLjQ5OTk0NywtMTMuNjAyOTQ5IDMwLjQ5OTk0NywtMzAuNDk5OTQ3IDAsLTE2Ljg5NyAtMTMuNjAyOTQ5LC0zMC40OTk5NDcgLTMwLjQ5OTk0NywtMzAuNDk5OTQ3IC02Ljc0MzUxNSwwIC0xMi45NjEwNDgsMi4xNjgxNzEgLTE3Ljk5OTkzNyw1Ljg0NjE1NSAtNS4wMzg5NDUsLTMuNjc4MTM0IC0xMS4yNTY3ODUsLTUuODQ2MTU1IC0xOC4wMDA0NTEsLTUuODQ2MTU1IHoiCiAgICAgaWQ9InJlY3Q0NTk0IgogICAgIGlua3NjYXBlOmxhYmVsPSJTZXRCRyIKICAgICBpbmtzY2FwZTpjb25uZWN0b3ItY3VydmF0dXJlPSIwIiAvPgogIDxwYXRoCiAgICAgaW5rc2NhcGU6bGFiZWw9IkludGVyc2VjdGlvbiIKICAgICBpbmtzY2FwZTpjb25uZWN0b3ItY3VydmF0dXJlPSIwIgogICAgIGlkPSJyZWN0NDY1NSIKICAgICBkPSJtIDY0LjAwMDIyNiwyOS4zNDY1MyBjIC03LjU4Njg4NSw1LjUzNzgxNiAtMTIuNTAwMDEyLDE0LjQ5OTc4OCAtMTIuNTAwMDEyLDI0LjY1MzI3NCAwLDEwLjE1MzQ4NiA0LjkxMzEyNywxOS4xMTU5NzQgMTIuNTAwMDEyLDI0LjY1Mzc5MyA3LjU4NjY5NCwtNS41Mzc4MzggMTIuNTAwMDE0LC0xNC41MDA0NTggMTIuNTAwMDE0LC0yNC42NTM3OTMgMCwtMTAuMTUzMzM1IC00LjkxMzMyLC0xOS4xMTU0MzkgLTEyLjUwMDAxNCwtMjQuNjUzMjc0IHoiCiAgICAgc3R5bGU9ImZpbGw6I2ZmMDAwMDtmaWxsLW9wYWNpdHk6MTtzdHJva2Utd2lkdGg6MC4yNjQ1ODMzMiIgLz4KICA8cGF0aAogICAgIHN0eWxlPSJmaWxsOiNkZGU1ZTg7ZmlsbC1vcGFjaXR5OjE7c3Ryb2tlLXdpZHRoOjAuMjMzNDE0MjkiCiAgICAgZD0iTSA0NS45OTk3NzUsMjMuMDAwMTY3IEEgMzAuOTk5OTk4LDMwLjk5OTk5OCAwIDAgMCAxNS4wMDAxMTgsNTQuMDAwMzQzIDMwLjk5OTk5OCwzMC45OTk5OTggMCAwIDAgNDUuOTk5Nzc1LDg1IDMwLjk5OTk5OCwzMC45OTk5OTggMCAwIDAgNjQuMDExNTk1LDc5LjE5OTMyIDMwLjk5OTk5OCwzMC45OTk5OTggMCAwIDAgODEuOTk5NjQ0LDg1IDMwLjk5OTk5OCwzMC45OTk5OTggMCAwIDAgMTEyLjk5OTgyLDU0LjAwMDM0MyAzMC45OTk5OTgsMzAuOTk5OTk4IDAgMCAwIDgxLjk5OTY0NCwyMy4wMDAxNjcgMzAuOTk5OTk4LDMwLjk5OTk5OCAwIDAgMCA2My45ODgzNDEsMjguODAwMzMxIDMwLjk5OTk5OCwzMC45OTk5OTggMCAwIDAgNDUuOTk5Nzc1LDIzLjAwMDE2NyBaIG0gMCwwLjk5OTkzOSBBIDMwLDMwIDAgMCAxIDYzLjE3NDk1MywyOS40MTg4OTggMzAuOTk5OTk4LDMwLjk5OTk5OCAwIDAgMCA1MC45OTk5ODcsNTQuMDAwMzQzIDMwLjk5OTk5OCwzMC45OTk5OTggMCAwIDAgNjMuMTQxODgsNzguNTc3MTM2IDMwLDMwIDAgMCAxIDQ1Ljk5OTc3NSw4NC4wMDAwNiAzMCwzMCAwIDAgMSAxNi4wMDAwNTcsNTQuMDAwMzQzIDMwLDMwIDAgMCAxIDQ1Ljk5OTc3NSwyNC4wMDAxMDYgWiBtIDM1Ljk5OTg2OSwwIEEgMzAsMzAgMCAwIDEgMTExLjk5OTg4LDU0LjAwMDM0MyAzMCwzMCAwIDAgMSA4MS45OTk2NDQsODQuMDAwMDYgMzAsMzAgMCAwIDEgNjQuODI0OTgyLDc4LjU4MDc1MyAzMC45OTk5OTgsMzAuOTk5OTk4IDAgMCAwIDc2Ljk5OTk1MSw1NC4wMDAzNDMgMzAuOTk5OTk4LDMwLjk5OTk5OCAwIDAgMCA2NC44NTg1NzQsMjkuNDIzMDMxIDMwLDMwIDAgMCAxIDgxLjk5OTY0NCwyNC4wMDAxMDYgWiBNIDYzLjk5MzUwOCwzMC4wNDE1OTcgQSAzMCwzMCAwIDAgMSA3Ni4wMDAwMTEsNTQuMDAwMzQzIDMwLDMwIDAgMCAxIDY0LjAwNjQyOCw3Ny45NTkwODYgMzAsMzAgMCAwIDEgNTEuOTk5OTI3LDU0LjAwMDM0MyAzMCwzMCAwIDAgMSA2My45OTM1MDgsMzAuMDQxNTk3IFoiCiAgICAgaWQ9ImVsbGlwc2U0NTcyIgogICAgIGlua3NjYXBlOmxhYmVsPSJTZXRCb3JkZXIiCiAgICAgaW5rc2NhcGU6Y29ubmVjdG9yLWN1cnZhdHVyZT0iMCIgLz4KICA8dGV4dAogICAgIHhtbDpzcGFjZT0icHJlc2VydmUiCiAgICAgc3R5bGU9ImZvbnQtc3R5bGU6bm9ybWFsO2ZvbnQtd2VpZ2h0Om5vcm1hbDtmb250LXNpemU6MTAuNTgzMzMzMDJweDtsaW5lLWhlaWdodDoxLjI1O2ZvbnQtZmFtaWx5OnNhbnMtc2VyaWY7bGV0dGVyLXNwYWNpbmc6MHB4O3dvcmQtc3BhY2luZzowcHg7ZmlsbDojZmZmZmZmO2ZpbGwtb3BhY2l0eToxO3N0cm9rZTpub25lO3N0cm9rZS13aWR0aDowLjI2NDU4MzMyIgogICAgIHg9IjEwLjg2NzcwOCIKICAgICB5PSIyMSIKICAgICBpZD0idGV4dDgyOCIKICAgICBpbmtzY2FwZTpsYWJlbD0iQSI+PHRzcGFuCiAgICAgICBzb2RpcG9kaTpyb2xlPSJsaW5lIgogICAgICAgeD0iMTAuODY3NzA4IgogICAgICAgeT0iMjEiCiAgICAgICBpZD0idHNwYW44MjYiCiAgICAgICBzdHlsZT0ic3Ryb2tlLXdpZHRoOjAuMjY0NTgzMzIiPjx0c3BhbgogICAgICAgICB4PSIxMC44Njc3MDgiCiAgICAgICAgIHk9IjIxIgogICAgICAgICBzdHlsZT0iZm9udC1zaXplOjE2LjkzMzMzMjQ0cHg7ZmlsbDojZmZmZmZmO2ZpbGwtb3BhY2l0eToxO3N0cm9rZS13aWR0aDowLjI2NDU4MzMyIgogICAgICAgICBpZD0idHNwYW44MjQiPkE8L3RzcGFuPjwvdHNwYW4+PC90ZXh0PgogIDx0ZXh0CiAgICAgeG1sOnNwYWNlPSJwcmVzZXJ2ZSIKICAgICBzdHlsZT0iZm9udC1zdHlsZTpub3JtYWw7Zm9udC13ZWlnaHQ6bm9ybWFsO2ZvbnQtc2l6ZToxMC41ODMzMDA1OXB4O2xpbmUtaGVpZ2h0OjEuMjU7Zm9udC1mYW1pbHk6c2Fucy1zZXJpZjtsZXR0ZXItc3BhY2luZzowcHg7d29yZC1zcGFjaW5nOjBweDtmaWxsOiNmZmZmZmY7ZmlsbC1vcGFjaXR5OjE7c3Ryb2tlOm5vbmU7c3Ryb2tlLXdpZHRoOjAuMjY0NTgyNTEiCiAgICAgeD0iMTA1LjA1MjQyIgogICAgIHk9IjIwLjk5OTkzNSIKICAgICBpZD0idGV4dDgzNCIKICAgICB0cmFuc2Zvcm09InNjYWxlKDAuOTk5OTk2ODgsMS4wMDAwMDMxKSIKICAgICBpbmtzY2FwZTpsYWJlbD0iQiI+PHRzcGFuCiAgICAgICBzb2RpcG9kaTpyb2xlPSJsaW5lIgogICAgICAgeD0iMTA1LjA1MjQyIgogICAgICAgeT0iMjAuOTk5OTM1IgogICAgICAgaWQ9InRzcGFuODMyIgogICAgICAgc3R5bGU9InN0cm9rZS13aWR0aDowLjI2NDU4MjUxIj48dHNwYW4KICAgICAgICAgeD0iMTA1LjA1MjQyIgogICAgICAgICB5PSIyMC45OTk5MzUiCiAgICAgICAgIHN0eWxlPSJmb250LXNpemU6MTYuOTMzMjgwOTRweDtmaWxsOiNmZmZmZmY7ZmlsbC1vcGFjaXR5OjE7c3Ryb2tlLXdpZHRoOjAuMjY0NTgyNTEiCiAgICAgICAgIGlkPSJ0c3BhbjgzMCI+QjwvdHNwYW4+PC90c3Bhbj48L3RleHQ+Cjwvc3ZnPgo="
	 * width="128"/>
	 * 
	 * @param setA
	 *            An array of distinct sorted ints.
	 * @param setB
	 *            An array of distinct sorted ints.
	 * @return An array containing the intersection of the given array sorted and
	 *         distinct.
	 */
	public static int[] intersectionSortedDistinct(int[] setA, int[] setB)
	{
		int[]	buffer	= new int[Math.min(setA.length, setB.length)];
		int		size	= 0;
		int		i0		= 0;
		int		i1		= 0;
		while (i0 < setA.length && i1 < setB.length)
		{
			int	v0	= setA[i0];
			int	v1	= setB[i1];
			if (v0 == v1)
			{
				buffer[size++] = v0;
				i0++;
				i1++;
			}
			else if (v0 > v1)
			{
				i1++;
			}
			else
			{
				i0++;
			}
		}
		return Arrays.copyOf(buffer, size);
	}
	
	/**
	 * Creates a new array containing all the elements contained in A but not in B.
	 * </br>
	 * <img src=
	 * "data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9Im5vIj8+CjwhLS0gQ3JlYXRlZCB3aXRoIElua3NjYXBlIChodHRwOi8vd3d3Lmlua3NjYXBlLm9yZy8pIC0tPgoKPHN2ZwogICB4bWxuczpkYz0iaHR0cDovL3B1cmwub3JnL2RjL2VsZW1lbnRzLzEuMS8iCiAgIHhtbG5zOmNjPSJodHRwOi8vY3JlYXRpdmVjb21tb25zLm9yZy9ucyMiCiAgIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyIKICAgeG1sbnM6c3ZnPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIKICAgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIgogICB4bWxuczpzb2RpcG9kaT0iaHR0cDovL3NvZGlwb2RpLnNvdXJjZWZvcmdlLm5ldC9EVEQvc29kaXBvZGktMC5kdGQiCiAgIHhtbG5zOmlua3NjYXBlPSJodHRwOi8vd3d3Lmlua3NjYXBlLm9yZy9uYW1lc3BhY2VzL2lua3NjYXBlIgogICB3aWR0aD0iMTI4bW0iCiAgIGhlaWdodD0iOTZtbSIKICAgdmlld0JveD0iMCAwIDEyOCA5NiIKICAgdmVyc2lvbj0iMS4xIgogICBpZD0ic3ZnOCIKICAgaW5rc2NhcGU6dmVyc2lvbj0iMC45Mi41ICgyMDYwZWMxZjlmLCAyMDIwLTA0LTA4KSIKICAgc29kaXBvZGk6ZG9jbmFtZT0iQ29tcGxlbWVudC5zdmciPgogIDxkZWZzCiAgICAgaWQ9ImRlZnMyIiAvPgogIDxzb2RpcG9kaTpuYW1lZHZpZXcKICAgICBpZD0iYmFzZSIKICAgICBwYWdlY29sb3I9IiMzNDM5M2QiCiAgICAgYm9yZGVyY29sb3I9IiNmZmZmZmYiCiAgICAgYm9yZGVyb3BhY2l0eT0iMSIKICAgICBpbmtzY2FwZTpwYWdlb3BhY2l0eT0iMSIKICAgICBpbmtzY2FwZTpwYWdlc2hhZG93PSIyIgogICAgIGlua3NjYXBlOnpvb209IjEuOTc5ODk5IgogICAgIGlua3NjYXBlOmN4PSIxNTIuODAyNDIiCiAgICAgaW5rc2NhcGU6Y3k9IjE3OC44MDE5MSIKICAgICBpbmtzY2FwZTpkb2N1bWVudC11bml0cz0ibW0iCiAgICAgaW5rc2NhcGU6Y3VycmVudC1sYXllcj0ic3ZnOCIKICAgICBzaG93Z3JpZD0iZmFsc2UiCiAgICAgaW5rc2NhcGU6d2luZG93LXdpZHRoPSIxOTIwIgogICAgIGlua3NjYXBlOndpbmRvdy1oZWlnaHQ9IjEwNDMiCiAgICAgaW5rc2NhcGU6d2luZG93LXg9IjE5MjAiCiAgICAgaW5rc2NhcGU6d2luZG93LXk9IjAiCiAgICAgaW5rc2NhcGU6d2luZG93LW1heGltaXplZD0iMSIgLz4KICA8bWV0YWRhdGEKICAgICBpZD0ibWV0YWRhdGE1Ij4KICAgIDxyZGY6UkRGPgogICAgICA8Y2M6V29yawogICAgICAgICByZGY6YWJvdXQ9IiI+CiAgICAgICAgPGRjOmZvcm1hdD5pbWFnZS9zdmcreG1sPC9kYzpmb3JtYXQ+CiAgICAgICAgPGRjOnR5cGUKICAgICAgICAgICByZGY6cmVzb3VyY2U9Imh0dHA6Ly9wdXJsLm9yZy9kYy9kY21pdHlwZS9TdGlsbEltYWdlIiAvPgogICAgICAgIDxkYzp0aXRsZSAvPgogICAgICA8L2NjOldvcms+CiAgICA8L3JkZjpSREY+CiAgPC9tZXRhZGF0YT4KICA8cGF0aAogICAgIGlua3NjYXBlOmxhYmVsPSJCb3JkZXIiCiAgICAgaW5rc2NhcGU6Y29ubmVjdG9yLWN1cnZhdHVyZT0iMCIKICAgICBpZD0icGF0aDQ1NjYiCiAgICAgZD0iTSAwLDAuNTM0NTQgQyAxLjAwNzQwOTZlLTgsMzIuMzU2MzYgMCw2NC4xNzgxOCAwLDk2IGMgNDIuNjY2NjY1LDAgODUuMzMzMzI5LDAgMTI4LDAgMCwtMzIgMCwtNjQgMCwtOTYgQyA4NS4zMzMzMjksMCA0Mi42NjY2NjUsMCAwLDAgdiAwLjUzNDQxIHoiCiAgICAgc3R5bGU9ImRpc3BsYXk6aW5saW5lO2ZpbGw6IzUxNTY1ODtmaWxsLW9wYWNpdHk6MTtzdHJva2Utd2lkdGg6MC4yNjY4NzM0MiIgLz4KICA8cGF0aAogICAgIHN0eWxlPSJkaXNwbGF5OmlubGluZTtmaWxsOiMzNDM5M2Q7ZmlsbC1vcGFjaXR5OjE7c3Ryb2tlLXdpZHRoOjAuMjYyMDA3NTkiCiAgICAgZD0iTSAxLDEuNTIzNDAzOCBDIDEsMzIuNjgyMjY5IDEsNjMuODQxMTM1IDEsOTUgYyA0MS45OTk5OTgsMCA4My45OTk5OTYsMCAxMjYsMCAwLC0zMS4zMzMzMzMgMCwtNjIuNjY2NjY3IDAsLTkzLjk5OTk5OTkgLTQyLjAwMDAwNCwwIC04NC4wMDAwMDIsMCAtMTI2LDAgdiAwLjUyMzI3NjQgeiIKICAgICBpZD0icmVjdDM3MzgiCiAgICAgaW5rc2NhcGU6Y29ubmVjdG9yLWN1cnZhdHVyZT0iMCIKICAgICBpbmtzY2FwZTpsYWJlbD0iQkciIC8+CiAgPHBhdGgKICAgICBzdHlsZT0iZmlsbDojNTE1NjU4O2ZpbGwtb3BhY2l0eToxO3N0cm9rZS13aWR0aDowLjI2NDU4MzMyIgogICAgIGQ9Im0gNDUuOTk5Nzc1LDIzLjUwMDEwNiBjIC0xNi44OTcsMCAtMzAuNDk5OTQ2LDEzLjYwMjk0NyAtMzAuNDk5OTQ2LDMwLjQ5OTk0NyAwLDE2Ljg5Njk5OCAxMy42MDI5NDYsMzAuNDk5OTQ3IDMwLjQ5OTk0NiwzMC40OTk5NDcgNi43NDM2NjYsMCAxMi45NjE1MDYsLTIuMTY4NTM4IDE4LjAwMDQ1MSwtNS44NDY2NzIgQyA2OS4wMzkxMTUsODIuMzMxMzExIDc1LjI1NjY0OCw4NC41IDgyLjAwMDE2Myw4NC41IGMgMTYuODk2OTk4LDAgMzAuNDk5OTQ3LC0xMy42MDI5NDkgMzAuNDk5OTQ3LC0zMC40OTk5NDcgMCwtMTYuODk3IC0xMy42MDI5NDksLTMwLjQ5OTk0NyAtMzAuNDk5OTQ3LC0zMC40OTk5NDcgLTYuNzQzNTE1LDAgLTEyLjk2MTA0OCwyLjE2ODE3MSAtMTcuOTk5OTM3LDUuODQ2MTU1IC01LjAzODk0NSwtMy42NzgxMzQgLTExLjI1Njc4NSwtNS44NDYxNTUgLTE4LjAwMDQ1MSwtNS44NDYxNTUgeiIKICAgICBpZD0icmVjdDQ1OTQiCiAgICAgaW5rc2NhcGU6bGFiZWw9IlNldEJHIgogICAgIGlua3NjYXBlOmNvbm5lY3Rvci1jdXJ2YXR1cmU9IjAiIC8+CiAgPHBhdGgKICAgICBpbmtzY2FwZTpjb25uZWN0b3ItY3VydmF0dXJlPSIwIgogICAgIGlkPSJyZWN0NDY1NyIKICAgICBkPSJtIDQ1Ljk5OTc3NSwyMy40OTk4NTcgYyAtMTYuODk3LDAgLTMwLjQ5OTk0NiwxMy42MDI5NDYgLTMwLjQ5OTk0NiwzMC40OTk5NDcgMCwxNi44OTcwMDEgMTMuNjAyOTQ2LDMwLjQ5OTk0NyAzMC40OTk5NDYsMzAuNDk5OTQ3IDYuNzQzNjY2LDAgMTIuOTYxNTA2LC0yLjE2ODAyMyAxOC4wMDA0NTEsLTUuODQ2MTU0IEMgNTYuNDEzMzQxLDczLjExNTc3OCA1MS41MDAyMTQsNjQuMTUzMjkgNTEuNTAwMjE0LDUzLjk5OTgwNCBjIDAsLTEwLjE1MzQ4NiA0LjkxMzEyNywtMTkuMTE1NDU4IDEyLjUwMDAxMiwtMjQuNjUzMjc0IC01LjAzODk0NSwtMy42NzgxMzQgLTExLjI1Njc4NSwtNS44NDY2NzMgLTE4LjAwMDQ1MSwtNS44NDY2NzMgeiIKICAgICBzdHlsZT0iZmlsbDojZmYwMDAwO2ZpbGwtb3BhY2l0eToxO3N0cm9rZS13aWR0aDowLjI2NDU4MzMyIgogICAgIGlua3NjYXBlOmxhYmVsPSJDb21wbGVtZW50IiAvPgogIDxwYXRoCiAgICAgc3R5bGU9ImZpbGw6I2RkZTVlODtmaWxsLW9wYWNpdHk6MTtzdHJva2Utd2lkdGg6MC4yMzM0MTQyOSIKICAgICBkPSJNIDQ1Ljk5OTc3NSwyMy4wMDAxNjcgQSAzMC45OTk5OTgsMzAuOTk5OTk4IDAgMCAwIDE1LjAwMDExOCw1NC4wMDAzNDMgMzAuOTk5OTk4LDMwLjk5OTk5OCAwIDAgMCA0NS45OTk3NzUsODUgMzAuOTk5OTk4LDMwLjk5OTk5OCAwIDAgMCA2NC4wMTE1OTUsNzkuMTk5MzIgMzAuOTk5OTk4LDMwLjk5OTk5OCAwIDAgMCA4MS45OTk2NDQsODUgMzAuOTk5OTk4LDMwLjk5OTk5OCAwIDAgMCAxMTIuOTk5ODIsNTQuMDAwMzQzIDMwLjk5OTk5OCwzMC45OTk5OTggMCAwIDAgODEuOTk5NjQ0LDIzLjAwMDE2NyAzMC45OTk5OTgsMzAuOTk5OTk4IDAgMCAwIDYzLjk4ODM0MSwyOC44MDAzMzEgMzAuOTk5OTk4LDMwLjk5OTk5OCAwIDAgMCA0NS45OTk3NzUsMjMuMDAwMTY3IFogbSAwLDAuOTk5OTM5IEEgMzAsMzAgMCAwIDEgNjMuMTc0OTUzLDI5LjQxODg5OCAzMC45OTk5OTgsMzAuOTk5OTk4IDAgMCAwIDUwLjk5OTk4Nyw1NC4wMDAzNDMgMzAuOTk5OTk4LDMwLjk5OTk5OCAwIDAgMCA2My4xNDE4OCw3OC41NzcxMzYgMzAsMzAgMCAwIDEgNDUuOTk5Nzc1LDg0LjAwMDA2IDMwLDMwIDAgMCAxIDE2LjAwMDA1Nyw1NC4wMDAzNDMgMzAsMzAgMCAwIDEgNDUuOTk5Nzc1LDI0LjAwMDEwNiBaIG0gMzUuOTk5ODY5LDAgQSAzMCwzMCAwIDAgMSAxMTEuOTk5ODgsNTQuMDAwMzQzIDMwLDMwIDAgMCAxIDgxLjk5OTY0NCw4NC4wMDAwNiAzMCwzMCAwIDAgMSA2NC44MjQ5ODIsNzguNTgwNzUzIDMwLjk5OTk5OCwzMC45OTk5OTggMCAwIDAgNzYuOTk5OTUxLDU0LjAwMDM0MyAzMC45OTk5OTgsMzAuOTk5OTk4IDAgMCAwIDY0Ljg1ODU3NCwyOS40MjMwMzEgMzAsMzAgMCAwIDEgODEuOTk5NjQ0LDI0LjAwMDEwNiBaIE0gNjMuOTkzNTA4LDMwLjA0MTU5NyBBIDMwLDMwIDAgMCAxIDc2LjAwMDAxMSw1NC4wMDAzNDMgMzAsMzAgMCAwIDEgNjQuMDA2NDI4LDc3Ljk1OTA4NiAzMCwzMCAwIDAgMSA1MS45OTk5MjcsNTQuMDAwMzQzIDMwLDMwIDAgMCAxIDYzLjk5MzUwOCwzMC4wNDE1OTcgWiIKICAgICBpZD0iZWxsaXBzZTQ1NzIiCiAgICAgaW5rc2NhcGU6bGFiZWw9IlNldEJvcmRlciIKICAgICBpbmtzY2FwZTpjb25uZWN0b3ItY3VydmF0dXJlPSIwIiAvPgogIDx0ZXh0CiAgICAgeG1sOnNwYWNlPSJwcmVzZXJ2ZSIKICAgICBzdHlsZT0iZm9udC1zdHlsZTpub3JtYWw7Zm9udC13ZWlnaHQ6bm9ybWFsO2ZvbnQtc2l6ZToxMC41ODMzMzMwMnB4O2xpbmUtaGVpZ2h0OjEuMjU7Zm9udC1mYW1pbHk6c2Fucy1zZXJpZjtsZXR0ZXItc3BhY2luZzowcHg7d29yZC1zcGFjaW5nOjBweDtmaWxsOiNmZmZmZmY7ZmlsbC1vcGFjaXR5OjE7c3Ryb2tlOm5vbmU7c3Ryb2tlLXdpZHRoOjAuMjY0NTgzMzIiCiAgICAgeD0iMTAuODY3NzA4IgogICAgIHk9IjIxIgogICAgIGlkPSJ0ZXh0ODM0IgogICAgIGlua3NjYXBlOmxhYmVsPSJBIj48dHNwYW4KICAgICAgIHNvZGlwb2RpOnJvbGU9ImxpbmUiCiAgICAgICB4PSIxMC44Njc3MDgiCiAgICAgICB5PSIyMSIKICAgICAgIGlkPSJ0c3BhbjgzMiIKICAgICAgIHN0eWxlPSJzdHJva2Utd2lkdGg6MC4yNjQ1ODMzMiI+PHRzcGFuCiAgICAgICAgIHg9IjEwLjg2NzcwOCIKICAgICAgICAgeT0iMjEiCiAgICAgICAgIHN0eWxlPSJmb250LXNpemU6MTYuOTMzMzMyNDRweDtmaWxsOiNmZmZmZmY7ZmlsbC1vcGFjaXR5OjE7c3Ryb2tlLXdpZHRoOjAuMjY0NTgzMzIiCiAgICAgICAgIGlkPSJ0c3BhbjgzMCI+QTwvdHNwYW4+PC90c3Bhbj48L3RleHQ+CiAgPHRleHQKICAgICB4bWw6c3BhY2U9InByZXNlcnZlIgogICAgIHN0eWxlPSJmb250LXN0eWxlOm5vcm1hbDtmb250LXdlaWdodDpub3JtYWw7Zm9udC1zaXplOjEwLjU4MzMwMDU5cHg7bGluZS1oZWlnaHQ6MS4yNTtmb250LWZhbWlseTpzYW5zLXNlcmlmO2xldHRlci1zcGFjaW5nOjBweDt3b3JkLXNwYWNpbmc6MHB4O2ZpbGw6I2ZmZmZmZjtmaWxsLW9wYWNpdHk6MTtzdHJva2U6bm9uZTtzdHJva2Utd2lkdGg6MC4yNjQ1ODI1MSIKICAgICB4PSIxMDUuMDUyNDIiCiAgICAgeT0iMjAuOTk5OTM1IgogICAgIGlkPSJ0ZXh0ODI4IgogICAgIHRyYW5zZm9ybT0ic2NhbGUoMC45OTk5OTY4OCwxLjAwMDAwMzEpIgogICAgIGlua3NjYXBlOmxhYmVsPSJCIj48dHNwYW4KICAgICAgIHNvZGlwb2RpOnJvbGU9ImxpbmUiCiAgICAgICB4PSIxMDUuMDUyNDIiCiAgICAgICB5PSIyMC45OTk5MzUiCiAgICAgICBpZD0idHNwYW44MjYiCiAgICAgICBzdHlsZT0ic3Ryb2tlLXdpZHRoOjAuMjY0NTgyNTEiPjx0c3BhbgogICAgICAgICB4PSIxMDUuMDUyNDIiCiAgICAgICAgIHk9IjIwLjk5OTkzNSIKICAgICAgICAgc3R5bGU9ImZvbnQtc2l6ZToxNi45MzMyODA5NHB4O2ZpbGw6I2ZmZmZmZjtmaWxsLW9wYWNpdHk6MTtzdHJva2Utd2lkdGg6MC4yNjQ1ODI1MSIKICAgICAgICAgaWQ9InRzcGFuODI0Ij5CPC90c3Bhbj48L3RzcGFuPjwvdGV4dD4KPC9zdmc+Cg=="
	 * width="128"/>
	 * 
	 * @param setA
	 * @param setB
	 *            The sorted subset to be excluded from the result.
	 * @return The complement
	 */
	public static int[] complement(int[] setA, int[] setB)
	{
		int[]	buffer	= new int[setA.length];
		int		size	= 0;
		for (int i0 = 0; i0 < setA.length; i0++)
		{
			int v0 = setA[i0];
			if (Arrays.binarySearch(setB, v0) < 0)
			{
				buffer[size++] = v0;
			}
		}
		return Arrays.copyOf(buffer, size);
	}
	
	/**
	 * Creates a new array containing all the elements only contained in A and B but
	 * not both. </br>
	 * <img src=
	 * "data:image/svg+xml;base64,PD94bWwgdmVyc2lvbj0iMS4wIiBlbmNvZGluZz0iVVRGLTgiIHN0YW5kYWxvbmU9Im5vIj8+CjwhLS0gQ3JlYXRlZCB3aXRoIElua3NjYXBlIChodHRwOi8vd3d3Lmlua3NjYXBlLm9yZy8pIC0tPgoKPHN2ZwogICB4bWxuczpkYz0iaHR0cDovL3B1cmwub3JnL2RjL2VsZW1lbnRzLzEuMS8iCiAgIHhtbG5zOmNjPSJodHRwOi8vY3JlYXRpdmVjb21tb25zLm9yZy9ucyMiCiAgIHhtbG5zOnJkZj0iaHR0cDovL3d3dy53My5vcmcvMTk5OS8wMi8yMi1yZGYtc3ludGF4LW5zIyIKICAgeG1sbnM6c3ZnPSJodHRwOi8vd3d3LnczLm9yZy8yMDAwL3N2ZyIKICAgeG1sbnM9Imh0dHA6Ly93d3cudzMub3JnLzIwMDAvc3ZnIgogICB4bWxuczpzb2RpcG9kaT0iaHR0cDovL3NvZGlwb2RpLnNvdXJjZWZvcmdlLm5ldC9EVEQvc29kaXBvZGktMC5kdGQiCiAgIHhtbG5zOmlua3NjYXBlPSJodHRwOi8vd3d3Lmlua3NjYXBlLm9yZy9uYW1lc3BhY2VzL2lua3NjYXBlIgogICB3aWR0aD0iMTI4bW0iCiAgIGhlaWdodD0iOTZtbSIKICAgdmlld0JveD0iMCAwIDEyOCA5NiIKICAgdmVyc2lvbj0iMS4xIgogICBpZD0ic3ZnOCIKICAgaW5rc2NhcGU6dmVyc2lvbj0iMC45Mi41ICgyMDYwZWMxZjlmLCAyMDIwLTA0LTA4KSIKICAgc29kaXBvZGk6ZG9jbmFtZT0iU3ltbWV0cmljLURpZmZlcmVuY2Uuc3ZnIj4KICA8ZGVmcwogICAgIGlkPSJkZWZzMiIgLz4KICA8c29kaXBvZGk6bmFtZWR2aWV3CiAgICAgaWQ9ImJhc2UiCiAgICAgcGFnZWNvbG9yPSIjMzQzOTNkIgogICAgIGJvcmRlcmNvbG9yPSIjZmZmZmZmIgogICAgIGJvcmRlcm9wYWNpdHk9IjEiCiAgICAgaW5rc2NhcGU6cGFnZW9wYWNpdHk9IjEiCiAgICAgaW5rc2NhcGU6cGFnZXNoYWRvdz0iMiIKICAgICBpbmtzY2FwZTp6b29tPSIxLjk3OTg5OSIKICAgICBpbmtzY2FwZTpjeD0iMTUyLjgwMjQyIgogICAgIGlua3NjYXBlOmN5PSIxNzguODAxOTEiCiAgICAgaW5rc2NhcGU6ZG9jdW1lbnQtdW5pdHM9Im1tIgogICAgIGlua3NjYXBlOmN1cnJlbnQtbGF5ZXI9InN2ZzgiCiAgICAgc2hvd2dyaWQ9ImZhbHNlIgogICAgIGlua3NjYXBlOndpbmRvdy13aWR0aD0iMTkyMCIKICAgICBpbmtzY2FwZTp3aW5kb3ctaGVpZ2h0PSIxMDQzIgogICAgIGlua3NjYXBlOndpbmRvdy14PSIxOTIwIgogICAgIGlua3NjYXBlOndpbmRvdy15PSIwIgogICAgIGlua3NjYXBlOndpbmRvdy1tYXhpbWl6ZWQ9IjEiIC8+CiAgPG1ldGFkYXRhCiAgICAgaWQ9Im1ldGFkYXRhNSI+CiAgICA8cmRmOlJERj4KICAgICAgPGNjOldvcmsKICAgICAgICAgcmRmOmFib3V0PSIiPgogICAgICAgIDxkYzpmb3JtYXQ+aW1hZ2Uvc3ZnK3htbDwvZGM6Zm9ybWF0PgogICAgICAgIDxkYzp0eXBlCiAgICAgICAgICAgcmRmOnJlc291cmNlPSJodHRwOi8vcHVybC5vcmcvZGMvZGNtaXR5cGUvU3RpbGxJbWFnZSIgLz4KICAgICAgICA8ZGM6dGl0bGU+PC9kYzp0aXRsZT4KICAgICAgPC9jYzpXb3JrPgogICAgPC9yZGY6UkRGPgogIDwvbWV0YWRhdGE+CiAgPHBhdGgKICAgICBpbmtzY2FwZTpsYWJlbD0iQm9yZGVyIgogICAgIGlua3NjYXBlOmNvbm5lY3Rvci1jdXJ2YXR1cmU9IjAiCiAgICAgaWQ9InBhdGg0NTY2IgogICAgIGQ9Ik0gMCwwLjUzNDU0IEMgMS4wMDc0MDk2ZS04LDMyLjM1NjM2IDAsNjQuMTc4MTggMCw5NiBjIDQyLjY2NjY2NSwwIDg1LjMzMzMyOSwwIDEyOCwwIDAsLTMyIDAsLTY0IDAsLTk2IEMgODUuMzMzMzI5LDAgNDIuNjY2NjY1LDAgMCwwIHYgMC41MzQ0MSB6IgogICAgIHN0eWxlPSJkaXNwbGF5OmlubGluZTtmaWxsOiM1MTU2NTg7ZmlsbC1vcGFjaXR5OjE7c3Ryb2tlLXdpZHRoOjAuMjY2ODczNDIiIC8+CiAgPHBhdGgKICAgICBzdHlsZT0iZGlzcGxheTppbmxpbmU7ZmlsbDojMzQzOTNkO2ZpbGwtb3BhY2l0eToxO3N0cm9rZS13aWR0aDowLjI2MjAwNzU5IgogICAgIGQ9Ik0gMSwxLjUyMzQwMzggQyAxLDMyLjY4MjI2OSAxLDYzLjg0MTEzNSAxLDk1IGMgNDEuOTk5OTk4LDAgODMuOTk5OTk2LDAgMTI2LDAgMCwtMzEuMzMzMzMzIDAsLTYyLjY2NjY2NyAwLC05My45OTk5OTk5IC00Mi4wMDAwMDQsMCAtODQuMDAwMDAyLDAgLTEyNiwwIHYgMC41MjMyNzY0IHoiCiAgICAgaWQ9InJlY3QzNzM4IgogICAgIGlua3NjYXBlOmNvbm5lY3Rvci1jdXJ2YXR1cmU9IjAiCiAgICAgaW5rc2NhcGU6bGFiZWw9IkJHIiAvPgogIDxwYXRoCiAgICAgc3R5bGU9ImZpbGw6IzUxNTY1ODtmaWxsLW9wYWNpdHk6MTtzdHJva2Utd2lkdGg6MC4yNjQ1ODMzMiIKICAgICBkPSJtIDQ1Ljk5OTc3NSwyMy41MDAxMDYgYyAtMTYuODk3LDAgLTMwLjQ5OTk0NiwxMy42MDI5NDcgLTMwLjQ5OTk0NiwzMC40OTk5NDcgMCwxNi44OTY5OTggMTMuNjAyOTQ2LDMwLjQ5OTk0NyAzMC40OTk5NDYsMzAuNDk5OTQ3IDYuNzQzNjY2LDAgMTIuOTYxNTA2LC0yLjE2ODUzOCAxOC4wMDA0NTEsLTUuODQ2NjcyIEMgNjkuMDM5MTE1LDgyLjMzMTMxMSA3NS4yNTY2NDgsODQuNSA4Mi4wMDAxNjMsODQuNSBjIDE2Ljg5Njk5OCwwIDMwLjQ5OTk0NywtMTMuNjAyOTQ5IDMwLjQ5OTk0NywtMzAuNDk5OTQ3IDAsLTE2Ljg5NyAtMTMuNjAyOTQ5LC0zMC40OTk5NDcgLTMwLjQ5OTk0NywtMzAuNDk5OTQ3IC02Ljc0MzUxNSwwIC0xMi45NjEwNDgsMi4xNjgxNzEgLTE3Ljk5OTkzNyw1Ljg0NjE1NSAtNS4wMzg5NDUsLTMuNjc4MTM0IC0xMS4yNTY3ODUsLTUuODQ2MTU1IC0xOC4wMDA0NTEsLTUuODQ2MTU1IHoiCiAgICAgaWQ9InJlY3Q0NTk0IgogICAgIGlua3NjYXBlOmxhYmVsPSJTZXRCRyIKICAgICBpbmtzY2FwZTpjb25uZWN0b3ItY3VydmF0dXJlPSIwIiAvPgogIDxwYXRoCiAgICAgaW5rc2NhcGU6Y29ubmVjdG9yLWN1cnZhdHVyZT0iMCIKICAgICBpZD0icmVjdDQ2NTUiCiAgICAgZD0ibSA0NS45OTk3NzUsMjMuNDk5ODU3IGMgLTE2Ljg5NywwIC0zMC40OTk5NDYsMTMuNjAyOTQ2IC0zMC40OTk5NDYsMzAuNDk5OTQ3IDAsMTYuODk3MDAxIDEzLjYwMjk0NiwzMC40OTk5NDcgMzAuNDk5OTQ2LDMwLjQ5OTk0NyA2Ljc0MzY2NiwwIDEyLjk2MTUwNiwtMi4xNjgwMjMgMTguMDAwNDUxLC01Ljg0NjE1NCBDIDU2LjQxMzM0MSw3My4xMTU3NzggNTEuNTAwMjE0LDY0LjE1MzI5IDUxLjUwMDIxNCw1My45OTk4MDQgYyAwLC0xMC4xNTM0ODYgNC45MTMxMjcsLTE5LjExNTQ1OCAxMi41MDAwMTIsLTI0LjY1MzI3NCAtNS4wMzg5NDUsLTMuNjc4MTM0IC0xMS4yNTY3ODUsLTUuODQ2NjczIC0xOC4wMDA0NTEsLTUuODQ2NjczIHogbSAxOC4wMDA0NTEsNS44NDY2NzMgYyA3LjU4NjY5NCw1LjUzNzgzNSAxMi41MDAwMTQsMTQuNDk5OTM5IDEyLjUwMDAxNCwyNC42NTMyNzQgMCwxMC4xNTMzMzUgLTQuOTEzMzIsMTkuMTE1OTU1IC0xMi41MDAwMTQsMjQuNjUzNzkzIDUuMDM4ODg5LDMuNjc3OTgzIDExLjI1NjQyMiw1Ljg0NjE1NCAxNy45OTk5MzcsNS44NDYxNTQgMTYuODk2OTk4LDAgMzAuNDk5OTQ3LC0xMy42MDI5NDYgMzAuNDk5OTQ3LC0zMC40OTk5NDcgMCwtMTYuODk3MDAxIC0xMy42MDI5NDksLTMwLjQ5OTk0NyAtMzAuNDk5OTQ3LC0zMC40OTk5NDcgLTYuNzQzNTE1LDAgLTEyLjk2MTA0OCwyLjE2ODY4OCAtMTcuOTk5OTM3LDUuODQ2NjczIHoiCiAgICAgc3R5bGU9ImZpbGw6I2ZmMDAwMDtmaWxsLW9wYWNpdHk6MTtzdHJva2Utd2lkdGg6MC4yNjQ1ODMzMiIKICAgICBpbmtzY2FwZTpsYWJlbD0iU3ltRGlmZiIgLz4KICA8cGF0aAogICAgIHN0eWxlPSJmaWxsOiNkZGU1ZTg7ZmlsbC1vcGFjaXR5OjE7c3Ryb2tlLXdpZHRoOjAuMjMzNDE0MjkiCiAgICAgZD0iTSA0NS45OTk3NzUsMjMuMDAwMTY3IEEgMzAuOTk5OTk4LDMwLjk5OTk5OCAwIDAgMCAxNS4wMDAxMTgsNTQuMDAwMzQzIDMwLjk5OTk5OCwzMC45OTk5OTggMCAwIDAgNDUuOTk5Nzc1LDg1IDMwLjk5OTk5OCwzMC45OTk5OTggMCAwIDAgNjQuMDExNTk1LDc5LjE5OTMyIDMwLjk5OTk5OCwzMC45OTk5OTggMCAwIDAgODEuOTk5NjQ0LDg1IDMwLjk5OTk5OCwzMC45OTk5OTggMCAwIDAgMTEyLjk5OTgyLDU0LjAwMDM0MyAzMC45OTk5OTgsMzAuOTk5OTk4IDAgMCAwIDgxLjk5OTY0NCwyMy4wMDAxNjcgMzAuOTk5OTk4LDMwLjk5OTk5OCAwIDAgMCA2My45ODgzNDEsMjguODAwMzMxIDMwLjk5OTk5OCwzMC45OTk5OTggMCAwIDAgNDUuOTk5Nzc1LDIzLjAwMDE2NyBaIG0gMCwwLjk5OTkzOSBBIDMwLDMwIDAgMCAxIDYzLjE3NDk1MywyOS40MTg4OTggMzAuOTk5OTk4LDMwLjk5OTk5OCAwIDAgMCA1MC45OTk5ODcsNTQuMDAwMzQzIDMwLjk5OTk5OCwzMC45OTk5OTggMCAwIDAgNjMuMTQxODgsNzguNTc3MTM2IDMwLDMwIDAgMCAxIDQ1Ljk5OTc3NSw4NC4wMDAwNiAzMCwzMCAwIDAgMSAxNi4wMDAwNTcsNTQuMDAwMzQzIDMwLDMwIDAgMCAxIDQ1Ljk5OTc3NSwyNC4wMDAxMDYgWiBtIDM1Ljk5OTg2OSwwIEEgMzAsMzAgMCAwIDEgMTExLjk5OTg4LDU0LjAwMDM0MyAzMCwzMCAwIDAgMSA4MS45OTk2NDQsODQuMDAwMDYgMzAsMzAgMCAwIDEgNjQuODI0OTgyLDc4LjU4MDc1MyAzMC45OTk5OTgsMzAuOTk5OTk4IDAgMCAwIDc2Ljk5OTk1MSw1NC4wMDAzNDMgMzAuOTk5OTk4LDMwLjk5OTk5OCAwIDAgMCA2NC44NTg1NzQsMjkuNDIzMDMxIDMwLDMwIDAgMCAxIDgxLjk5OTY0NCwyNC4wMDAxMDYgWiBNIDYzLjk5MzUwOCwzMC4wNDE1OTcgQSAzMCwzMCAwIDAgMSA3Ni4wMDAwMTEsNTQuMDAwMzQzIDMwLDMwIDAgMCAxIDY0LjAwNjQyOCw3Ny45NTkwODYgMzAsMzAgMCAwIDEgNTEuOTk5OTI3LDU0LjAwMDM0MyAzMCwzMCAwIDAgMSA2My45OTM1MDgsMzAuMDQxNTk3IFoiCiAgICAgaWQ9ImVsbGlwc2U0NTcyIgogICAgIGlua3NjYXBlOmxhYmVsPSJTZXRCb3JkZXIiCiAgICAgaW5rc2NhcGU6Y29ubmVjdG9yLWN1cnZhdHVyZT0iMCIgLz4KICA8dGV4dAogICAgIHhtbDpzcGFjZT0icHJlc2VydmUiCiAgICAgc3R5bGU9ImZvbnQtc3R5bGU6bm9ybWFsO2ZvbnQtd2VpZ2h0Om5vcm1hbDtmb250LXNpemU6MTAuNTgzMzMzMDJweDtsaW5lLWhlaWdodDoxLjI1O2ZvbnQtZmFtaWx5OnNhbnMtc2VyaWY7bGV0dGVyLXNwYWNpbmc6MHB4O3dvcmQtc3BhY2luZzowcHg7ZmlsbDojZmZmZmZmO2ZpbGwtb3BhY2l0eToxO3N0cm9rZTpub25lO3N0cm9rZS13aWR0aDowLjI2NDU4MzMyIgogICAgIHg9IjEwLjg2NzcwOCIKICAgICB5PSIyMSIKICAgICBpZD0idGV4dDg0NSIKICAgICBpbmtzY2FwZTpsYWJlbD0iQSI+PHRzcGFuCiAgICAgICBzb2RpcG9kaTpyb2xlPSJsaW5lIgogICAgICAgeD0iMTAuODY3NzA4IgogICAgICAgeT0iMjEiCiAgICAgICBpZD0idHNwYW44NDMiCiAgICAgICBzdHlsZT0ic3Ryb2tlLXdpZHRoOjAuMjY0NTgzMzIiPjx0c3BhbgogICAgICAgICB4PSIxMC44Njc3MDgiCiAgICAgICAgIHk9IjIxIgogICAgICAgICBzdHlsZT0iZm9udC1zaXplOjE2LjkzMzMzMjQ0cHg7ZmlsbDojZmZmZmZmO2ZpbGwtb3BhY2l0eToxO3N0cm9rZS13aWR0aDowLjI2NDU4MzMyIgogICAgICAgICBpZD0idHNwYW44NDEiPkE8L3RzcGFuPjwvdHNwYW4+PC90ZXh0PgogIDx0ZXh0CiAgICAgeG1sOnNwYWNlPSJwcmVzZXJ2ZSIKICAgICBzdHlsZT0iZm9udC1zdHlsZTpub3JtYWw7Zm9udC13ZWlnaHQ6bm9ybWFsO2ZvbnQtc2l6ZToxMC41ODMzMDA1OXB4O2xpbmUtaGVpZ2h0OjEuMjU7Zm9udC1mYW1pbHk6c2Fucy1zZXJpZjtsZXR0ZXItc3BhY2luZzowcHg7d29yZC1zcGFjaW5nOjBweDtmaWxsOiNmZmZmZmY7ZmlsbC1vcGFjaXR5OjE7c3Ryb2tlOm5vbmU7c3Ryb2tlLXdpZHRoOjAuMjY0NTgyNTEiCiAgICAgeD0iMTA1LjA1MjQyIgogICAgIHk9IjIwLjk5OTkzNSIKICAgICBpZD0idGV4dDg1MSIKICAgICB0cmFuc2Zvcm09InNjYWxlKDAuOTk5OTk2ODgsMS4wMDAwMDMxKSIKICAgICBpbmtzY2FwZTpsYWJlbD0iQiI+PHRzcGFuCiAgICAgICBzb2RpcG9kaTpyb2xlPSJsaW5lIgogICAgICAgeD0iMTA1LjA1MjQyIgogICAgICAgeT0iMjAuOTk5OTM1IgogICAgICAgaWQ9InRzcGFuODQ5IgogICAgICAgc3R5bGU9InN0cm9rZS13aWR0aDowLjI2NDU4MjUxIj48dHNwYW4KICAgICAgICAgeD0iMTA1LjA1MjQyIgogICAgICAgICB5PSIyMC45OTk5MzUiCiAgICAgICAgIHN0eWxlPSJmb250LXNpemU6MTYuOTMzMjgwOTRweDtmaWxsOiNmZmZmZmY7ZmlsbC1vcGFjaXR5OjE7c3Ryb2tlLXdpZHRoOjAuMjY0NTgyNTEiCiAgICAgICAgIGlkPSJ0c3Bhbjg0NyI+QjwvdHNwYW4+PC90c3Bhbj48L3RleHQ+Cjwvc3ZnPgo="
	 * width="128"/>
	 * 
	 * @param setA
	 * @param setB
	 * @return The symmetricDifference
	 */
	public static int[] symmetricDifference(int[] setA, int[] setB)
	{
		int[]	comp0	= complement(setA, setB);
		int[]	comp1	= complement(setB, setA);
		return unionSortedDistinct(comp0, comp1);
	}
}