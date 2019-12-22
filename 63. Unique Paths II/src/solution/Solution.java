package solution;

public class Solution {
	public int uniquePathsWithObstacles(int[][] obstacleGrid) {

		int m = obstacleGrid.length;
		int n = obstacleGrid[0].length;

		if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1)
			return 0;

		int[][] matrix = new int[m][n];

		matrix[0][0] = 1;

		for (int i = 0; i < m; i++) {

			for (int j = 0; j < n; j++) {

				if (i != 0 && obstacleGrid[i - 1][j] != 1)
					matrix[i][j] += matrix[i - 1][j];
				if (j != 0 && obstacleGrid[i][j - 1] != 1)
					matrix[i][j] += matrix[i][j - 1];

			}
		}

		return matrix[m - 1][n - 1];

	}
}
