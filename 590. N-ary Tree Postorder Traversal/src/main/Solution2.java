package main;

import java.util.*;

public class Solution2 {

	public List<Integer> postorder(Node root) {

		List<Integer> result = new ArrayList<>();

		if (root == null)
			return result;

		postorderTraversal(root, result);

		return result;

	}

	private void postorderTraversal(Node root, List<Integer> result) {

		if (root == null)
			return;

		for (Node children : root.children)
			postorderTraversal(children, result);

		result.add(root.val);
	}
}
