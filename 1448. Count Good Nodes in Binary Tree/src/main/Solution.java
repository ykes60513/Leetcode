/******************************
 * Given a binary tree root, 
 * a node X in the tree is named good 
 * if in the path from root to X there are no nodes with a value greater than X.
 * Return the number of good nodes in the binary tree.
 * https://leetcode.com/problems/count-good-nodes-in-binary-tree/
 */

package main;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	public int goodNodes(TreeNode root) {

		int res = 0;

		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {

			int size = queue.size();
			for (int i = 0; i < size; i++) {

				TreeNode node = queue.poll();
				if (node.left != null) {
					if (node.left.val >= node.val) {
						res++;
					}
					node.left.val = Math.max(node.left.val, node.val);
					queue.offer(node.left);
				}

				if (node.right != null) {
					if (node.right.val >= node.val) {
						res++;
					}
					node.right.val = Math.max(node.right.val, node.val);
					queue.offer(node.right);
				}
			}
		}

		return res + 1;
	}
}
