/*********************************
 * Given the root of a binary tree, 
 * the value of a target node target,and an integer k,
 * return an array of the values of all nodes that have a distance k from the target node.
 * You can return the answer in any order.
 * https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
 */
package main;

import java.util.*;

public class Solution {
	
	Map<TreeNode, TreeNode> parent  = new HashMap<>();

	public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
		
		//DFS find the all nodes of their parents
		dfs(root, null);
		
		Queue<TreeNode> queue = new LinkedList<>();
		Set<TreeNode> seen = new HashSet<>();
		
		queue.add(target);
		seen.add(target);
		
		int dist = 0;
		while (!queue.isEmpty()) {
			int size = queue.size();
			if (dist == K) {
				List<Integer> ans = new ArrayList<>();
				for (TreeNode n : queue)
					ans.add(n.val);
				return ans;
			}
			for (int i = 0; i < size; i++) {
				TreeNode node = queue.poll();
				seen.add(node);
				if (node.left != null && !seen.contains(node.left)) {
					seen.add(node.left);
					queue.offer(node.left);
				}
				if (node.right != null && !seen.contains(node.right)) {
					seen.add(node.right);
					queue.offer(node.right);
				}
				TreeNode par = parent.get(node);
				if (par != null && !seen.contains(par)) {
					seen.add(par);
					queue.offer(par);
				}
			}
			dist++;
		}
		return new ArrayList<Integer>();
	}

	private void dfs(TreeNode node, TreeNode par) {
		if (node != null) {
			parent.put(node, par);
			dfs(node.left, node);
			dfs(node.right, node);
		}
	}
}
