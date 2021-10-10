package main;

public class Solution1 {

	public boolean canJump(int[] nums) {

		int furtherJump = 0;

		for (int index = 0; index < nums.length; index++) {

			if (index > furtherJump)
				return false;

			furtherJump = Math.max(nums[index] + index, furtherJump);
		}
		return true;
	}

}
