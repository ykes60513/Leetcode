package solution;

import java.util.*;

public class Solution {
	public String reverseWords(String s) {

		s = s.trim();
		if (s == null || s.length() == 0)
			return s;

		StringBuilder sb = new StringBuilder();
		StringBuilder result = new StringBuilder();
		Stack<String> stack = new Stack<>();

		for (char c : s.toCharArray()) {

			if (c != ' ') {
				sb.append(c);
			} else {
				if (sb.length()!=0) {
					stack.push(sb.toString());
					sb.setLength(0);
				}
			}
		}
		while (!stack.isEmpty()) {
			result.append(stack.pop()).append(' ');
		}
		return result.deleteCharAt(result.length() - 1).toString();

	}
}
