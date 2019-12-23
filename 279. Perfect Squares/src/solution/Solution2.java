/*********************** 
 * BFS-solution
 */

package solution;

import java.util.*;

public class Solution2 {

	public int numSquares(int n) {

		// Step 1. Build up HashSet to store the squares number
		Set<Integer> seen = new HashSet<>();

		// Step 2. Initialize depth
		int depth = 0;

		// Step 3. Build up Queue to store the sequence of (input - squares)
		Queue<Integer> queue = new LinkedList<>();
		queue.offer(n);

		// Step 4. Begin BFS
		while (!queue.isEmpty()) {

			depth++;
			final int size = queue.size();
			for (int i = 0; i < size; i++) {
				int node = queue.poll();
				if (!seen.add(node))
					continue;
				for (int j = 1; j*j<= node; j++) {
					int les = node - j * j;
					if (les == 0) {
						return depth;
					}
					queue.offer(les);
				}
			}
		}

		return 0;
	}
}
