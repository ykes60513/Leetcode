/***************
 * BFS-Solution
 */

package solution;

import java.util.*;

public class Solution2 {
	public int numIslands(char[][] grid) {
		if (grid == null || grid.length == 0 || grid[0].length==0) {
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
						if (row - 1 >= 0 && grid[row - 1][col] == '1') {
							neighbors.add((row - 1) * n + col);
							grid[row - 1][col] = '0';
						}
						if (row + 1 < m && grid[row + 1][col] == '1') {
							neighbors.add((row + 1) * n + col);
							grid[row + 1][col] = '0';
						}
						if (col - 1 >= 0 && grid[row][col - 1] == '1') {
							neighbors.add(row * n + col - 1);
							grid[row][col - 1] = '0';
						}
						if (col + 1 < n && grid[row][col + 1] == '1') {
							neighbors.add(row * n + col + 1);
							grid[row][col + 1] = '0';
						}
					}
				}
			}
		}

		return num_islands;
	}
}
