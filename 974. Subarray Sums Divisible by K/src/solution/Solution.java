/********************
 * prefix sum
 */

package solution;

public class Solution {
	public int subarraysDivByK(int[] A, int K) {

		int[] prefixSum = new int[A.length + 1];
		int sum = 0;
		
		for (int i = 1; i < A.length; ++i) {
			sum += A[i];
			prefixSum[i] = sum;
		}

		int[] count = new int[K];
		
		for (int x : prefixSum)
			count[(x % K + K) % K]++;

		int ans = 0;
		for (int v : count)
			ans += v * (v - 1) / 2;
		return ans;
	}
}
