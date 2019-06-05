package solution;

public class Solution3 {
	public int maxProfit(int[] prices) {

		if (prices == null || prices.length < 2)
			return 0;

		int[] gain = new int[prices.length - 1];
		for (int i = 1; i < prices.length; i++) {

			gain[i - 1] = prices[i] - prices[i - 1];
		}
		return Math.max(0, maxSubArray(gain));
	}

	private int maxSubArray(int[] nums) {

		int sum = nums[0];
		int result = nums[0];
		for (int i = 1; i < nums.length; i++) {

			sum = (sum > 0) ? sum + nums[i] : nums[i];
			result = (result > sum) ? result : sum;
		}

		return result;
	}
}
