package main;

public class Solution3 {
	int ans = 0;

	public int countUnivalSubtrees(TreeNode root) {

		helper(root);

		return ans;

	}

	private boolean helper(TreeNode root) {

		if (root == null)
			return true;

		boolean left = helper(root.left);
		boolean right = helper(root.right);

		if (left && right) {

			if (root.left == null && root.right == null) {
				ans++;
				return true;
			} else if (root.left == null && root.right != null && root.val == root.right.val) {
				ans++;
				return true;
			} else if (root.left != null && root.right == null && root.val == root.left.val) {
				ans++;
				return true;
			} else if (root.left != null && root.right != null && root.val == root.left.val
					&& root.val == root.right.val) {
				ans++;
				return true;
			}
		}

		return false;
	}
}
