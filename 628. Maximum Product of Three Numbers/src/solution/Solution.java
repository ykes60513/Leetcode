package solution;

public class Solution {
	public int maximumProduct(int[] nums) {

		int max3 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max1 = Integer.MIN_VALUE;

		int min2 = Integer.MAX_VALUE;
		int min1 = Integer.MAX_VALUE;

		for (int n : nums) {

			if (n > max3) {
				max1 = max2;
				max2 = max3;
				max3 = n;
			} else if (n > max2) {
				max1 = max2;
				max2 = n;
			} else if (n > max1) {
				max1 = n;
			}

			if (n < min2) {
				min1 = min2;
				min2 = n;
			} else if (n < min1) {
				min1 = n;
			}
		}

		return Math.max(max3 * min1 * min2, max1 * max2 * max3);

	}
}