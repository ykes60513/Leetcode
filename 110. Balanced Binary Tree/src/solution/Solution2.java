/*****************************************
 * Top-down recursive solution
 */

package solution;

import main.TreeNode;

public class Solution2 {

	public boolean isBalanced(TreeNode root) {
		if (root == null) {
			return true;
		}

		return Math.abs(height(root.left) - height(root.right)) < 2 && isBalanced(root.left) && isBalanced(root.right);
	}

	private int height(TreeNode root) {
		if (root == null) {
			return 0;
		}
		return 1 + Math.max(height(root.left), height(root.right));
	}
}
