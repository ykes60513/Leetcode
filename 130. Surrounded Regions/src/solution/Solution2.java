/****************************************
 * BFS
 */
package solution;

import java.util.*;

public class Solution2 {

	private int row;
	private int col;

	private static final int[][] DIRECTIONS = new int[][] { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };

	public void solve(char[][] board) {

		if (board == null || board.length == 0 || board[0].length == 0)
			return;

		this.row = board.length;
		this.col = board[0].length;

		boolean[][] check = new boolean[row][col];
		Queue<int[]> queue = new LinkedList<>();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				if ((i == 0 || i == row - 1 || j == 0 || j == col - 1) && board[i][j] == 'O') {
					check[i][j] = true;
					queue.offer(new int[] { i, j });
				}

			}
		}

		while (!queue.isEmpty()) {

			int size = queue.size();

			for (int i = 0; i < size; i++) {

				int[] pos = queue.poll();
				for (int[] dir : DIRECTIONS) {

					int r = pos[0] + dir[0];
					int c = pos[1] + dir[1];

					if (r < 0 || r == row || c < 0 || c == col || board[r][c] == 'X' || check[r][c])
						continue;

					check[r][c] = true;
					queue.offer(new int[] { r, c });

				}

			}

		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (board[i][j] == 'O' && !check[i][j])
					board[i][j] = 'X';
			}
		}

	}
}
