package excerise1;

import java.util.Stack;

public class Exercise_1_3_9 {
	
	public static void main(String args[]) {
		System.out.println(completedExpression("1+2)*3-4)*5-6)))"));
	}
	
	public static String completedExpression(String incompleteExpression) {
		Stack<Character> operands = new Stack<Character>();
		Stack<Character> operator = new Stack<Character>() ;
		Stack<String> completed = new Stack<String>();
		
		for(int i = 0; i<incompleteExpression.length(); i++) {
			char temp = incompleteExpression.charAt(i);
			if( temp == '+' || temp == '-' || temp == '/' || temp == '*') {
				operator.push(temp);
			} else if (temp == ')'){
				if(!operands.isEmpty()) {
					char op2 = operands.pop();
					char op1 = operands.pop();
					
					String exp = "(" + op1 + operator.pop() + op2 + ")";
					completed.push(exp);
				} else { 
					String exp2 = completed.pop();
					String exp1 = completed.pop();
					
					String exp = "(" + exp1 + operator.pop() + exp2 + ")";
					completed.push(exp);
				}
			} else {
				operands.push(temp);
			}
		}
		
		while(!operator.isEmpty()) {
			String exp2 = completed.pop();
			String exp1 = completed.pop();
			
			String exp = "(" + exp1 + operator.pop() + exp2 + ")";
			completed.push(exp);
		}
		
		return completed.pop();
	}

}
