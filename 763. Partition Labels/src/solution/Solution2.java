package solution;

import java.util.*;

public class Solution2 {
	public List<Integer> partitionLabels(String S) {

		Map<Character, int[]> map = new LinkedHashMap<>();

		for (int i = 0; i < S.length(); i++) {
			char c = S.charAt(i);
			if (map.containsKey(c)) {
				map.get(c)[1] = i;
			} else {

				map.put(c, new int[] { i, i });
			}
		}

		int[][] intervals = new int[map.size()][2];
		Iterator<Map.Entry<Character, int[]>> iter = map.entrySet().iterator();
		int count = 0;

		while (iter.hasNext()) {

			Map.Entry<Character, int[]> entry = iter.next();

			intervals[count++] = entry.getValue();
		}

		LinkedList<int[]> list = new LinkedList<>();
		for (int[] interval : intervals) {

			if (list.isEmpty() || list.getLast()[1] < interval[0]) {
				list.add(interval);
			} else {
				list.getLast()[1] = Math.max(interval[1], list.getLast()[1]);
			}
		}

		List<Integer> res = new ArrayList<>();
		for (int i = 0; i < list.size(); i++) {
			res.add(list.get(i)[1] - list.get(i)[0] + 1);
		}

		return res;
	}
}
