/************************************
 * Time: O(n)
 * Space: O(1)
 * Jump when you reach currentfarthest to farthest.
 * Update farthest to be maximum jump from the current position. 
 * Update Hence minimizing the number of steps. 
 * Keep checking for farthest on each steps
 */
package main;

public class Solution2 {
	public int jump(int[] nums) {
		
		int jumps = 0;
		int currFarthest = 0;
		int farthest = 0;
		
		for (int i = 0; i < nums.length - 1; i++) {
			farthest = Math.max(farthest, i + nums[i]);
			if (i == currFarthest) {
				currFarthest = farthest;
				jumps++;
			}
		}
		return jumps;
	}
}
