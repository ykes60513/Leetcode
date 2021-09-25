package main;

public class Solution {
	public int[] twoSum(int[] numbers, int target) {

		int first = 0, last = numbers.length - 1;

		while (numbers[first] + numbers[last] != target) {
			if (numbers[first] + numbers[last] > target)
				last--;
			else
				first++;
		}
		return new int[] { first + 1, last + 1 };

	}
}
