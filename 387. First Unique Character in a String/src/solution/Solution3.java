package solution;

public class Solution3 {
	public int firstUniqChar(String s) {
		int[] arr = new int[26];

		if (s == null || s.length() == 0)
			return -1;

		for (char ch : s.toCharArray()) {
			arr[ch - 'a']++;
		}

		for (char ch : s.toCharArray()) {
			if (arr[ch - 'a'] == 1)
				return s.indexOf(ch);
		}
		return -1;
	}
}
