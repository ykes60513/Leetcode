package solution;

import java.util.*;

public class Solution {
	public List<Integer> findAnagrams(String s, String p) {

		List<Integer> result = new ArrayList<>();

		if (s == null || p == null || s.length() == 0 || p.length() == 0 || s.length() < p.length())
			return result;

		int[] patten = new int[26];
		int[] freq = new int[26];
		for (int i = 0; i < p.length(); i++) {
			freq[p.charAt(i) - 'a']++;
		}

		int start = 0, end = 0;
		for (; end < p.length(); end++) {
			patten[s.charAt(end) - 'a']++;
		}
		end = p.length() - 1;

		while (true) {
			if (Arrays.equals(patten, freq))
				result.add(start);

			if (end == s.length() - 1)
				break;

			patten[s.charAt(++end) - 'a']++;
			patten[s.charAt(start++) - 'a']--;

		}
		return result;
	}
}
