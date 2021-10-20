package main;

import java.util.*;

public class Solution {

	private static final List<int[]> Direction = Arrays.asList(new int[] { 0, 1 }, new int[] { 1, 0 },
			new int[] { 0, -1 }, new int[] { -1, 0 });

	public List<Integer> spiralOrder(int[][] matrix) {

		int m = matrix.length;
		int n = matrix[0].length;

		boolean[][] visited = new boolean[m][n];

		List<Integer> ans = new ArrayList<>();

		int row = 0;
		int col = 0;
		int k = 0;

		for (int i = 0; i < m * n; i++) {

			ans.add(matrix[row][col]);
			visited[row][col] = true;

			int[] dir = Direction.get(k);

			int r = row + dir[0];
			int c = col + dir[1];

			if (r >= m || r < 0 || c >= n || c < 0 || visited[r][c]) {

				k = (k + 1) % 4;
				dir = Direction.get(k);
				r = row + dir[0];
				c = col + dir[1];

			}

			row = r;
			col = c;
		}

		return ans;

	}
}