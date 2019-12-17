package solution;

public class Solution {
	public void rotate(int[] nums, int k) {

		int n = nums.length;

		k = k % n;

		swap(nums, 0, n - 1);
		swap(nums, 0, k - 1);
		swap(nums, k, n - 1);

	}

	private void swap(int[] nums, int i, int j) {

		while (i < j) {

			int temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			i++;
			j--;

		}

	}
}
