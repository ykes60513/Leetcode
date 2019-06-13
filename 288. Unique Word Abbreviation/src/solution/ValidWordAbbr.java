package solution;

import java.util.*;

public class ValidWordAbbr {

	Map<String, Set<String>> map;

	public ValidWordAbbr(String[] dictionary) {

		map = new HashMap<>();

		for (String s : dictionary) {
			String sc = convert(s);
			if (!map.containsKey(sc)) {
				Set<String> set = new HashSet<>();
				set.add(s);
				map.put(sc, set);
			} else {

				Set<String> set = map.get(sc);
				set.add(s);
			}
		}
	}

	public boolean isUnique(String word) {

		String sc = convert(word);
		if (!map.containsKey(sc))
			return true;
		else {

			Set<String> set = map.get(sc);
			if (set.size() == 1 && set.contains(word))
				return true;
		}
		return false;

	}

	private String convert(String s) {
		int n = s.length();
		if (n <= 2) {
			return s;
		} else {
			StringBuilder sb = new StringBuilder();
			sb.append(s.charAt(0)).append(n - 2).append(s.charAt(n - 1));
			return sb.toString();
		}
	}
}
