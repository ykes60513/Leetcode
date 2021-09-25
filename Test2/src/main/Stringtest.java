package main;

public class Stringtest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		long startTime = System.currentTimeMillis();

		
		
		long endTime = System.currentTimeMillis();
		
		byte s = 125;
		
		System.out.println(s);
		
		System.out.println(BCD.getBCDHigitDigit(s));
		System.out.println(BCD.getBCDLowDigit(s));
		System.out.println(endTime - startTime);
		System.out.println(BCD.Dec2Bin(125));
	}
}

class BCD{
	
	static int getBCDLowDigit(byte val) {
		return val & 0x0f;
	}
	
	static int getBCDHigitDigit(byte val) {
		
		return val >>> 4;
	}
	
	static int Dec2Bin(int val) {
		
		StringBuilder sb = new StringBuilder();
		
		while(val != 0) {
			
			sb.append(val%2);
			val = val/2;
		}
		
		return Integer.parseInt(sb.reverse().toString());
	}
	
}
