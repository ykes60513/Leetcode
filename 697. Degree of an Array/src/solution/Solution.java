package solution;

import java.util.*;

public class Solution {
	public int findShortestSubArray(int[] nums) {

		Map<Integer, int[]> map = new HashMap<>();
		int maxfreq = Integer.MIN_VALUE;

		for (int i = 0; i < nums.length; i++) {

			if (!map.containsKey(nums[i])) {
				map.put(nums[i], new int[] { 1, i, 1 });
				maxfreq = Math.max(maxfreq, 1);
			} else {
				int[] arr = map.get(nums[i]);
				maxfreq = Math.max(maxfreq, ++arr[0]);
				arr[2] = i - arr[1] + 1;
			}
		}

		int res = nums.length;
		Iterator<Map.Entry<Integer, int[]>> iter = map.entrySet().iterator();
		while (iter.hasNext()) {

			Map.Entry<Integer, int[]> entry = iter.next();
			int[] arr = entry.getValue();
			if (arr[0] == maxfreq) {
				res = Math.min(res, arr[2]);
			}
		}

		return res;
	}
}
