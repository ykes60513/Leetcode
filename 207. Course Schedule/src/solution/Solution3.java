package solution;

import java.util.*;

public class Solution3 {
	public boolean canFinish(int numCourses, int[][] prerequisites) {
		if (numCourses == 0 || prerequisites.length == 0)
			return true;

		// Convert graph presentation from edges to indegree of adjacent list.
		int indegree[] = new int[numCourses];
		for (int i = 0; i < prerequisites.length; i++) // Indegree - how many prerequisites are needed.
			indegree[prerequisites[i][0]]++;

		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < numCourses; i++)
			if (indegree[i] == 0)
				queue.offer(i);

		int canFinishCount = 0;
		
		while (!queue.isEmpty()) {
			int prerequisite = queue.poll(); // Already finished this prerequisite course.
			canFinishCount++;
			for (int i = 0; i < prerequisites.length; i++) {
				if (prerequisites[i][1] == prerequisite) {
					indegree[prerequisites[i][0]]--;
					if (indegree[prerequisites[i][0]] == 0) {
						queue.offer(prerequisites[i][0]);
					}
				}
			}
		}

		return (canFinishCount == numCourses);
	}
}
