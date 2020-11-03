package solution;

public class Solution1 {
	public int countPrimes(int n) {

		int res = 0;

		boolean[] prime = new boolean[n + 1];

		for (int i = 2; i < n; i++) {

			if (!prime[i]) {
				for (int j = 2 * i; j < n; j += i)
					prime[j] = true;

				res++;
			}
		}
		return res;

	}
}
