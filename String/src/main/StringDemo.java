package main;

import java.util.stream.Stream;

public class StringDemo {

	public static void main(String[] args) {
		
		String demo = "testing 1234";
		
		demo = demo.replace(" ", "");
		
		System.out.println(demo.indexOf("ti"));
		
		System.out.println(demo.indexOf("1", 5));
		
		System.out.println(demo.lastIndexOf("t"));
		
		System.out.println(demo.contains("1243"));
		
		demo = demo.substring(0, demo.length() - 1);
		
		System.out.println(demo);
		
		System.out.println(demo.replaceAll("t", "22"));
		
		demo = "w--x--y--";
		Stream.of(demo.split("--", -1)).forEach(s -> System.out.print(s + " "));
		System.out.println();
		Stream.of(demo.split("--", 0)).forEach(s -> System.out.print(s + "|"));
		System.out.println();
		Stream.of(demo.split("--", 1)).forEach(s -> System.out.print(s + "|"));
		System.out.println();
		Stream.of(demo.split("--", 2)).forEach(s -> System.out.print(s + "|"));
		System.out.println();
		Stream.of(demo.split("--", 3)).forEach(s -> System.out.print(s + "|"));
		System.out.println();
		
		demo = "ykes60513";
		
		//System.out.println(demo.replaceAll("^/d$", "2"));
		
		
		
		
	}

}
