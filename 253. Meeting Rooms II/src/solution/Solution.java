/****************************************
 * Given an array of meeting time intervals intervals where intervals[i] = [starti, endi],
 * return the minimum number of conference rooms required.
 * https://leetcode.com/problems/meeting-rooms-ii/
 *  * PrioritiQueue
 */

package solution;

import java.util.*;

public class Solution {

	public int minMeetingRooms(int[][] intervals) {

		if (intervals.length == 0) {
			return 0;
		}

		// Sort intervals by start time
		Arrays.sort(intervals, new Comparator<int[]>() {

			@Override
			public int compare(int[] a, int[] b) {
				return a[0] - b[0];
			}
		});

		PriorityQueue<Integer> queue = new PriorityQueue<>(intervals.length, new Comparator<Integer>() {

			@Override
			public int compare(Integer a, Integer b) {

				return a - b;
			}
		});

		queue.add(intervals[0][1]);

		for (int i = 1; i < intervals.length; i++) {

			if (intervals[i][0] >= queue.peek()) {
				queue.poll();
			}

			queue.add(intervals[i][1]);
		}

		return queue.size();
	}
}
