package main;

public class Solution {
	public int pivotIndex(int[] nums) {

		int[] preSum = new int[nums.length];

		int sum = nums[0];

		for (int i = 1; i < nums.length; i++) {
			preSum[i] = preSum[i - 1] + nums[i - 1];
			sum += nums[i];
		}

		for (int i = 0; i < nums.length; i++) {

			if (preSum[i] == sum - preSum[i] - nums[i])
				return i;
		}

		return -1;
	}
}