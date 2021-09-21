package solution;

public class Solution2 {
	public boolean isPalindrome(String s) {

		char[] c = s.toLowerCase().toCharArray();
		int i = 0;
		int j = c.length - 1;

		while (i < j) {
			if (!Character.isLetterOrDigit(c[i]))
				i++;
			else if (!Character.isLetterOrDigit(c[j]))
				j--;
			else if (c[i++] != c[j--])
				return false;
		}
		return true;

	}
}
