package solution;

public class Solution {

	int Max = 0;
	int num = 0;

	public int maxAreaOfIsland(int[][] grid) {

		for (int i = 0; i < grid.length; i++) {

			for (int j = 0; j < grid[0].length; j++) {

				if (grid[i][j] == 1) {
					num = 0;
					dfs(grid, i, j);
					Max = Math.max(num, Max);
				}

			}
		}

		return Max;
	}

	private void dfs(int[][] grid, int i, int j) {

		if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0)
			return;

		grid[i][j] = 0;
		num++;

		dfs(grid, i + 1, j);
		dfs(grid, i - 1, j);
		dfs(grid, i, j + 1);
		dfs(grid, i, j - 1);

	}

}
