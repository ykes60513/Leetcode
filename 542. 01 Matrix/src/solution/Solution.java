package solution;

import java.util.*;

public class Solution {
	int row;
	int col;

	final int[][] DIRECTIONS = new int[][] { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

	public int[][] updateMatrix(int[][] matrix) {

		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return matrix;

		row = matrix.length;
		col = matrix[0].length;

		Queue<int[]> queue = new LinkedList<>();

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (matrix[i][j] == 0)
					queue.offer(new int[] { i, j });
				else {
					matrix[i][j] = Integer.MAX_VALUE;
				}
			}
		}

		while (!queue.isEmpty()) {

			int[] cell = queue.poll();

			for (int[] d : DIRECTIONS) {

				int r = cell[0] + d[0];
				int c = cell[1] + d[1];

				if (r < 0 || r >= row || c < 0 || c >= col || matrix[r][c] <= matrix[cell[0]][cell[1]] + 1)
					continue;

				queue.add(new int[] { r, c });
				matrix[r][c] = matrix[cell[0]][cell[1]] + 1;
			}
		}
		return matrix;

	}
}
