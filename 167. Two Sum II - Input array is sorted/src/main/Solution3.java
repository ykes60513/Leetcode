package main;

public class Solution3 {
	public int[] twoSum(int[] numbers, int target) {
		int lo = 0;
		int hi = numbers.length - 1;
		while (lo < hi) {
			int mid = lo + (hi - lo) / 2;
			int sum = numbers[lo] + numbers[hi];

			if (sum == target)
				return new int[] { lo + 1, hi + 1 };
			if (sum < target) {
				lo = (numbers[mid] + numbers[hi] < target) ? mid + 1 : lo + 1;
			} else {
				hi = (numbers[mid] + numbers[lo] > target) ? mid : hi - 1;
			}

		}
		return new int[] { -1, -1 };
	}
}
