package solution;

import java.util.*;

public class Solution {
	public int[][] highFive(int[][] items) {

		Map<Integer, PriorityQueue<Integer>> map = new HashMap<>();

		for (int[] item : items) {

			if (!map.containsKey(item[0]))
				map.put(item[0], new PriorityQueue<>());

			PriorityQueue<Integer> queue = map.get(item[0]);

			if (queue.size() < 5) {
				queue.offer(item[1]);
			} else if (item[1] > queue.peek()) {
				queue.poll();
				queue.offer(item[1]);
			}
		}

		List<int[]> list = new ArrayList<>();
		
		for (int key : map.keySet()) {

			int sum = 0;

			while (!map.get(key).isEmpty())
				sum += map.get(key).poll();

			list.add(new int[] { key, sum / 5 });
		}

		Collections.sort(list, new Comparator<int[]>() {

			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});

		return list.toArray(new int[list.size()][2]);
	}
}
