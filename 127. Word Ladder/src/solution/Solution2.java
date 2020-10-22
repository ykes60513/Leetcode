/*******************************************
 * BFS
 */
package solution;

import java.util.*;

public class Solution2 {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {

		Set<String> wordSet = new HashSet<>(wordList);
		if (!wordSet.contains(endWord))
			return 0;

		Queue<String> queue = new LinkedList<>();
		queue.add(beginWord);
		
		int step = 0;
		while (!queue.isEmpty()) {
			
			step++;
			int size = queue.size();
			for (int i = 0; i < size; i++) {
				char[] current = queue.poll().toCharArray();
				for (int j = 0; j < current.length; j++) {
					char tmp = current[j];
					for (char c = 'a'; c <= 'z'; c++) {
						current[j] = c;
						String next = new String(current);
						if (wordSet.contains(next)) {
							if (next.equals(endWord))
								return step + 1;
							queue.add(next);
							wordSet.remove(next);
						}
					}
					current[j] = tmp;
				}
			}

		}
		return 0;
	}
}
