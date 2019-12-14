package solution;

public class Solution {
	
	private int[] map = new int[26];
	
	public boolean isAlienSorted(String[] words, String order) {
		
		for (int i = 0; i < 26; ++i) {
			map[order.charAt(i) - 'a'] = i;
		} // construct mapping to the give order.
		for (int i = 1; i < words.length; ++i) { // Verify the ajacent words order.
			if (compare(words[i - 1], words[i]) > 0) {
				return false;
			}
		}
		return true;
	}

	private int compare(String s, String t) { // compare the 2 words char by char.
		int m = s.length(), n = t.length();
		for (int i = 0; i < m && i < n; ++i) {
			int cmp = map[s.charAt(i) - 'a'] - map[t.charAt(i) - 'a']; // compare according to the given order.
			if (cmp != 0) {
				return cmp;
			} // if not equal, return the comparison result.
		}
		return m - n; // when one word is the prefix of the other, compare their sizes.
	}
}
