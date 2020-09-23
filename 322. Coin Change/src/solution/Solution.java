package solution;

import java.util.Arrays;

/*******************************************************
 * Dynamic Programming - Bottom Up (Iterative)
 * 
 * @author ICHIGO
 *
 */

public class Solution {

	public int coinChange(int[] coins, int amount) {

		int[] dp = new int[amount + 1];
		Arrays.fill(dp, amount + 1);
		dp[0] = 0;
		for (int coin : coins) {
			for (int i = coin; i <= amount; i++) {
				dp[i] = Math.min(dp[i], dp[i - coin] + 1);

			}
		}

		return dp[amount] > amount ? -1 : dp[amount];
	}

}
