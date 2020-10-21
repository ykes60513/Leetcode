package solution;

import java.util.*;

public class Solution5 {
	public int lengthOfLongestSubstring(String s) {

		if (s == null || s.length() <= 0)
			return 0;

		Queue<Character> queue = new LinkedList<>();
		int result = 0;

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			if (queue.contains(c)) {
				while (queue.poll() != c) {
				}
			}
			queue.offer(c);

			result = Math.max(result, queue.size());

		}

		return result;

	}

}
