package main;

import java.util.*;

public class TEST0 {
	
	
	public static void execute(String stInp) {
		if (stInp==null)
			return;
		String[] word = stInp.replace(",", " ").replace(".", " ").split(" ");
		ArrayList<String> arrWord = new ArrayList<String>();
		HashMap<String, String> hm = new HashMap<>();
		for (String st:word) {
			if (st!=null && st.length()>0) {
				arrWord.add(0, st);  //insert from left
				if (!hm.containsKey(st)) {
					hm.put(st, st);					
				}
			}
		}
		System.out.println("Reversed String=");
		for (String st:arrWord) {
			System.out.print(st+" ");
		}		
		System.out.println();
		System.out.println();
		System.out.println("All Words=");
		for (Object key:hm.keySet()) {
			System.out.print(key+" ");
		}		
	}
	/* You can test your program here*/
	public static void main(String[] args) {
		TEST0.execute("I, Jimmy, saw a saw saw a saw");
	}
	
}
