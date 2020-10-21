/**************************
 * DFS solution
 */

package solution;

public class Solution2 {

	private int row;
	private int col;

	public void wallsAndGates(int[][] rooms) {

		if (rooms == null || rooms.length == 0)
			return;

		this.row = rooms.length;
		this.col = rooms[0].length;

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {

				if (rooms[i][j] == 0)
					dfs(rooms, i, j, 0);
			}
		}
	}

	private void dfs(int[][] rooms, int r, int c, int parent) {
		if (r < 0 || c < 0 || r == row || c == col || rooms[r][c] < parent)
			return;

		rooms[r][c] = parent;
		dfs(rooms, r + 1, c, parent + 1);
		dfs(rooms, r - 1, c, parent + 1);
		dfs(rooms, r, c + 1, parent + 1);
		dfs(rooms, r, c - 1, parent + 1);

	}

}
