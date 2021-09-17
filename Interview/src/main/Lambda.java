package main;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda {

	public static void main(String[] args) {
		
		List<String> list = Arrays.asList(args);
		list = list.stream().map(s -> "TEST--" + s).collect(Collectors.toList());
		System.out.println(list);

	}

}
