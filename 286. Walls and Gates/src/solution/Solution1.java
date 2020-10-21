/**************************************
 * BFS solution
 */
package solution;

import java.util.*;

public class Solution1 {

	private static final int EMPTY = Integer.MAX_VALUE;
	private static final int GATE = 0;
	private static final int[][] DIRECTIONS = { { 0, 1 }, { 0, -1 }, { 1, 0 }, { -1, 0 } };

	public void wallsAndGates(int[][] rooms) {

		if (rooms == null || rooms.length == 0)
			return;

		final int m = rooms.length;
		final int n = rooms[0].length;

		Queue<int[]> queue = new LinkedList<>();

		//Find the gate
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {

				if (rooms[i][j] == GATE)
					queue.offer(new int[] { i, j });
			}
		}
		while (!queue.isEmpty()) {

			int size = queue.size();
			int[] pos;

			for (int i = 0; i < size; i++) {

				pos = queue.poll();
				int row = pos[0];
				int col = pos[1];
				for (int[] direction : DIRECTIONS) {
					int r = row + direction[0];
					int c = col + direction[1];

					if (r < 0 || r >= m || c < 0 || c >= n || rooms[r][c] != EMPTY)
						continue;

					rooms[r][c] = rooms[row][col] + 1;

					queue.offer(new int[] { r, c });
				}
			}
		}

	}
}
