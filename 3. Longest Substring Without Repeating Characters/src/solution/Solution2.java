package solution;

import java.util.*;

public class Solution2 {
	public int lengthOfLongestSubstring(String s) {

		if (s == null || s.length() == 0)
			return 0;

		int ans = 0;
		Map<Character, Integer> map = new HashMap<>(); // current index of character
		// try to extend the range [i, j]
		for (int i = 0, j = 0; i < s.length(); i++) {
			if (map.containsKey(s.charAt(i))) {
				j = Math.max(map.get(s.charAt(i)) + 1, j);
			}
			map.put(s.charAt(i), i);
			ans = Math.max(ans, i - j + 1);
		}
		return ans;
	}
}
