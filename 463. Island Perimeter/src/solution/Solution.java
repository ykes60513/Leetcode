package solution;

public class Solution {

	int result = 0;

	public int islandPerimeter(int[][] grid) {

		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[0].length; j++) {

				if (grid[i][j] == 1) {
					dfs(grid, i, j);
					return result;
				}
			}
		}

		return result;

	}

	private void dfs(int[][] grid, int i, int j) {

		if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
			result++;
			return;
		}

		if (grid[i][j] == -1)
			return;

		grid[i][j] = -1;

		dfs(grid, i + 1, j);
		dfs(grid, i - 1, j);
		dfs(grid, i, j + 1);
		dfs(grid, i, j - 1);

	}
}