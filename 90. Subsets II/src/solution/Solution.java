package solution;

import java.util.*;

public class Solution {
	public List<List<Integer>> subsetsWithDup(int[] nums) {

		Arrays.sort(nums);
		List<List<Integer>> res = new ArrayList<>();
		helper(res, new ArrayList<Integer>(), nums, 0);

		return res;

	}

	private void helper(List<List<Integer>> res, List<Integer> list, int[] nums, int start) {

		res.add(new ArrayList<>(list));
		for (int i = start; i < nums.length; i++) {

			// skip duplicate
			if (i > start && nums[i] == nums[i - 1])
				continue;
			list.add(nums[i]);
			helper(res, list, nums, i + 1);
			list.remove(list.size() - 1);

		}

	}
}
