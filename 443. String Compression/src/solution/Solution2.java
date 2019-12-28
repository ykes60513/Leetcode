package solution;

public class Solution2 {
	public int compress(char[] chars) {

		int indexRes = 0;
		int index = 0;
		while (index < chars.length) {
			char cur = chars[index];
			int count = 1;
			while (index + 1 < chars.length && chars[index + 1] == cur) {
				index++;
				count++;
			}
			chars[indexRes++] = cur;
			index++;
			if (count == 1)
				continue;
			for (char c : String.valueOf(count).toCharArray())
				chars[indexRes++] = c;

		}
		return indexRes;

	}
}
