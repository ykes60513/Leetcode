/*********************************
 * Backtracking
 */

package main;

public class Solution3 {
	public boolean canJumpFromPosition(int position, int[] nums) {
		if (position == nums.length - 1) {
			return true;
		}

		int furthestJump = Math.min(position + nums[position], nums.length - 1);
		for (int nextPosition = furthestJump; nextPosition > position; nextPosition--) {
			if (canJumpFromPosition(nextPosition, nums)) {
				return true;
			}
		}

		return false;
	}

	public boolean canJump(int[] nums) {
		return canJumpFromPosition(0, nums);
	}
}
