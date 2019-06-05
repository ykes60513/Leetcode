package solution;

public class Solution2 {

	public int maxProfit(int[] prices) {

		if (prices == null || prices.length <= 0)
			return 0;
		int lowest = prices[0];
		int maxProfit = 0;

		for (int i = 1; i < prices.length; i++) {

			lowest = Math.min(lowest, prices[i]);
			maxProfit = Math.max(maxProfit, prices[i] - lowest);

		}

		return maxProfit;

	}

}
