package section1;

import section1.dataStructures.FixedCapacityStack;
import section1.dataStructures.LinkedStack;

public class Test_FixedStack {

	public static void main(String[] args) {
		LinkedStack<String> stack1 = new LinkedStack<>();
		System.out.println(stack1.isEmpty());
		stack1.push("it");
		stack1.push("was");
		stack1.push("-");
		stack1.push("the");
		stack1.push("best");
		stack1.push("-");
		stack1.push("of");
		stack1.push("times");
		stack1.push("-");
		stack1.push("-");
		stack1.push("-");
		stack1.push("it");
		stack1.push("was");
		stack1.push("-");
		stack1.push("the");
		stack1.push("-");
		stack1.push("-");
		
		for(String s : stack1) {
			System.out.println(s);
		}
		System.out.println(stack1.size());
		System.out.println(stack1.isEmpty());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.pop());
		System.out.println(stack1.isEmpty());
		
		FixedCapacityStack<Integer> stack2 = new FixedCapacityStack<>(3);
		stack2.push(1);
		stack2.push(2);
		stack2.push(3);
		System.out.println(stack2.size());
		FixedCapacityStack<Double> stack3 = new FixedCapacityStack<>(3);
		stack3.push(1.0);
		stack3.push(2.0);
		stack3.push(3.0);
		System.out.println(stack3.size());
	}

}
