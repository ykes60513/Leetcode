package solution;

import java.util.*;

public class Solution2 {

	final int[][] wheels = new int[][] { { 1, 0, 0, 0 }, { -1, 0, 0, 0 }, { 0, 1, 0, 0 }, { 0, -1, 0, 0 },
			{ 0, 0, 1, 0 }, { 0, 0, -1, 0 }, { 0, 0, 0, 1 }, { 0, 0, 0, -1 } };

	public int openLock(String[] deadends, String target) {

		Map<String, Integer> visited = new HashMap<>();
		for (String s : deadends) {
			visited.put(s, Integer.MIN_VALUE);
		}

		Queue<String> queue = new LinkedList<>();

		if (visited.containsKey("0000"))
			return -1;

		if (target.equals("0000"))
			return 0;

		queue.add("0000");
		visited.put("0000", 0);

		while (!queue.isEmpty()) {

			int size = queue.size();
			for (int i = 0; i < size; i++) {

				String s = queue.poll();

				int d1 = s.charAt(0) - '0';
				int d2 = s.charAt(1) - '0';
				int d3 = s.charAt(2) - '0';
				int d4 = s.charAt(3) - '0';

				for (int[] w : wheels) {

					int s1 = (d1 + 10 + w[0]) % 10;
					int s2 = (d2 + 10 + w[1]) % 10;
					int s3 = (d3 + 10 + w[2]) % 10;
					int s4 = (d4 + 10 + w[3]) % 10;

					String sb = new StringBuilder().append(s1).append(s2).append(s3).append(s4).toString();

					if (sb.equals(target))
						return visited.get(s) + 1;

					if (visited.containsKey(sb))
						continue;

					visited.put(sb, visited.get(s) + 1);
					queue.offer(sb);
				}
			}
		}
		return -1;
	}
}
