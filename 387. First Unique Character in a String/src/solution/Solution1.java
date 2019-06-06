package solution;

import java.util.*;

public class Solution1 {
	public int firstUniqChar(String s) {

		if (s == null || s.length() <= 0)
			return -1;

		Map<Character, Integer> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			char c = s.charAt(i);
			map.put(c, map.getOrDefault(c, 0) + 1);

		}
		for (int i = 0; i < s.length(); i++) {

			if (map.get(s.charAt(i)) == 1) {
				return i;
			}
		}
		return -1;
	}
}
