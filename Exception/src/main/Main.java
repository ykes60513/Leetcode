package main;

import java.io.IOException;

public class Main {

	public static void main(String[] args) throws Exception {
	
		try {
			throw new IOException();
	
		}catch(IOException e) {
			
			System.out.println("IOException!");
		}catch(Exception e) {
			System.out.println("Exception!");
			throw new IOException();
		}finally {
			
			System.out.println("Finally!");
		}
		
		System.out.println("The end");
		
	
	}

}
