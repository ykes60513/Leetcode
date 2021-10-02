package main;

import java.util.Arrays;

public class Test1 {

	static boolean[][] map = new boolean[5000][5000];

	private static boolean jump(int a, int b, int x, int y) {

		if (map[a][b])
			return false;

		if (a == x && b == y)
			return true;

		map[a][b] = true;

		jump(a + b, b, x, y);
		jump(a - b, b, x, y);
		jump(a, b + b, x, y);
		jump(a, b - b, x, y);

		return false;

	}

	private static void T1(String[] s) {

		int[] intArray = new int[s.length];
		for (int i = 0; i < s.length; i++)
			intArray[i] = Integer.parseInt(s[i]);

		int a = intArray[0];
		int b = intArray[1];
		int x = intArray[2];
		int y = intArray[3];

		map = new boolean[50000][50000];

		System.out.print(jump(a, b, x, y));

	}

	public static void main(String[] args) {
		
		String[] s = {"1", "1", "2", "3"};
		
		Test1.T1(s);
		
	}

}
