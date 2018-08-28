package section1;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class BalancedParantheses {

	public static void main(String[] args) {
		System.out.println(isBalanced("][(]}})("));
	}

	private static boolean isBalanced(String input) {
		Stack<Character> bracket = new Stack<Character>();
		Map<Character, Character> map = new HashMap<>();
		map.put('}', '{');
		map.put(']', '[');
		map.put(')', '(');
		char[] a = input.toCharArray();
		for (char i : a) {
			if (i == '{' || i == '[' || i == '(') {
				bracket.push(i);
			} else if (i == '}' || i == ']' || i == ')') {
				char temp = map.get(i);
				if (!bracket.isEmpty() && temp == bracket.lastElement()) {
					bracket.pop();
				} else {
					return false;
				}
			}
		}
		if (bracket.isEmpty())
			return true;
		else
			return false;
	}

}
