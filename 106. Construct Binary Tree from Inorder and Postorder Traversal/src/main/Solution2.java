package main;

public class Solution2 {
	public TreeNode buildTree(int[] inorder, int[] postorder) {

		return Helper(0, inorder.length - 1, 0, postorder.length - 1, inorder, postorder);

	}

	private TreeNode Helper(int x, int y, int a, int b, int[] inorder, int[] postorder) {

		if (x > y)
			return null;

		if (a > b)
			return null;
		
		TreeNode root = new TreeNode(postorder[b]);

		int index = x;

		while (index <= y) {

			if (inorder[index] == postorder[b])
				break;

			index++;
		}

		root.left = Helper(x, index - 1, a, index - 1 + a - x, inorder, postorder);
		root.right = Helper(index + 1, y, index - y + b, b - 1, inorder, postorder);

		return root;
	}
}
