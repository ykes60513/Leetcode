/****************************
 * Given an integer n, return the number of structurally unique BST's (binary search trees) 
 * which has exactly n nodes of unique values from 1 to n.
 * https://leetcode.com/problems/unique-binary-search-trees/
 * 
 * Dynamic Programming
 * G(n) = Sigma G(i-1)*G(n-i)
 */
package solution;

public class Solution1 {
	public int numTrees(int n) {
		int[] G = new int[n + 1];
		G[0] = G[1] = 1;

		for (int i = 2; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				G[i] += G[j - 1] * G[i - j];
			}
		}
		return G[n];
	}
}
