package solution;

public class Solution {
	public int longestPalindrome(String s) {

		int[] alpha = new int[128];
		char[] cArr = s.toCharArray();

		int num = 0;

		for (char c : cArr) {

			if (alpha[c] > 0) {
				alpha[c]--;
				num += 2;
			} else {

				alpha[c]++;
			}

		}
		int num2 = 0;
		for (int i : alpha) {
			num2 += i;
		}

		return num2 > 0 ? num + 1 : num;
	}
}
