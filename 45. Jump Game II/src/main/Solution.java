/**************************************
 * Dynamic Programming
 */
package main;

import java.util.*;

public class Solution {
	public int jump(int[] nums) {
		int[] dp = new int[nums.length];
		Arrays.fill(dp, Integer.MAX_VALUE - 1);
		dp[nums.length - 1] = 0;

		for (int i = nums.length - 2; i >= 0; i--) {
			int localMin = Integer.MAX_VALUE - 1;
			for (int j = nums[i]; j > 0; j--) {
				if (i + j < nums.length)
					localMin = Math.min(localMin, dp[j + i] + 1);

			}
			dp[i] = localMin;
		}
		return dp[0];
	}
}
