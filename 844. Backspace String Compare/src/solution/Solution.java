package solution;

import java.util.Stack;

public class Solution {
	public boolean backspaceCompare(String S, String T) {

		Stack<Character> s1 = new Stack<>();
		Stack<Character> s2 = new Stack<>();

		for (char c : S.toCharArray()) {

			if (c != '#') {
				s1.push(c);
			} else if (!s1.empty()) {
				s1.pop();
			}
		}
		for (char c : T.toCharArray()) {
			if (c != '#') {
				s2.push(c);
			} else if (!s2.empty()) {
				s2.pop();
			}
		}

		return s1.equals(s2);

	}
}
