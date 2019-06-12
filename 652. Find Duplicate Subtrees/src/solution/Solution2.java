package solution;

import java.util.*;

public class Solution2 {
	
	Map<String,Integer> map;
    List<TreeNode> result;
    
    public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
        
        map = new HashMap<>();
        result = new ArrayList<>();
        serialize(root);
        return result;
    }

    public String serialize(TreeNode node) {
        if (node == null) return "";
        String serial = "(" + node.val + ",(" + serialize(node.left) + "),(" + serialize(node.right) + ")";
        
        map.put(serial, map.getOrDefault(serial, 0) + 1);
        
        if(map.get(serial)==2)
            result.add(node);
        
        return serial;
    }
}
