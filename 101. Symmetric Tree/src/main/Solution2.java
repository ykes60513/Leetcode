/***************************
 * Iterative solution
 */

package main;

import java.util.*;

public class Solution2 {
	 public boolean isSymmetric(TreeNode root) {
		 
	        Queue<TreeNode> q = new LinkedList<>();
	        
	        if(root == null) return true;
	        q.offer(root.left);
	        q.offer(root.right);
	        while (!q.isEmpty()) {
	            TreeNode t1 = q.poll();
	            TreeNode t2 = q.poll();
	            if (t1 == null && t2 == null) continue;
	            if (t1 == null || t2 == null) return false;
	            if (t1.val != t2.val) return false;
	            q.offer(t1.left);
	            q.offer(t2.right);
	            q.offer(t1.right);
	            q.offer(t2.left);
	        }
	        return true;
	    }
}
