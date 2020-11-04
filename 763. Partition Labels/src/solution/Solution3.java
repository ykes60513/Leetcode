package solution;

import java.util.*;

public class Solution3 {
	public List<Integer> partitionLabels(String S) {

		List<Integer> result = new ArrayList<>();

		if (S.length() == 0)
			return result;

		int[] map = new int[26];
		for (int i = 0; i < S.length(); i++) {
			map[S.charAt(i) - 'a'] = i;
		}

		int start = 0;
		int last = 0;
		for (int i = 0; i < S.length(); i++) {
			last = Math.max(last, map[S.charAt(i) - 'a']);
			if (i == last) {
				result.add(last - start + 1);
				start = last + 1;
			}
		}
		return result;
	}
}
