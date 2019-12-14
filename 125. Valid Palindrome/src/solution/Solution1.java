package solution;

public class Solution1 {
	public boolean isPalindrome(String s) {

		if (s == null)
			return true;

		s = s.toLowerCase().replaceAll("[^A-Za-z0-9]+", "");

		int i = 0;
		int j = s.length() - 1;

		while (i < j) {

			if (s.charAt(i++) != s.charAt(j--))
				return false;

		}

		return true;

	}
}
