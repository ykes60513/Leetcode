/***********************************
 * Given a collection of numbers, 
 * nums, that might contain duplicates, 
 * return all possible unique permutations in any order.
 * https://leetcode.com/problems/permutations-ii/
 */

package solution;

import java.util.*;

public class Solution {
	public List<List<Integer>> permuteUnique(int[] nums) {
		
		List<List<Integer>> result = new ArrayList<>();
		Arrays.sort(nums);
		backtrack(result, new ArrayList<>(), nums, new boolean[nums.length]);
		return result;
	}

	private void backtrack(List<List<Integer>> result, List<Integer> tempList, int[] nums, boolean[] used) {
		if (tempList.size() == nums.length) {
			result.add(new ArrayList<>(tempList));
		} else {
			for (int i = 0; i < nums.length; i++) {
				if (used[i] || i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
					continue;
				used[i] = true;
				tempList.add(nums[i]);
				backtrack(result, tempList, nums, used);
				used[i] = false;
				tempList.remove(tempList.size() - 1);
			}
		}
	}
}
