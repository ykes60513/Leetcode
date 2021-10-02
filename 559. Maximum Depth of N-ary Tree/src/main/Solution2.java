package main;

public class Solution2 {
	public int maxDepth(Node root) {

		if (root == null)
			return 0;

		return maxDepthHelper(root);

	}

	private int maxDepthHelper(Node node) {

		if (node.children.size() == 0)
			return 1;

		int res = 0;

		for (Node children : node.children) {

			res = Math.max(res, maxDepthHelper(children));
		}

		return res + 1;
	}
}
