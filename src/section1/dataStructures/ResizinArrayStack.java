package section1.dataStructures;

import java.util.Iterator;

public class ResizinArrayStack<T> implements Iterable<T>{
	
	private T[] stack = (T[]) new Object[1];
	private int n = 0;
	
	public boolean isEmpty() {
		return n == 0;
	}
	
	public int size() {
		return n;
	}
	
	public void push(T t) {
		if(n == stack.length) {
			resize(2*stack.length);
		} 
		stack[n++] = t;
	}
	
	public T pop() {
		T item = stack[--n];
		stack[n] = null;
		if(n>0 && n == stack.length/4) {
			resize(stack.length/2);
		}
		return item;
	}
	
	private void resize(int newSize) {
		T[] temp = (T[]) new Object[newSize];
		for(int i = 0; i < n; i++) {
			temp[i] = stack[i];
		}
		stack = temp;
	}

	@Override
	public Iterator<T> iterator() {
		return new ReverseArrayIterator();
	}
	
	class ReverseArrayIterator implements Iterator<T>{
		
		private int i = n-1;
		
		@Override
		public boolean hasNext() {
			return i >= 0;
		}

		@Override
		public T next() {
			return stack[i--];
		}
		
	}

}
