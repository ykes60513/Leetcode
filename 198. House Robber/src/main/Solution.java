/**********************************
 * Given an integer array nums representing the amount of money of each house, 
 * return the maximum amount of money you can rob tonight without alerting the police.
 * https://leetcode.com/problems/house-robber/solution/
 */
package main;

public class Solution {
	public int rob(int[] nums) {

		// sum = Max(sum + i_3, sum + i_2)

		if (nums.length == 0)
			return 0;

		int[] ans = new int[nums.length];

		ans[0] = nums[0];

		if (nums.length == 1)
			return ans[0];

		ans[1] = nums[1];
		if (nums.length == 2)
			return Math.max(ans[0], ans[1]);

		ans[2] = nums[0] + nums[2];

		for (int i = 3; i < ans.length; i++) {

			ans[i] = Math.max(ans[i - 3], ans[i - 2]) + nums[i];

		}

		return Math.max(ans[ans.length - 1], ans[ans.length - 2]);
	}
}
