package solution;

import java.util.*;

public class Solution {
	public int openLock(String[] deadends, String target) {
		Set<String> dead = new HashSet<>();
		for (String d : deadends)
			dead.add(d);
		if (dead.contains("0000"))
			return -1;

		Queue<String> queue = new LinkedList<>();
		queue.offer("0000");

		Set<String> seen = new HashSet<>();
		seen.add("0000");

		int step = 0;
		while (!queue.isEmpty()) {
			step++;
			final int size = queue.size();
			for (int i = 0; i < size; i++) {
				String cur = queue.poll();
				for (int d = 0; d < 4; d++) {
					for (int j = -1; j <= 1; j += 2) {
						int y = (cur.charAt(d) - '0' + j + 10) % 10;
						String next = cur.substring(0, d) + ("" + y) + cur.substring(d + 1);
						if (next.equals(target))
							return step;
						if (dead.contains(next) || seen.contains(next))
							continue;
						queue.offer(next);
						seen.add(next);
					}
				}
			}
		}
		return -1;
	}
}
