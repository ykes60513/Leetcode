/***************************************
 * BFS - Time Limit Exceeded
 */
package solution;

import java.util.*;

public class Solution1 {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {

		Set<String> wordSet = new HashSet<>(wordList);
		Queue<String> queue = new LinkedList<>();
		queue.add(beginWord);

		int count = 0;
		while (!queue.isEmpty()) {

			count++;
			int size = queue.size();

			for (int i = 0; i < size; i++) {

				String s = queue.poll();
				for (String n : wordSet) {
					if (nextString(s, n)) {

						if (n.equals(endWord))
							return count + 1;

						queue.add(n);
					}
				}

				wordSet.remove(s);
			}

		}
		return 0;
	}

	private boolean nextString(String s, String n) {

		boolean check = false;

		for (int i = 0; i < s.length(); i++) {

			int diff = s.charAt(i) - n.charAt(i);

			if (diff != 0) {
				if (!check) {
					check = true;
				} else {
					return false;
				}
			}
		}

		return true;
	}
}
