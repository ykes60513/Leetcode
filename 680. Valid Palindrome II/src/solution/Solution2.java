package solution;

public class Solution2 {
	public boolean validPalindrome(String s) {
		char[] input = s.toCharArray();
		int i = 0, j = input.length - 1;

		while (i < j) {
			if (input[i] != input[j])
				return isPalindrome(input, i, j - 1) || isPalindrome(input, i + 1, j);

			i++;
			j--;
		}

		return true;

	}

	private boolean isPalindrome(char[] input, int i, int j) {

		while (i < j) {

			if (input[i] != input[j])
				return false;

			i++;
			j--;
		}
		return true;
	}
}
