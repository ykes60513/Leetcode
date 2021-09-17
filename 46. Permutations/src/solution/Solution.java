/***************************************
 * Given an array nums of distinct integers, 
 * return all the possible permutations. 
 * You can return the answer in any order.
 * https://leetcode.com/problems/permutations/
 */
package solution;

import java.util.*;

public class Solution {
	public List<List<Integer>> permute(int[] nums) {

		List<List<Integer>> result = new ArrayList<>();
		backtrack(result, new ArrayList<>(), nums);
		return result;
	}

	private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums) {

		if (tempList.size() == nums.length) {
			result.add(new ArrayList<>(tempList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (tempList.contains(nums[i]))
					continue;
				// element already exists, skip
				tempList.add(nums[i]);
				backtrack(result, tempList, nums);
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}
