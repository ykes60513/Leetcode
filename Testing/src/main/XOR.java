package main;

import java.util.*;

public class XOR {

	public static void main(String[] args) {

		System.out.println(1 ^ 1 ^ 3 ^ 2 ^ 2 ^ 3 ^ 4);
		// int t = 5;
		System.out.println(Integer.toBinaryString(60));
		System.out.println(Integer.toBinaryString(240));

		System.out.println(60 << 2);

		System.out.println(5 / 2);

		System.out.println(0 ^ 0);

		System.out.println(Integer.toBinaryString(2));
		System.out.println(Integer.toBinaryString(-3));
		System.out.println(2 & -3);

		Set<Integer> sourceSet = new HashSet<>(Arrays.asList(0, 1, 2, 3, 4, 5));
		Integer[] targetArray = sourceSet.toArray(new Integer[0]);
		for(int i : targetArray)
			System.out.println(i);

	}

}
