/**********************************
 * Using Hashmap
 * 
 * Time Complexity : O(n)
 * Space Complexity : O(n)
 * 
 * prefix Sum p(x) = sum of array[0] ~ array[x]
 * sum(x,y) = p(y) - p(x-1)
 * 
 * sum(x,y) = k ==> p(y) - p(x-1) = k
 * ============p(x-1) = p(y) - k==================
 * 
 */

package solution;

import java.util.*;

public class Solution2 {
	public int subarraySum(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		//map(x,y) = map(sum, # of sum)
		map.put(0, 1);

		int sum = 0;
		int ans = 0;
		for (int num : nums) {
			//sum = p(y)
			sum += num;
			if (map.containsKey(sum - k))
				ans += map.get(sum - k);

			map.put(sum, map.getOrDefault(sum, 0) + 1);
		}

		return ans;
	}
}
