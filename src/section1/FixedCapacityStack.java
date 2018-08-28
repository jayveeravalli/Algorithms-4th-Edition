package section1;

public class FixedCapacityStack<T> {
	
	private T[] stack;
	private int n;
	
	public FixedCapacityStack(int size) {
		this.stack = (T[]) new Object[size];
		this.n = 0;
	}
	
	public boolean isEmpty() {
		return this.n == 0;
	}
	
	public int size() {
		return this.n;
	}
	
	public void push(T t) {
		this.stack[n++] = t;
	}
	
	public T pop() {
		return stack[--n];
	}

}
