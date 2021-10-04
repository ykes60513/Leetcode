package main;

public class Solution1 {
	public boolean isSymmetric(TreeNode root) {

		if (root == null)
			return true;

		return symmetricHelper(root.left, root.right);

	}

	private boolean symmetricHelper(TreeNode left, TreeNode right) {

		if (left == null || right == null)
			return left == right;

		return left.val == right.val && symmetricHelper(left.left, right.right)
				&& symmetricHelper(left.right, right.left);

	}

}
