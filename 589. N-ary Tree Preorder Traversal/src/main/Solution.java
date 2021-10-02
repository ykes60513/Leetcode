/***********************************
 * Iterative
 */
package main;

import java.util.*;

public class Solution {
	public List<Integer> preorder(Node root) {
		
		List<Integer> result = new ArrayList<>();
		if (root == null)
			return result;

		Stack<Node> stack = new Stack<>();
		stack.add(root);

		while (!stack.isEmpty()) {
			Node curr = stack.pop();
			result.add(curr.val);
			for (int i = curr.children.size() - 1; i >= 0; i--) {
				stack.push(curr.children.get(i));
			}
		}
		return result;
	}
}
