package solution;

import java.util.Arrays;
import java.util.Comparator;

public class main {

	public static void main(String[] args) {
		
		//[[1,3],[2,6],[8,10],[15,18]]
		
		
		int[][] result = new int[][]{{1,3},{8,10},{2,6},{15,18}};
		
		
		Arrays.sort(result, new Comparator<int[]>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				return o1[0] < o2[0] ? -1 : 1;
			}
		});
		
		for(int i = 0; i < result.length; i++) {
			for(int j = 0; j < result[0].length; j++)
				System.out.print(result[i][j] + " ");
			System.out.print("\n");
		}
		//System.out.println(result[0][0]);

	}

}
