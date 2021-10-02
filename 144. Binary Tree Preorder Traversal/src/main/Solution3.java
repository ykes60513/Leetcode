/***************************************
 * Recursive solution
 */
package main;

import java.util.*;

public class Solution3 {

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
