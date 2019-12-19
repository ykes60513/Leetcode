package solution;

public class Solution3 {
	public int strStr(String haystack, String needle) {

		int hLength = haystack.length();
		int nLength = needle.length();

		if (nLength == 0)
			return 0;
		if (hLength < nLength)
			return -1;

		char[] hArr = haystack.toCharArray();
		char[] nArr = needle.toCharArray();

		int i = 0;
		int j = 0;

		while (i < hLength && j < nLength) {

			if (hArr[i] == nArr[j]) {

				i++;
				j++;

			} else {

				i = i - j + 1;
				j = 0;
			}

		}
		if (j == nLength) {

			return i - nLength;
		}

		return -1;

	}
}
