package solution;

public class Solution2 {
	public int countPrimes(int n) {
		if (n < 3)
			return 0;

		boolean[] prime = new boolean[n + 1];
		prime[0] = true;
		prime[1] = true;

		for (int i = 2; i <= Math.sqrt(n); i++) {
			if (!prime[i]) {
				for (int j = i * i; j <= n; j += i) {
					prime[j] = true;
				}
			}
		}

		int res = 0;
		for (int i = 0; i < n; i++) {
			if (!prime[i])
				res++;
		}
		return res;
	}
}
