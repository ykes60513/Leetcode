package main;

public class Solution {
	public boolean hasPathSum(TreeNode root, int sum) {

		if (root == null)
			return false;

		if (root.left == null && root.right == null) {

			return root.val == sum;
		} else {

			return hasPathSum(root.left, sum - root.val) || hasPathSum(root.right, sum - root.val);
		}

	}

}
