/****************************************************************************************
 * Given n non-negative integers a1, a2, ..., an , where each represents a point at coordinate (i, ai). 
 * n vertical lines are drawn such that the two endpoints of the line i is at (i, ai) and (i, 0). 
 * Find two lines, which, together with the x-axis forms a container, 
 * such that the container contains the most water.
 * https://leetcode.com/problems/container-with-most-water/
 */

package main;

public class Solution {
	public int maxArea(int[] height) {

		int result = 0;
		int lo = 0;
		int hi = height.length - 1;
		while (lo < hi) {

			result = Math.max(result, Math.min(height[lo], height[hi]) * (hi - lo));

			if (height[lo] < height[hi])
				lo++;
			else
				hi--;

		}

		return result;
	}
}
