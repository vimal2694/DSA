package StacksAndQueues;

import java.util.Stack;

public class BalancedParenthesis {

	public static boolean checkValidParenthesis(String str) {
		char[] ch = str.toCharArray();
		Stack<Character> stack = new Stack<>();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i] == '{' || ch[i] == '(' || ch[i] == '[') {
				stack.push(ch[i]);

			} else {
				if (stack.isEmpty()) {
					return false;
				} else {
					char top = (Character) stack.peek();
					if (ch[i] == ')' && top == '(' || ch[i] == '}' && top == '{' || ch[i] == ']' && top == '[') {
						stack.pop();
					} else {
						return false;
					}
				}
			}
		}

		return stack.empty();
	}

	public static void main(String[] args) {
		String str = "(])";
		System.out.println(checkValidParenthesis(str));
	}

}
