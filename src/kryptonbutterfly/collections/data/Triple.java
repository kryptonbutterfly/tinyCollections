package kryptonbutterfly.collections.data;

/**
 * Creates an immutable Triple containing three references.
 *
 * @param first
 * @param second
 */
public record Triple<U, V, W> (U first, V second, W third)
{
	@Override
	public String toString()
	{
		return String.format("Triple [first=%s, second=%s, third=%s]", first, second, third);
		
	}
}