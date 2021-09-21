/*******************************
 * Given a string s, return the longest palindromic substring in s.
 * https://leetcode.com/problems/longest-palindromic-substring/
 */
package solution;

public class Solution {
	public String longestPalindrome(String s) {

		String res = "";

		for (int i = 0; i < s.length(); i++) {
			String s1 = expand(s, i, i);
			String s2 = expand(s, i, i + 1);

			if (s1.length() > res.length()) {
				res = s1;
			}
			if (s2.length() > res.length()) {
				res = s2;
			}
		}

		return res;
	}

	private String expand(String s, int left, int right) {
		int L = left, R = right;
		while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
			L--;
			R++;
		}
		return s.substring(L + 1, R);
	}
}
