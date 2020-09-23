package solution;

import java.util.Arrays;

/***********************************
 * DFS+Greedy+Backtracking
 * 
 * @author ICHIGO
 *
 */
public class Solution3 {

	int result = Integer.MAX_VALUE; // initialize answer with plus infinity for comparison later on

	public int coinChange(int[] coins, int amount) {

		Arrays.sort(coins);
		reverse(coins);

		coinHelper(coins, 0, amount, 0);

		return result == Integer.MAX_VALUE ? -1 : result;
	}

	private void coinHelper(int[] coins, int index, int amount, int count) {

		int coin = coins[index];

		// Last element
		if (index == coins.length - 1) {
			if (amount % coin == 0)
				result = Math.min(result, count + amount / coin);
		} else {
			for (int k = amount / coin; k >= 0 && count + k < result; k--) {
				coinHelper(coins, index + 1, amount - k * coin, count + k);
			}
		}
	}

	private void reverse(int[] a) {

		int i = 0;
		int j = a.length - 1;

		while (i < j) {

			int temp = a[i];
			a[i++] = a[j];
			a[j--] = temp;
		}
	}
}
