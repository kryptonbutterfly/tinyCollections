package kryptonbutterfly.collections.data;

public record Quad<U, V, W, X> (U first, V second, W third, X fourth)
{
	@Override
	public String toString()
	{
		return String.format("Quad [first=%s, second=%s, third=%s, fourth=%s]", first, second, third, fourth);
	}
}