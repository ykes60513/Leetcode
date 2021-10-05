package main;

public class Solution1 {
	
	int count = 0;

	public int countUnivalSubtrees(TreeNode root) {
		count = 0;
		helper(root, Integer.MAX_VALUE);
		return count;
	}

	private boolean helper(TreeNode n, int v) {
		if (n == null) {
			return true;
		}
		boolean left = helper(n.left, n.val);
		boolean right = helper(n.right, n.val);
		if (left && right) {
			count++;
			return n.val == v;
		}
		return false;
	}
}
