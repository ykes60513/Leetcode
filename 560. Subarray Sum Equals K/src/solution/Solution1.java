/*********************************
 *  Using Cumulative Sum
 *  
 *  Time Complexity: O(n^2)
 *  Space Complexity: O(n) 
 * 
 */

package solution;

public class Solution1 {
	public int subarraySum(int[] nums, int k) {

		final int n = nums.length;
		int[] sums = new int[n + 1];
		for (int i = 1; i <= n; i++)
			sums[i] = sums[i - 1] + nums[i - 1];

		int ans = 0;
		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++)
				if (sums[j + 1] - sums[i] == k)
					ans++;
		}

		return ans;
	}
}
