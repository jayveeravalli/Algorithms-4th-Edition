package section1;

public class FixedCapacityStackOfStrings {
	
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

}
