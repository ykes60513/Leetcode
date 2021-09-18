/*************************************
 * In an infinite chess board with coordinates from -infinity to +infinity, 
 * you have a knight at square [0, 0].
 * Return the minimum number of steps needed to move the knight to the square [x, y].
 * It is guaranteed the answer exists.
 * https://leetcode.com/problems/minimum-knight-moves/
 */
package main;

import java.util.*;

public class Solution {

	private static List<int[]> DIRECTIONS = Arrays.asList(new int[] { 2, 1 }, new int[] { 1, 2 }, new int[] { -2, 1 },
			new int[] { -1, 2 }, new int[] { 2, -1 }, new int[] { 1, -2 }, new int[] { -1, -2 }, new int[] { -2, -1 });

	public int minKnightMoves(int x, int y) {

		if (x == 0 && y == 0)
			return 0;

		Queue<int[]> queue = new LinkedList<>();
		int res = 0;

		queue.offer(new int[] { 0, 0 });

		while (!queue.isEmpty()) {

			int size = queue.size();
			res++;

			for (int i = 0; i < size; i++) {

				int[] kight = queue.poll();

				for (int[] d : DIRECTIONS) {

					if (Math.abs(x - kight[0]) >= 1 && Math.abs(x - kight[0]) < Math.abs(x - kight[0] - d[0]))
						continue;

					if (Math.abs(y - kight[1]) >= 1 && Math.abs(y - kight[1]) < Math.abs(y - kight[1] - d[1]))
						continue;

					int r = kight[0] + d[0];
					int c = kight[1] + d[1];

					if (r == x && c == y)
						return res;

					queue.offer(new int[] { r, c });
				}
			}

		}

		throw new RuntimeException("No solution found!");
	}
}
