package solution;

public class Solution {
	public boolean canPermutePalindrome(String s) {

		int[] alpha = new int[128];
		char[] cArr = s.toCharArray();

		for (char c : cArr) {

			if (alpha[c] > 0)
				alpha[c]--;
			else
				alpha[c]++;
		}
		int num = 0;
		for (int i : alpha) {
			num += i;
		}

		return num <= 1;
	}
}
