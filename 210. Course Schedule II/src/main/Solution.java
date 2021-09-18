/********************************
 * There are a total of numCourses courses you have to take, labeled from 0 to numCourses - 1.
 * You are given an array prerequisites where prerequisites[i] = [ai, bi]
 * indicates that you must take course bi first if you want to take course ai.
 * 
 * Return the ordering of courses you should take to finish all courses. If there are many valid answers,
 * return any of them. If it is impossible to finish all courses, return an empty array.
 * https://leetcode.com/problems/course-schedule-ii/
 */
package main;

import java.util.*;

public class Solution {
	public int[] findOrder(int numCourses, int[][] prerequisites) {

		if (numCourses == 0)
			return null;

		// Convert graph presentation from edges to indegree of adjacent list.
		int indegree[] = new int[numCourses];
		int order[] = new int[numCourses];
		int index = 0;
		
		for (int i = 0; i < prerequisites.length; i++) // Indegree - how many prerequisites are needed.
			indegree[prerequisites[i][0]]++;

		Queue<Integer> queue = new LinkedList<Integer>();
		for (int i = 0; i < numCourses; i++)
			if (indegree[i] == 0) {
				// Add the course to the order because it has no prerequisites.
				order[index++] = i;
				queue.offer(i);
			}

		// How many courses don't need prerequisites.
		while (!queue.isEmpty()) {
			int prerequisite = queue.poll(); // Already finished this prerequisite course.
			for (int i = 0; i < prerequisites.length; i++) {
				if (prerequisites[i][1] == prerequisite) {
					indegree[prerequisites[i][0]]--;
					if (indegree[prerequisites[i][0]] == 0) {
						// If indegree is zero, then add the course to the order.
						order[index++] = prerequisites[i][0];
						queue.offer(prerequisites[i][0]);
					}
				}
			}
		}

		return (index == numCourses) ? order : new int[0];
	}

}
