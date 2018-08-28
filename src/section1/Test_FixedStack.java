package section1;

public class Test_FixedStack {

	public static void main(String[] args) {
		FixedCapacityStackOfStrings stack1 = new FixedCapacityStackOfStrings(3);
		System.out.println(stack1.isEmpty());
		stack1.push("a");
		stack1.push("b");
		stack1.push("c");
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
