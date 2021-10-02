package main;

import java.util.*;

public class Solution {
	public List<Integer> postorder(Node root) {

		List<Integer> result = new ArrayList<>();
		Stack<Node> stack = new Stack<>();

		if (root == null)
			return result;

		stack.push(root);

		while (!stack.isEmpty()) {

			Node node = stack.pop();
			result.add(0, node.val);

			for (Node children : node.children) {
				stack.push(children);
			}
		}

		return result;
	}
}
