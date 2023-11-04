package de.tinycodecrank.collections.range;

import java.util.Iterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import de.tinycodecrank.collections.Stack;
import de.tinycodecrank.math.utils.limit.LimitInt;
import de.tinycodecrank.math.utils.range.IRange;
import de.tinycodecrank.math.utils.range.IndexElement;
import de.tinycodecrank.math.utils.range.Range;

public class StackRange
{
	private StackRange()
	{}
	
	public static final <T> ElementIndexStackRange<T> range(Stack<T> stack)
	{
		return new ElementIndexStackRange<>(stack, Range.range(0, stack.size()));
	}
	
	public static final <T> ElementIndexStackRange<T> rRange(Stack<T> stack)
	{
		return new ElementIndexStackRange<>(stack, Range.rRange(0, stack.size()));
	}
	
	public static final <T> ElementIndexStackRange<T> range(int start, Stack<T> stack)
	{
		start = LimitInt.clamp(0, start, stack.size());
		return new ElementIndexStackRange<>(stack, Range.range(start, stack.size()));
	}
	
	public static final <T> ElementIndexStackRange<T> range(Stack<T> stack, int stop)
	{
		stop = LimitInt.clamp(0, stop, stack.size());
		return new ElementIndexStackRange<>(stack, Range.range(stop));
	}
	
	public static final class IndexStackRange<T> implements IRange<Integer, IndexStackRange<T>>
	{
		private final Stack<T>	stack;
		private final Range		range;
		
		private IndexStackRange(Stack<T> stack, Range range)
		{
			this.stack	= stack;
			this.range	= range;
		}
		
		@Override
		public Iterator<Integer> iterator()
		{
			return this.range.iterator();
		}
		
		public ElementStackRange<T> element()
		{
			return new ElementStackRange<>(stack, range);
		}
		
		public ElementIndexStackRange<T> iElem()
		{
			return new ElementIndexStackRange<>(stack, range);
		}
		
		@Override
		public IndexStackRange<T> reverse()
		{
			return new IndexStackRange<>(stack, range.reverse());
		}
		
		public Stream<Integer> stream()
		{
			return StreamSupport.stream(spliterator(), false);
		}
		
		/**
		 * @return The amount of steps this range requires to traverse or -1 if it takes
		 *         an infinite amount of steps.
		 */
		public int steps()
		{
			return this.range.steps();
		}
	}
	
	public static final class ElementStackRange<T> implements IRange<T, ElementStackRange<T>>
	{
		private final Stack<T>	stack;
		private final Range		range;
		
		private ElementStackRange(Stack<T> stack, Range range)
		{
			this.stack	= stack;
			this.range	= range;
		}
		
		@Override
		public Iterator<T> iterator()
		{
			return new Iterator<T>()
			{
				final Iterator<Integer> iterator = range.iterator();
				
				@Override
				public boolean hasNext()
				{
					return iterator.hasNext();
				}
				
				@Override
				public T next()
				{
					return stack.get(iterator.next());
				}
			};
		}
		
		public ElementIndexStackRange<T> iElem()
		{
			return new ElementIndexStackRange<>(stack, range);
		}
		
		public IndexStackRange<T> index()
		{
			return new IndexStackRange<>(stack, range);
		}
		
		@Override
		public ElementStackRange<T> reverse()
		{
			return new ElementStackRange<>(stack, range.reverse());
		}
		
		public Stream<T> stream()
		{
			return StreamSupport.stream(spliterator(), false);
		}
		
		/**
		 * @Return The amount of steps this range requires to traverse or -1 if it takes
		 *         an infinite amount of steps.
		 */
		public int steps()
		{
			return this.range.steps();
		}
	}
	
	public static final class ElementIndexStackRange<T> implements IRange<IndexElement<T>, ElementIndexStackRange<T>>
	{
		private final Stack<T>	stack;
		private final Range		range;
		
		private ElementIndexStackRange(Stack<T> stack, Range range)
		{
			this.stack	= stack;
			this.range	= range;
		}
		
		@Override
		public Iterator<IndexElement<T>> iterator()
		{
			return new Iterator<IndexElement<T>>()
			{
				final Iterator<Integer> iterator = range.iterator();
				
				@Override
				public boolean hasNext()
				{
					return iterator.hasNext();
				}
				
				@Override
				public IndexElement<T> next()
				{
					final int index = iterator.next();
					return new IndexElement<>(index, stack.get(index));
				}
			};
		}
		
		public IndexStackRange<T> index()
		{
			return new IndexStackRange<>(stack, range);
		}
		
		public ElementStackRange<T> element()
		{
			return new ElementStackRange<>(stack, range);
		}
		
		@Override
		public ElementIndexStackRange<T> reverse()
		{
			return new ElementIndexStackRange<>(stack, range.reverse());
		}
		
		public Stream<IndexElement<T>> stream()
		{
			return StreamSupport.stream(spliterator(), false);
		}
		
		/**
		 * @return The amount of steps this range requires to traverse or -1 if it takes
		 *         an infinite amount of steps.
		 */
		public int steps()
		{
			return this.range.steps();
		}
	}
}