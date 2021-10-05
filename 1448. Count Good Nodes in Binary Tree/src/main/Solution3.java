package main;

public class Solution3 {

	int ans = 0;

	public int goodNodes(TreeNode root) {

		Helper(root, root.val);

		return ans;
	}

	private void Helper(TreeNode node, int max) {

		if (node == null)
			return;

		if (node.val >= max) {
			max = node.val;
			ans++;
		}

		Helper(node.left, max);
		Helper(node.right, max);
	}
}
