/************************************
 * Given an integer array nums, find the contiguous subarray (containing at least one number) 
 * which has the largest sum and return its sum.
 * A subarray is a contiguous part of an array.
 * https://leetcode.com/problems/maximum-subarray/
 */
package main;

public class Solution {

	public int maxSubArray(int[] nums) {

		int sum = nums[0];
		int result = nums[0];
		for (int i = 1; i < nums.length; i++) {

			sum = (sum > 0) ? sum + nums[i] : nums[i];
			result = (result > sum) ? result : sum;
		}

		return result;
	}
}
