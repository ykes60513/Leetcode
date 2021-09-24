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
		Arrays.sort(intervals, (o1, o2) -> o1[0] - o2[0]);

		PriorityQueue<Integer> queue = new PriorityQueue<>(intervals.length, (a,b) -> a - b);

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
