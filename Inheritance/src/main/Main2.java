package main;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Stone();

	}

}

class Atom {

	public Atom() {
		System.out.println("Atom");
	}

}

class Rock extends Atom {

	public Rock(String s) {
		System.out.println(s);
	}

}

class Stone extends Rock {

	public Stone() {
		super("Rock");
		new Rock("Rock");
	}
}