package main;

import java.util.Stack;

public class Bracket {

	public boolean isValid(String s) {

		if (s.length() == 0)
			return true;

		Stack<Character> stack = new Stack<>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (c == ')') {
				if (stack.isEmpty() || stack.peek() != '(')
					return false;
				else
					stack.pop();
			} else if (c == ']') {
				if (stack.isEmpty() || stack.peek() != '[')
					return false;
				else
					stack.pop();
			} else if (c == '}') {
				if (stack.isEmpty() || stack.peek() != '{')
					return false;
				else
					stack.pop();
			} else
				stack.push(c);
		}
		return stack.isEmpty();
	}
}
