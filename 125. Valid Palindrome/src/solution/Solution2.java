package solution;

public class Solution2 {
	public boolean isPalindrome(String s) {
		char[] c = s.toCharArray();
		int i = 0;
		int j = c.length - 1;

		while (i < j) {
			if (!Character.isLetterOrDigit(c[i]))
				i++;
			else if (!Character.isLetterOrDigit(c[j]))
				j--;
			else if (Character.toLowerCase(c[i++]) != Character.toLowerCase(c[j--]))
				return false;
		}
		return true;
	}
}
