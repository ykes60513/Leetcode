/**************************
 * Sorting solution
 */
package solution;

import java.util.Arrays;

public class Solution1 {
	public int findKthLargest(int[] nums, int k) {

		int n = nums.length;
		Arrays.sort(nums);
		return nums[n - k];

	}
}
