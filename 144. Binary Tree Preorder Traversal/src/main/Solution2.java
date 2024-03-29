/********************************
 * Iterative
 */
package main;

import java.util.*;

public class Solution2 {
	public List<Integer> preorderTraversal(TreeNode root) {

		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();

		if (root == null)
			return result;

		stack.push(root);

		while (!stack.isEmpty()) {

			TreeNode node = stack.pop();
			result.add(node.val);

			if (node.right != null)
				stack.push(node.right);

			if (node.left != null)
				stack.push(node.left);

		}

		return result;

	}
}
