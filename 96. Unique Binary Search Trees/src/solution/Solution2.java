/***************************************
 * G(n+1) = 2*(2n+1)/(n+2) * G(n) , G(0) = 1
 */
package solution;

public class Solution2 {
	public int numTrees(int n) {
		int[] G = new int[n];
		G[0]  = 1;

		for (int i = 1; i < n; i++) {
			
			G[i] = (2 * (2*i-1) / i+1) * G[i-1];
			
		}
		return G[n-1];
	}
}
