package main;

import java.io.*;

public class Main {

	public static int[] Convert(String s) {

		s = s.trim().substring(1, s.length() - 1);
		if (s.length() == 0) {
			return new int[0];
		}

		String[] number = s.split(",");
		int[] output = new int[number.length];

		int i = 0;
		while (i < number.length) {
			output[i] = Integer.parseInt(number[i].trim());
			i++;
		}
		return output;
	}

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		String line;
		while ((line = in.readLine()) != null) {
			int[] numbers = Convert(line);

			int result = new Solution().area(numbers);
			System.out.println(result);
		}
	}
}

class Solution {
	public int area(int[] input) {

		int result = 0;
		int lo = 0;
		int hi = input.length - 1;

		while (lo < hi) {

			result = Math.max(result, Math.min(input[lo], input[hi]) * (hi - lo));

			if (input[lo] < input[hi])
				lo++;
			else
				hi--;
		}

		return result;
	}
}