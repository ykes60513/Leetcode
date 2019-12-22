/*********************************
 * Iterative solution
 */
package solution;

import java.util.*;

import main.TreeNode;

public class Solution1 {
	public List<Integer> postorderTraversal(TreeNode root) {

		LinkedList<Integer> answer = new LinkedList<>();
		Stack<TreeNode> stack = new Stack<>();

		while (root != null || !stack.isEmpty()) {

			if (root != null) {

				stack.push(root);
				answer.addFirst(root.val);	// Reverse the process of preorder
				root = root.right;			// Reverse the process of preorder
			} else {

				root = stack.pop().left;	// Reverse the process of preorder

			}

		}

		return answer;
	}
}
