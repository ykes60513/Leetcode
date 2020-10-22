package solution;

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

	public boolean canAttendMeetings(int[][] intervals) {

		Arrays.sort(intervals, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {

				return o1[0] - o2[2];
			}
		});

		for (int i = 1; i < intervals.length; i++) {

			if (intervals[i][0] > intervals[i - 1][1])
				return false;
		}
		return true;
	}
}
