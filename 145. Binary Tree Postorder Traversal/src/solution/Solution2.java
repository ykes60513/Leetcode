/************************************
 * Recursive solution
 */
package solution;

import java.util.*;

import main.TreeNode;

public class Solution2 {
	public List<Integer> postorderTraversal(TreeNode root) {

		List<Integer> answer = new ArrayList<>();
		postorderTraversalHelper(root, answer);

		return answer;
	}

	private void postorderTraversalHelper(TreeNode root, List<Integer> answer) {

		if (root == null)
			return;

		postorderTraversalHelper(root.left, answer);
		postorderTraversalHelper(root.right, answer);
		answer.add(root.val);
	}

}
