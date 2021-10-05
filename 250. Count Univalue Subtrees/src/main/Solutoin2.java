package main;

public class Solutoin2 {
	int count = 0;

	public int countUnivalSubtrees(TreeNode root) {
		if (root == null)
			return 0;
		check(root);
		return count;
	}

	private boolean check(TreeNode subtree) {
		if (subtree.left == null && subtree.right == null) {
			count++;
			return true;
		}
		boolean flag = true;
		if (subtree.left != null) {
			if (check(subtree.left)) {
				if (subtree.val != subtree.left.val) {
					flag = false;
				}
			} else {
				flag = false;
			}
		}
		if (subtree.right != null) {
			if (check(subtree.right)) {
				if (subtree.val != subtree.right.val) {
					flag = false;
				}
			} else {
				flag = false;
			}
		}
		if (flag == false) {
			return false;
		}
		count++;
		return true;
	}
}
