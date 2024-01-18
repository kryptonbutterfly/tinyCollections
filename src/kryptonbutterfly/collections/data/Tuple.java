package kryptonbutterfly.collections.data;

/**
 * Creates an immutable Tuple containing two references.
 *
 * @param first
 * @param second
 */
public record Tuple<U, V> (U first, V second)
{
	@Override
	public String toString()
	{
		return String.format("Tuple [first=%s, second=%s]", first, second);
	}
}