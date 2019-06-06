package solution;

import java.util.*;

public class Solution1 {

	public boolean isIsomorphic(String s, String t) {

		Map<Character, Character> map = new HashMap<>();

		for (int i = 0; i < s.length(); i++) {

			char si = s.charAt(i);
			char ti = t.charAt(i);

			if (map.containsKey(si)) {

				if (map.get(si) != ti)
					return false;
			} else {

				if (map.containsValue(ti))
					return false;
				map.put(si, ti);
			}
		}
		return true;
	}
}
