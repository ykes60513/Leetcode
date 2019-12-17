package solution;

public class Solution1 {
	public boolean validPalindrome(String s) {

		int i = 0;
		int j = s.length() - 1;

		while (i < j) {

			if (s.charAt(i) == s.charAt(j)) {
				i++;
				j--;
			} else {

				return Palindrome(s.substring(i + 1, j + 1)) || Palindrome(s.substring(i, j));
			}
		}

		return true;
	}

	private boolean Palindrome(String s) {

		int i = 0;
		int j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			else {
				i++;
				j--;
			}
		}
		return true;

	}
}
