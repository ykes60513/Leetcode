package solution;

public class Solution2 {
	public int firstUniqChar(String s) {

		if (s == null || s.length() <= 0)
			return -1;

		int[] array = new int[256];

		for (int i = 0; i < s.length(); i++)
			array[s.charAt(i)]++;

		for (int i = 0; i < s.length(); i++) {

			if (array[s.charAt(i)] == 1)
				return i;
		}
		return -1;

	}
}
