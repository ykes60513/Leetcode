package solution;

import main.TreeNode;

public class Solution2 {
	public int maxDepth(TreeNode root) {

		if (root == null)
			return 0;

		return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

	}
}
