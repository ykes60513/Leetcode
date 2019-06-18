/****
 * DP-solution
 */

package solution;

public class Solution1 {
	
	public int findTargetSumWays(int[] nums, int S) {
		int sum = 0;
		for (int num : nums)
			sum += num;
		if (sum < S || (sum + S) % 2 == 1)
			return 0;
		int s = (sum + S) / 2;
		int[] dp = new int[s + 1];
		dp[0] = 1;
		for (int n : nums)
			for (int i = s; i >= n; i--)
				dp[i] += dp[i - n];
		return dp[s];
	}
}
