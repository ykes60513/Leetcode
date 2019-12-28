package solution;

public class Solution1 {
	
	public int lengthOfLongestSubstring(String s) {
		int n = s.length(), ans = 0;
		int[] index = new int[128]; 
		// current index of character
		// try to extend the range [i, j]
		for (int hi = 0, lo = 0; hi < n; hi++) {
			lo = Math.max(index[s.charAt(hi)], lo);
			ans = Math.max(ans, hi - lo + 1);
			index[s.charAt(hi)] = hi + 1;
		}
		return ans;
	}
}
