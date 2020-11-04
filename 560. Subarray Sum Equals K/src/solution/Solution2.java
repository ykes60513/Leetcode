/**********************************
 * Using Hashmap
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 * 
 */

package solution;

import java.util.*;

public class Solution2 {
	public int subarraySum(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		map.put(0, 1);

		int sum = 0;
		int ans = 0;
		for (int num : nums) {
			sum += num;
			if (map.containsKey(sum - k))
				ans += map.get(sum - k);

			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}

		return ans;
	}
}
