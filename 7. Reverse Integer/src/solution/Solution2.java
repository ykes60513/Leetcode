package solution;

public class Solution2 {
	public int reverse(int x) {

		try {
			char[] cArr = Integer.toString(x).toCharArray();

			boolean flag = Character.isDigit(cArr[0]);

			StringBuilder sb = new StringBuilder();

			if (!flag)
				sb.append('-');

			for (int i = cArr.length - 1; i >= 0; i--) {

				if (i == cArr.length - 1 && cArr[i] == '0')
					continue;
				if (i == 0 && !flag)
					break;

				sb.append(cArr[i]);

			}

			return Integer.parseInt(sb.toString());
		} catch (NumberFormatException e) {

			return 0;
		}

	}
}
