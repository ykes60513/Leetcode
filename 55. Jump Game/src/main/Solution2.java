package main;

public class Solution2 {
	public boolean canJump(int[] nums) {

		int curIndex = 0;
		int length = nums.length;

		while (curIndex < length - 1) {

			curIndex = AfterZero(curIndex, nums);
			System.out.println(curIndex);
			if (curIndex == length) {

				return nums[curIndex - 1] != 0 ? true : canJampHelper(curIndex - 1, nums);

			} else if (!canJampHelper(curIndex, nums)) {

				return false;
			}

		}
		return true;
	}

	private int AfterZero(int curIndex, int[] nums) {

		int i = curIndex;
		while (i < nums.length && nums[i] != 0) {
			i++;
		}
		while (i < nums.length && nums[i] == 0) {
			i++;
		}

		return i;

	}

	private boolean canJampHelper(int curIndex, int[] nums) {

		for (int i = 0; i < curIndex; i++) {

			if (curIndex - i <= nums[i])
				return true;
		}

		return false;
	}
}
