package solution;

public class Solution {
	public int findMin(int[] nums) {

		int mid;
		int left = 0;
		int right = nums.length - 1;

		while (nums[left] > nums[right]) {

			mid = left + (right - left) / 2;

			if (nums[mid] >= nums[left]) // left part
				left = mid + 1;
			else
				right = mid; // right part
		}

		return nums[left];
	}
}
