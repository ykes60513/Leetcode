package solution;

import java.util.*;

public class Solution2 {
	public List<List<Integer>> permuteUnique(int[] nums) {

		List<List<Integer>> res = new ArrayList<>();
		if (nums == null || nums.length == 0)
			return res;
		Arrays.sort(nums);
		backtrack(res, nums, 0);
		return res;
	}

	private void backtrack(List<List<Integer>> res, int[] nums, int start) {

		if (start == nums.length) {
			List<Integer> list = new ArrayList<>();
			for (int num : nums) {
				list.add(num);
			}
			res.add(list);
			return;
		}

		for (int i = start; i < nums.length; i++) {

			if (isUsed(nums, start, i))
				continue;
			swap(nums, start, i);
			backtrack(res, nums, start + 1);
			swap(nums, start, i);
		}
	}

	private void swap(int[] nums, int i, int j) {

		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}

	private boolean isUsed(int[] nums, int i, int j) {

		for (int x = i; x < j; x++) {

			if (nums[x] == nums[j])
				return true;
		}
		return false;
	}
}
