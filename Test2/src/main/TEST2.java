package main;

import java.util.*;

public class TEST2 {

	private static void execute(String s) {

		String[] sarray = s.replace(",", "").replace(".", "").split(" ");

		Map<String, Integer> map = new HashMap<>();
		Set<String> set = new HashSet<>();

		StringBuilder sb = new StringBuilder();
		for (String sa : sarray) {
			if (sa != null && sa.length() > 0) {
				set.add(sa);
				sb.insert(0, sa).insert(0, " ");
				map.put(sa, map.getOrDefault(sa, 0) + 1);
			}

		}

		System.out.println("Reversed String=");
		System.out.println(sb.toString().trim());

		System.out.println();
		System.out.println();
		System.out.println("All Words=");
		map.forEach((u, v) -> System.out.println(u + " : " + v));
		map.keySet().forEach(System.out::println);

	}

	public static void main(String[] args) {
		TEST2.execute("I, Jimmy, saw a   saw saw a saw");
	}

}
