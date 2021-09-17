package solution;

import java.util.*;

public class Solution2 {
	public List<Integer> findDuplicates(int[] nums) {

		List<Integer> result = new ArrayList<>();

		for (int i : nums) {
			if (nums[Math.abs(i) - 1] < 0) {
				result.add(Math.abs(i));
			}
			nums[Math.abs(i) - 1] *= -1;
		}

		return result;
	}
}

//[4,3,2,7,8,2,3,1]
//[4,3,2,-7,8,2,3,1]
//[4,3,-2,-7,8,2,3,1]
//[4,3,2,-7,8,2,3,1]
