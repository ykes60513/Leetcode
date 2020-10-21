/************************************
 * DFS
 */

package solution;


public class Solution1 {

	private int row;
	private int col;

	public void solve(char[][] board) {

		if (board == null || board.length == 0 || board[0].length == 0)
			return;

		this.row = board.length;
		this.col = board[0].length;

		boolean[][] check = new boolean[row][col];

		for (int i = 0; i < row; i++) {
			if (board[i][0] == 'O')
				dfs(board, i, 0, check);
			if (board[i][col - 1] == 'O')
				dfs(board, i, col - 1, check);
		}
		for (int j = 0; j < col; j++) {
			if (board[0][j] == 'O')
				dfs(board, 0, j, check);
			if (board[row - 1][j] == 'O')
				dfs(board, row - 1, j, check);
		}

		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				if (board[i][j] == 'O' && !check[i][j])
					board[i][j] = 'X';
			}
		}

	}

	private void dfs(char[][] board, int i, int j, boolean[][] check) {

		if (i < 0 || i >= row || j < 0 || j >= col || board[i][j] == 'X' || check[i][j])
			return;

		check[i][j] = true;

		dfs(board, i + 1, j, check);
		dfs(board, i - 1, j, check);
		dfs(board, i, j + 1, check);
		dfs(board, i, j - 1, check);

	}
}
