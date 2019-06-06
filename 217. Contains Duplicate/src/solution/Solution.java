package solution;

import java.util.*;

public class Solution {
	public boolean containsDuplicate(int[] nums) {

		Set<Integer> set = new HashSet<>();
		for (int num : nums) {

			if (!set.contains(num))
				set.add(num);
			else
				return true;
		}
		return false;

	}
}
