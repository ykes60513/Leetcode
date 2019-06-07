package solution;

import java.util.*;

public class Solution {
	public List<List<String>> groupStrings(String[] strings) {

		Map<String, List<String>> result = new HashMap<>();
		int code = 0;

		for (String s : strings) {

			int k = s.charAt(0) - 'a';
			StringBuilder sb = new StringBuilder();
			sb.append("00");
			for (int i = 1; i < s.length(); i++) {

				code = (s.charAt(i) - 'a' < k) ? s.charAt(i) - 'a' + 26 - k : s.charAt(i) - 'a' - k;
				if (code < 10)
					sb.append(0);

				sb.append(code);

			}
			String scode = sb.toString();
			if (result.containsKey(scode)) {

				List<String> list = result.get(scode);
				list.add(s);

			} else {

				List<String> list = new ArrayList<>();
				list.add(s);
				result.put(scode, list);
			}
		}

		return new ArrayList<>(result.values());
	}
}
