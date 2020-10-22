/*****************************
 * Binary Search(2)
 * 
 * Time complexity = O(nlogn)
 * Space complexity = O(1)
 */

package solution;

public class Solution2 {
	public int findDuplicate(int[] nums) {

		int min = 0;
		int max = nums.length;

		while (min < max) {

			int mid = min + (max - min) / 2;
			int count = 0;
			for (int num : nums)
				if (num <= mid)
					count++;

			if (count > mid)
				max = mid;
			else
				min = mid + 1;

		}

		return min;
	}

}
