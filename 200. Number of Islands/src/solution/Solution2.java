/***************
 * BFS-Solution
 */

package solution;

import java.util.*;

public class Solution2 {

	private static final List<int[]> DERECTION = Arrays.asList(new int[] { -1, 0 }, new int[] { 1, 0 },
			new int[] { 0, -1 }, new int[] { 0, 1 });

	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length == 0) {
			return 0;
		}

		final int m = grid.length;
		final int n = grid[0].length;
		int num_islands = 0;

		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == '1') {
					num_islands++;
					grid[i][j] = '0'; // mark as visited
					Queue<Integer> neighbors = new LinkedList<>();
					neighbors.add(i * n + j);
					while (!neighbors.isEmpty()) {
						int id = neighbors.remove();
						int row = id / n;
						int col = id % n;
						for (int[] d : DERECTION) {
							int r = row + d[0];
							int c = col + d[1];
							if (r >= 0 && c >= 0 && r < m && c < n && grid[r][c] == '1') {
								neighbors.add(r * n + c);
								grid[r][c] = '0';
							}

						}
					}
				}
			}
		}

		return num_islands;
	}
}
