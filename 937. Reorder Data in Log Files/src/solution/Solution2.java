package solution;

import java.util.Arrays;

public class Solution2 {
	public String[] reorderLogFiles(String[] logs) {

		Arrays.sort(logs, (s1, s2) -> {

			String[] split1 = s1.split(" ", 2);
			String[] split2 = s2.split(" ", 2);
			boolean isDigit1 = Character.isDigit(split1[1].charAt(0));
			boolean isDigit2 = Character.isDigit(split2[1].charAt(0));
			if (!isDigit1 && !isDigit2) {
				int comp = split1[1].compareTo(split2[1]);
				if (comp != 0)
					return comp;
				return split1[0].compareTo(split2[0]);
			}
			return isDigit1 ? (isDigit2 ? 0 : 1) : -1;
			// 1: swap, 0: totally the same,  -1: do nothing  
		});

		return logs;
	}

}
