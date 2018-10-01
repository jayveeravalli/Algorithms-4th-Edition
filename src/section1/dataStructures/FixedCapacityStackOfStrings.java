package section1.dataStructures;

import java.util.Iterator;

public class FixedCapacityStackOfStrings implements Iterable<String>{
	
	private int n;
	private String[] stack;
	
	public FixedCapacityStackOfStrings(int size) {
		this.stack = new String[size];
		this.n = 0;
	}
	
	public boolean isEmpty() {
		return this.n == 0;
	}
	
	public int size() {
		return n;
	}
	
	public void push(String string) {
		this.stack[n++] = string;
	}
	
	public String pop() {
		return this.stack[--n];
	}

	@Override
	public Iterator<String> iterator() {
		return new StringIterator();
	}
	
	private class StringIterator implements Iterator<String>{
		
		private int i = n-1;

		@Override
		public boolean hasNext() {
			return i >= 0;
		}

		@Override
		public String next() {
			return stack[i--];
		}
		
	}

}
