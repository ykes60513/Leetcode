/*****************************************
 * Iterative solution
 */
package solution;

import java.util.*;

import main.TreeNode;

public class Solution1 {
	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> result = new ArrayList<>();
		Stack<TreeNode> stack = new Stack<>();

		while (root != null || !stack.isEmpty()) {

			if (root != null) {

				stack.push(root);
				root = root.left;
			} else {

				root = stack.pop();
				result.add(root.val);
				root = root.right;
			}

		}
		return result;

	}
}
