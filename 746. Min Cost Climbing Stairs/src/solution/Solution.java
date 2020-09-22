package solution;

public class Solution {

	public int minCostClimbingStairs(int[] cost) {

		if (cost == null || cost.length <= 1)
			return 0;

		int length = cost.length;
		int[] result = new int[cost.length + 1];

		for (int i = 2; i <= length; i++) {

			result[i] = Math.min(result[i - 1] + cost[i - 1], result[i - 2] + cost[i - 2]);
		}

		return result[length];

	}
}
