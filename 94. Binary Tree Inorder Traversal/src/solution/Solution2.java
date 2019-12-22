/*******************************************
 * Recursive solution
 */
package solution;

import java.util.*;
import main.TreeNode;

public class Solution2 {
	public List<Integer> inorderTraversal(TreeNode root) {

		List<Integer> answer = new ArrayList<>();
		inorderTraversalHelper(root, answer);
		return answer;

	}

	private void inorderTraversalHelper(TreeNode root, List<Integer> answer) {

		if (root == null)
			return;

		inorderTraversalHelper(root.left, answer);
		answer.add(root.val);
		inorderTraversalHelper(root.right, answer);

	}
}
