package main;

import java.util.*;

public class Solution {
	int[] inorder;
	int[] postorder;
	HashMap<Integer, Integer> idx_map = new HashMap<Integer, Integer>();
	int post_idx;

	public TreeNode buildTree(int[] inorder, int[] postorder) {
		
		this.inorder = inorder;
		this.postorder = postorder;
		post_idx = postorder.length - 1;

		int idx = 0;
		for (Integer x : inorder)
			idx_map.put(x, idx++);
		return helper(0, inorder.length - 1);
	}

	public TreeNode helper(int in_L, int in_R) {
		if (in_L > in_R)
			return null;
		int root_val = postorder[post_idx];
		TreeNode root = new TreeNode(root_val);

		int idx = idx_map.get(root_val);

		post_idx--;
		root.right = helper(idx + 1, in_R);
		root.left = helper(in_L, idx - 1);
		return root;
	}
}
