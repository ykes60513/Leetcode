package main;

import java.util.*;

public class Solution2 {
	public List<Integer> preorder(Node root) {
		
		List<Integer> result = new ArrayList<>();
		if (root == null)
			return result;
		traversePreOrder(root, result);
		return result;
	}

	private void traversePreOrder(Node root, List<Integer> result) {
		if (root == null)
			return;
		result.add(root.val);
		for (Node child : root.children)
			traversePreOrder(child, result);
	}
}
