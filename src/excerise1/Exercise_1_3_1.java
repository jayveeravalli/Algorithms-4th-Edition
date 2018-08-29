package excerise1;

public class Exercise_1_3_1 {
	
	private int n;
	private String[] stack;
	
	public Exercise_1_3_1(int size) {
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
	
	public boolean isFull() {
		return n == stack.length;
	}

}
