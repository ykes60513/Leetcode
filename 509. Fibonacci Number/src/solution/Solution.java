package solution;

public class Solution {
	public int fib(int N) {

		if (N == 0)
			return 0;

		if (N == 1)
			return 1;

		int first = 0;
		int second = 1;

		for (int i = 3; i <= N; i++) {

			int third = first + second;
			first = second;
			second = third;
		}
		return second;

	}
}
