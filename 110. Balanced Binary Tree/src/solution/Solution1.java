/****************************************
 * Bottom-up recursion solution
 */
package solution;

import main.TreeNode;

public class Solution1 {
	public boolean isBalanced(TreeNode root) {

		return heightcheck(root) != -1;

	}

	private int heightcheck(TreeNode root) {

		if (root == null)
			return 0;

		int left = heightcheck(root.left);
		int right = heightcheck(root.right);

		if (left == -1 || right == -1 || Math.abs(left - right) > 1)
			return -1;

		return Math.max(left, right) + 1;

	}
}
