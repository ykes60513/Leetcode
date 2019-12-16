/****************
 *  isSame Tree Leetcode No.100
 */
package solution;

import main.TreeNode;

public class Solution2 {
	public boolean isSubtree(TreeNode s, TreeNode t) {
		if (s == null)
			return false;
		if (isSame(s, t))
			return true;
		return isSubtree(s.left, t) || isSubtree(s.right, t);
	}

	private boolean isSame(TreeNode s, TreeNode t) {
		if (s == null || t == null)
			return s == t;

		if (s.val != t.val)
			return false;

		return isSame(s.left, t.left) && isSame(s.right, t.right);
	}
}
