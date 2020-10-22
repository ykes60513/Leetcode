/*****************************
 * Hash Table
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 */
package solution;

import java.util.*;

public class Solution3 {
	public int findDuplicate(int[] nums) {

		Set<Integer> set = new HashSet<>();
		for (int num : nums) {
			if (set.contains(num))
				return num;

			set.add(num);
		}
		
		return -1;
	}
}
