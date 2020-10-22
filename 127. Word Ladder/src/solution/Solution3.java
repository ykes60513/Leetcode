/*********************************
 * Bidirectional BFS
 */

package solution;

import java.util.*;

public class Solution3 {
	public int ladderLength(String beginWord, String endWord, List<String> wordList) {

		Set<String> wordSet = new HashSet<>(wordList);
		if (!wordSet.contains(endWord))
			return 0;

		final int length = beginWord.length();

		Set<String> beginSet = new HashSet<>();
		beginSet.add(beginWord);
		Set<String> endSet = new HashSet<>();
		endSet.add(endWord);

		int step = 0;

		while (!beginSet.isEmpty() && !endSet.isEmpty()) {

			step++;
			// SWAP
			if (beginSet.size() > endSet.size()) {
				Set<String> tempSet = beginSet;
				beginSet = endSet;
				endSet = tempSet;
			}

			Set<String> tempSet = new HashSet<>();

			for (String word : beginSet) {

				char[] current = word.toCharArray();
				for (int i = 0; i < length; i++) {

					char temp = current[i];

					for (char c = 'a'; c <= 'z'; c++) {

						current[i] = c;
						String next = new String(current);
						if (endSet.contains(next))
							return step + 1;

						if (!wordSet.contains(next))
							continue;

						wordSet.remove(next);
						tempSet.add(next);
					}
					current[i] = temp;
				}
			}

			beginSet = tempSet;
		}

		return 0;
	}
}