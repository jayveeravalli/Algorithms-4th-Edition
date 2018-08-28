package section1;

import java.util.Stack;

public class ExpressionEvaluation {

	public static void main(String args[]) {
		System.out.println(calculate("(1+((2+3)*(4*5)))"));
	}

	public static double calculate(String expression) {
		Stack<Character> opStack = new Stack<Character>();
		Stack<Double> valStack = new Stack<Double>();
		for (int i = 0; i < expression.length(); i++) {
			if (expression.charAt(i) == '(')
				;
			else if (expression.charAt(i) == '+' || expression.charAt(i) == '-' || expression.charAt(i) == '*'
					|| expression.charAt(i) == '/')
				opStack.push(expression.charAt(i));
			else if (expression.charAt(i) == ')') {
				char op = opStack.pop();
				double operand1 = valStack.pop();
				double operand2 = valStack.pop();
				if (op == '+')
					valStack.push(operand1 + operand2);
				if (op == '-')
					valStack.push(operand1 - operand2);
				if (op == '*')
					valStack.push(operand1 * operand2);
				if (op == '/')
					valStack.push(operand1 / operand2);
			} else {
				valStack.push(Double.valueOf(String.valueOf(expression.charAt(i))));
			}
		}
		return valStack.pop();
	}

}
