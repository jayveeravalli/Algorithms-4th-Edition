package section1;

import section1.dataStructures.LinkedStack;

public class TestLinkedStack {
	
	public static void main(String args[]) {
		LinkedStack<Integer> linkedStack = new LinkedStack<>();
		linkedStack.push(1);
		linkedStack.push(2);
		linkedStack.push(3);
		linkedStack.push(4);
		
		for(int i : linkedStack) {
			System.out.println(i);
		}
		
		System.out.println("-------"+linkedStack.pop());
		
		for(int i : linkedStack) {
			System.out.println(i);
		}
	}

}
