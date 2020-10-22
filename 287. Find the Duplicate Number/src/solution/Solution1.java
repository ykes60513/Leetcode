/**************************************
 * Binary Search(1)
 * 
 * Time complexity = O(nlogn)
 * Space complexity = O(1)
 */

package solution;

public class Solution1 {
	public int findDuplicate(int[] nums) {

		int min = 0;
		int max = nums.length - 1;

		while (min <= max) {

			int mid = (max - min) / 2 + min;
			int count = 0;
			for (int i = 0; i < nums.length; i++) {
				if (nums[i] <= mid)
					count++;

			}

			if (count > mid) {
				max = mid - 1;
			} else {
				min = mid + 1;
			}

		}

		return min;
	}

}
