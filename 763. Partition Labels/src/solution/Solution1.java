package solution;

import java.util.*;

public class Solution1 {
	public List<Integer> partitionLabels(String S) {

		Map<Character, int[]> map = new HashMap<>();

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (map.containsKey(c)) {
				map.get(c)[1] = i;
			} else {

				map.put(c, new int[] { i, i });
			}
		}

		PriorityQueue<int[]> queue = new PriorityQueue<>(new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] - o2[0];
			}

		});

		map.forEach((n1, n2) -> {
			queue.offer(n2);
		});

		int size = queue.size();

		LinkedList<int[]> list = new LinkedList<>();
		for (int i = 0; i < size; i++) {

			int[] q = queue.poll();

			if (list.isEmpty() || list.getLast()[1] < q[0]) {
				list.add(q);
			} else {
				list.getLast()[1] = Math.max(q[1], list.getLast()[1]);
			}
		}

		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			res.add(list.get(i)[1] - list.get(i)[0] + 1);
		}

		return res;

	}
}
