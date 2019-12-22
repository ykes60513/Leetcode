package solution;

import java.util.*;

import main.TreeNode;

public class Solution1 {
	public List<List<Integer>> levelOrder(TreeNode root) {
		
		List<List<Integer>> ans = new LinkedList<>();
		Queue<TreeNode> q = new LinkedList<>(); // queue
		
		if (root != null) {
			q.offer(root);
		}
		
		TreeNode cur;
		while (!q.isEmpty()) {
			int size = q.size();
			List<Integer> subAns = new LinkedList<Integer>();
			for (int i = 0; i < size; ++i) { // traverse nodes in the same level
				cur = q.poll();
				subAns.add(cur.val); // visit the root
				if (cur.left != null) {
					q.offer(cur.left); // push left child to queue if it is not null
				}
				if (cur.right != null) {
					q.offer(cur.right); // push right child to queue if it is not null
				}
			}
			ans.add(subAns);
		}
		return ans;
	}
}
