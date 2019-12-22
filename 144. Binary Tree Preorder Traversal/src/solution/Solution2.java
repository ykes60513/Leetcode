/***************************************
 * Recursive solution
 */
package solution;

import java.util.*;

import main.TreeNode;

public class Solution2 {

	public List<Integer> preorderTraversal(TreeNode root) {
		List<Integer> answer = new ArrayList<>();
		preorderTraversal(root, answer);
		return answer;
	}

	private void preorderTraversal(TreeNode root, List<Integer> answer) {
		if (root == null) {
			return;
		}
		answer.add(root.val); // visit the root
		preorderTraversal(root.left, answer); // traverse left subtree
		preorderTraversal(root.right, answer); // traverse right subtree
	}

}
