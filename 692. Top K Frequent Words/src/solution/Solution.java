package solution;

import java.util.*;

public class Solution {

	public List<String> topKFrequent(String[] words, int k) {

		Map<String, Integer> map = new HashMap<>();
		int max_freq = 0;

		for (String s : words) {
			map.put(s, map.getOrDefault(s, 0) + 1);
			max_freq = Math.max(max_freq, map.get(s));
		}

		// bucket sort
		Map<Integer, PriorityQueue<String>> bucket = new HashMap<>();
		map.forEach((n1, n2) -> {

			if (!bucket.containsKey(n2)) {

				PriorityQueue<String> list = new PriorityQueue<String>();
				list.add(n1);
				bucket.put(n2, list);
			} else {

				PriorityQueue<String> list = bucket.get(n2);
				list.add(n1);
			}

		});

		List<String> result = new LinkedList<>();
		for (int i = max_freq; i >= 0; i--) {
			if (bucket.containsKey(i)) {
				PriorityQueue<String> list = bucket.get(i);
				while (list.size() != 0)
					result.add(list.poll());
			}

		}

		return result.subList(0, k);
	}

}
