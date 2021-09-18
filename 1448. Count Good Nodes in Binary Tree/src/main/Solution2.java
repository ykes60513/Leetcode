/******************************
 * Given a binary tree root, 
 * a node X in the tree is named good 
 * if in the path from root to X there are no nodes with a value greater than X.
 * Return the number of good nodes in the binary tree.
 * https://leetcode.com/problems/count-good-nodes-in-binary-tree/
 */

package main;

public class Solution2 {
	int res = 0;

	public int goodNodes(TreeNode root) {

		dfs(root, root.val);

		return res;

	}

	private void dfs(TreeNode node, int val) {

		if (node == null)
			return;

		if (node.val >= val)
			res++;

		val = Math.max(node.val, val);

		dfs(node.left, val);
		dfs(node.right, val);

	}
}
