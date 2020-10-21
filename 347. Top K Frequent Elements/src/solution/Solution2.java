package solution;

import java.util.*;

public class Solution2 {

	public int[] topKFrequent(int[] nums, int k) {

		Map<Integer, Integer> map = new HashMap<>();
		int max_freq = 0;

		for (int i : nums) {
			map.put(i, map.getOrDefault(i, 0) + 1);
			max_freq = Math.max(max_freq, map.get(i));
		}

		Map<Integer, List<Integer>> bucket = new HashMap<>();
		map.forEach((n1, n2) -> {

			if (!bucket.containsKey(n2)) {
				bucket.put(n2, new LinkedList<>(Arrays.asList(n1)));
			} else {
				List<Integer> list = bucket.get(n2);
				list.add(n1);
			}
		});

		List<Integer> res = new ArrayList<>();
		for (int i = max_freq; i >= 0; i--) {
			if (bucket.containsKey(i))
				res.addAll(bucket.get(i));
			if (res.size() >= k)
				break;
		}

		int[] result = new int[res.size()];
		for (int i = 0; i < res.size(); i++) {
			result[i] = res.get(i);
		}

		return result;

	}

}
