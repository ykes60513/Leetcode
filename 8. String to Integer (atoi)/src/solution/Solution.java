package solution;

public class Solution {
	public int myAtoi(String str) {

		if (str == null || str.length() == 0)
			return 0;
		str = str.trim();
		if (str.length() == 0)
			return 0;

		char[] ch = str.toCharArray();
		int start = 0;
		boolean sign = true;

		if (ch[start] == '-' || ch[start] == '+') {

			sign = ch[start] == '+';
			start++;

		}

		int num = 0;

		while (start < ch.length && Character.isDigit(ch[start])) {

			int temp = num * 10 + (ch[start] - '0');
			if (temp / 10 != num) {

				return sign ? Integer.MAX_VALUE : Integer.MIN_VALUE;
			}
			num = temp;
			start++;

		}

		return sign ? num : -num;
	}
}
