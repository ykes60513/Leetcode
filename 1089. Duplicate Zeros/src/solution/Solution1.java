package solution;

import java.util.*;

public class Solution1 {
	public void duplicateZeros(int[] arr) {
		
		List<Integer> list = new LinkedList<>();
        for(int i = 0; i < arr.length; i++){
            
            list.add(arr[i]);
            if(arr[i]==0)
                list.add(0);
            
        }
        
        list = list.subList(0, arr.length);
        
        for(int i = 0; i < arr.length; i++)
        	arr[i] = list.get(i);
    }

}
