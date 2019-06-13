package solution;

import java.util.*;

public class Solution {
	public List<Integer> topKFrequent(int[] nums, int k) {
		// freq map
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int max_freq = 0;
		for (int n : nums) {
			map.put(n, map.getOrDefault(n, 0) + 1);
			max_freq = Math.max(max_freq, map.get(n));
		}
		// bucket sort on freq
		Map<Integer, List<Integer>> bucket = new HashMap<>();
		for (int i : map.keySet()) {
			int freq = map.get(i);
			if (!bucket.containsKey(freq)) {
				List<Integer> list = new ArrayList<>();
				list.add(i);
				bucket.put(freq, list);
			} else {

				List<Integer> list = bucket.get(freq);
				list.add(i);
			}
		}

		// gather result
		List<Integer> res = new ArrayList<>();
		for (int i = max_freq; i >= 0; i--) {
			if (bucket.containsKey(i))
				res.addAll(bucket.get(i));
			if (res.size() >= k)
				break;
		}
		return res;
	}
}
