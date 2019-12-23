/**************************
 * DFS solution
 */

package solution;

public class Solution2 {
	public void wallsAndGates(int[][] rooms) {
		for (int i = 0; i < rooms.length; i++) {
			for (int j = 0; j < rooms[i].length; j++) {

				if (rooms[i][j] == 0)
					dfs(rooms, i, j, 0);
			}

		}
	}

	void dfs(int[][] rooms, int r, int c, int parent) {
		if (r < 0 || c < 0 || r == rooms.length || c == rooms[r].length || rooms[r][c] < parent)
			return;

		rooms[r][c] = parent;
		dfs(rooms, r + 1, c, parent + 1);
		dfs(rooms, r - 1, c, parent + 1);
		dfs(rooms, r, c + 1, parent + 1);
		dfs(rooms, r, c - 1, parent + 1);

	}

}
