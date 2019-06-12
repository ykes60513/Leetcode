package solution;

import java.util.*;

public class Solution {
	public int numJewelsInStones(String J, String S) {

		if (S == null || S.length() == 0)
			return 0;

		Set<Character> jewel = new HashSet<>();

		int result = 0;

		for (int i = 0; i < J.length(); i++) {
			jewel.add(J.charAt(i));
		}
		for (int i = 0; i < S.length(); i++) {
			if (jewel.contains(S.charAt(i)))
				result++;
		}

		return result;
	}
}
