package solution;

import java.util.*;

public class Solution2 {
	public List<String> generateParenthesis(int n) {

		List<String> list = new ArrayList<>();
		backtrack(list, new StringBuilder(), 0, 0, n);

		return list;

	}

	private void backtrack(List<String> list, StringBuilder cur, int open, int close, int n) {

		if (cur.length() == n * 2) {
			list.add(cur.toString());
			return;
		}

		if (open < n) {
			backtrack(list, cur.append("("), open + 1, close, n);
			cur.deleteCharAt(cur.length() - 1);
		}

		if (close < open) {
			backtrack(list, cur.append(")"), open, close + 1, n);
			cur.deleteCharAt(cur.length() - 1);
		}

	}
}
