package solution;

import java.util.*;

public class Solution {

	private static final Map<Character, Integer> map = new HashMap<>();

	static {

		map.put('I', 1);
		map.put('V', 5);
		map.put('X', 10);
		map.put('L', 50);
		map.put('C', 100);
		map.put('D', 500);
		map.put('M', 1000);

	};

	public int romanToInt(String s) {

		int num = 0;
		int i = 0;
		while (i < s.length()) {

			if (i != s.length() - 1 && map.get(s.charAt(i + 1)) > map.get(s.charAt(i))) {
				num -= map.get(s.charAt(i));
				num += map.get(s.charAt(i + 1));
				i += 2;
			} else {
				num += map.get(s.charAt(i));
				i++;
			}

		}

		return num;

	}
}
