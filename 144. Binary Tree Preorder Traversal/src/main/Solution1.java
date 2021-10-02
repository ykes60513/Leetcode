/*******************************************
 * Iterative solution
 */
package main;

import java.util.*;

public class Solution1 {
	 public List<Integer> preorderTraversal(TreeNode root) {
		 
	        List<Integer> result = new ArrayList<>();
	        Stack<TreeNode> stack = new Stack<>();
	        while (root != null || !stack.isEmpty()) {
	            if (root != null) {
	                result.add(root.val);
	                stack.push(root);
	                root = root.left;
	            } else {
	                root = stack.pop().right;
	            }
	        }
	        return result;
	    }
}
