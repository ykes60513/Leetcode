package solution;

import java.util.Arrays;
import java.util.Collections;

/***********************************
 * DFS+Greedy+Backtracking
 * 
 * @author ICHIGO
 *
 */
public class Solution3 {

	int result = Integer.MAX_VALUE;		// initialize answer with plus infinity for comparison later on

	public int coinChange(int[] coins, int amount) {
	      
		 Arrays.sort(coins);
		 reverse(coins);
		 
		 coinHelper(coins, coins.length-1 , amount, 0);
		 
		 return result == Integer.MAX_VALUE ? -1 : result;
		 
	    }

	private void coinHelper(int[] coins, int s, int amount, int count) {
	}
	
	private void reverse(int[] a) {
		
		int i = 0;
		int j = a.length-1;
		
		while(i < j) {
			
			int temp  = a[i];
			a[i++] = a[j];
			a[j--] = temp; 
			
		}
		
	}


}
