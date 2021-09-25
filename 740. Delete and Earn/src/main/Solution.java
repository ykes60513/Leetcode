package main;

public class Solution {
	public int deleteAndEarn(int[] nums) {
		int[] buckets = new int[10001];
		for (int num : nums) { 
			buckets[num] += num;
		}
		
		
		int maxTwoBefore = 0;
		int maxOneBefore = 0;
		
		for (int i = 0; i < buckets.length; i++) {
			int maxCurr = Math.max(maxTwoBefore + buckets[i], maxOneBefore);
			maxTwoBefore = maxOneBefore;
			maxOneBefore = maxCurr;
		}
		return maxOneBefore;
	}
}
