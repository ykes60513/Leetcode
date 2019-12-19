package solution;

public class Solution2 {
	public int strStr(String haystack, String needle) {
		if (haystack == null || needle == null) {
			return -1;
		}

		int haystackLength = haystack.length();
		int needleLength = needle.length();

		for (int i = 0; i <= haystackLength - needleLength; i++) {
			int j = 0;
			for (j = 0; j < needleLength; j++) {
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
			}
			if (j == (needleLength)) {
				return i;
			}
		}

		return -1;

	}
}
