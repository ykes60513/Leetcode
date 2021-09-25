package main;

public class Solution {
	public int rob(int[] nums) {

		// sum = Max(sum + i_3, sum + i_2)
		if (nums.length == 1)
			return nums[0];

		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);

		int[] ans1 = new int[nums.length - 1];
		int[] ans2 = new int[nums.length - 1];

		int i = 0;
		int j = 1;

		while (i < nums.length - 1 || j < nums.length) {

			ans1[i] = nums[i++];
			ans2[j - 1] = nums[j++];
		}

		return Math.max(robHelper(ans1), robHelper(ans2));
	}

	private int robHelper(int[] nums) {

		int[] ans = new int[nums.length];

		ans[0] = nums[0];
		if (nums.length == 1)
			return ans[0];

		ans[1] = nums[1];
		if (nums.length == 2)
			return Math.max(nums[0], nums[1]);

		ans[2] = nums[0] + nums[2];

		for (int i = 3; i < ans.length; i++) {

			ans[i] = Math.max(ans[i - 3], ans[i - 2]) + nums[i];

		}

		return Math.max(ans[ans.length - 1], ans[ans.length - 2]);
	}
}
