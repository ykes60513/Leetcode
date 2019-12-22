/*******************************************
 * Iterative solution
 */
package solution;

import java.util.*;

import main.TreeNode;

public class Solution1 {
	 public List<Integer> preorderTraversal(TreeNode root) {
		 
	        List<Integer> list = new ArrayList<>();
	        Stack<TreeNode> stack = new Stack<>();
	        while (root != null || !stack.isEmpty()) {
	            if (root != null) {
	                list.add(root.val);
	                stack.push(root);
	                root = root.left;
	            } else {
	                root = stack.pop().right;
	            }
	        }
	        return list;
	    }
}
