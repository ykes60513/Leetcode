package solution;

public class Solution {
	public int splitArray(int[] nums, int m) {

		int max = 0;
		int sum = 0;
		for (int num : nums) {

			max = Math.max(num, max);
			sum += num;
		}

		int lo = max;
		int hi = sum;

		while (lo < hi) {

			int mid = lo + (hi - lo) / 2;
			int pieces = split(nums, mid);

			if (pieces > m) {

				lo = mid + 1;
			} else {

				hi = mid;
			}
		}

		return lo;
	}

	private int split(int[] nums, int largestSum) {

		int pieces = 1;
		int tempSum = 0;

		for (int num : nums) {

			if (tempSum + num > largestSum) {

				tempSum = num;
				pieces++;

			} else {

				tempSum += num;
			}
		}

		return pieces;
	}
}
