package solution;

public class Solution {
	public boolean canFinish(int numCourses, int[][] prerequisites) {

		boolean[] visited = new boolean[numCourses];
		int[][] course = new int[numCourses][numCourses];
		for (int[] pair : prerequisites) {
			course[pair[0]][pair[1]] = 1;
		}
		
		for(int[] pair : prerequisites) {
			visited[pair[0]] = true;
				dfs(visited, course);
		}

	}
	
	private void dfs
}
