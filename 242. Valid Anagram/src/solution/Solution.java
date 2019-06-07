package solution;

import java.util.*;

public class Solution {
	 public boolean isAnagram(String s, String t) {
	        
	        return Arrays.equals(ana(s), ana(t));
	    }
	    
	    private int[] ana(String s){
	        
	        int[] result = new int[26];
	        Arrays.fill(result, 0);
	        for(Character ch : s.toCharArray()){
	            result[ch - 'a']++; 
	        }
	        return result;
	    }
}
