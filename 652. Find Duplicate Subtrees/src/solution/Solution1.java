package solution;

import java.util.*;

public class Solution1 {
	int t;
	Map<String, Integer> trees;
	Map<Integer, Integer> count;
	List<TreeNode> ans;

	public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
		t = 1;
		trees = new HashMap<>();
		count = new HashMap<>();
		ans = new ArrayList<>();
		serialize(root);
		return ans;
	}

	public int serialize(TreeNode node) {
		if (node == null)
			return 0;
		String serial = "(" + node.val + ",(" + serialize(node.left) + "),(" + serialize(node.right) + ")";
		int uid = trees.computeIfAbsent(serial, x -> t++);
		count.put(uid, count.getOrDefault(uid, 0) + 1);
		if (count.get(uid) == 2)
			ans.add(node);
		return uid;
	}
}

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;

	TreeNode(int x) {
		val = x;
	}
}