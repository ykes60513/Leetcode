/*********************
 * Recursive Method
 */

package solution;

import main.TreeNode;

public class Solution1 {
	public boolean isSubtree(TreeNode s, TreeNode t) {
		return traverse(s, t);
	}

	private boolean equals(TreeNode x, TreeNode y) {
		if (x == null && y == null)
			return true;
		if (x == null || y == null)
			return false;
		return x.val == y.val && equals(x.left, y.left) && equals(x.right, y.right);
	}

	private boolean traverse(TreeNode s, TreeNode t) {
		return s != null && (equals(s, t) || traverse(s.left, t) || traverse(s.right, t));
	}
}
