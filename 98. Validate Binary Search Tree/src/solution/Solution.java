package solution;

import java.util.*;

import node.*;

public class Solution {
	public boolean isValidBST(TreeNode root) {

		Stack<TreeNode> stack = new Stack<>();

		TreeNode pre = null;
		while (!stack.empty() || root != null) {

			if (root != null) {
				stack.push(root);
				root = root.left;
			} else {
				root = stack.pop();
				if (pre != null && root.val <= pre.val)
					return false;
				pre = root;
				root = root.right;
			}
		}
		return true;
	}
}
