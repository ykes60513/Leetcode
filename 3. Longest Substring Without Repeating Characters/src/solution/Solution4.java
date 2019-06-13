package solution;

import java.util.*;

public class Solution4 {

	public int lengthOfLongestSubstring(String s) {

		if (s == null || s.length() == 0)
			return 0;

		int ans = 0;
		Set<Character> set = new HashSet<>();
		int start = 0;
		int end = 0;

		while (end < s.length()) {
			if (set.contains(s.charAt(end)))
				set.remove(s.charAt(start++));
			else {
				set.add(s.charAt(end++));
				ans = Math.max(ans, set.size());
			}
		}
		return ans;
	}
}
