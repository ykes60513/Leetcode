/***************************************
 * Given n non-negative integers representing an elevation map 
 * where the width of each bar is 1,
 * compute how much water it can trap after raining.
 */
package solution;

public class Solution2 {
	public int trap(int[] height) {

		if (height == null || height.length < 3) return 0;

		int l = 0;
		int r = height.length - 1;
		int l_max = Integer.MIN_VALUE;
		int r_max = Integer.MIN_VALUE;
		int ans = 0;

		while (l < r) {

			if (height[l] < height[r]) {
				if (height[l] > l_max) l_max = height[l];
				else ans += l_max - height[l];
				
				l++;
			} else {

				if (height[r] > r_max) r_max = height[r];
				else ans += r_max - height[r];

				r--;
			}
		}
		return ans;
	}
}
