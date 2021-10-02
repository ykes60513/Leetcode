package main;

public class Solution {

	int ans = 0;

	public int maxDepth(Node root) {

		if (root == null)
			return 0;

		maxDepthHelper(root, 1);
		return ans;
	}

	private void maxDepthHelper(Node node, int depth) {

		if (node.children.size() == 0) {
			ans = Math.max(ans, depth);
			return;
		}

		for (Node children : node.children)
			maxDepthHelper(children, depth + 1);

	}
}
