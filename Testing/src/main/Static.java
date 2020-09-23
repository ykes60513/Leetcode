package main;

/*************************************
 * The static keyword in Java is used for memory management mainly.
 * 
 * 1) Java static variable
 * 	The static variable can be used to refer to the common property of all objects
 * 
 * 2) Java static method
 * If you apply static keyword with any method, it is known as static method. 
 * 		A static method belongs to the class rather than the object of a class. 
 * 		A static method can be invoked without the need for creating an instance of a class.
 * 		A static method can access static data member and can change the value of it.
 *
 * 3) Java static block 
 * 	It's used to initialize the static data member. 
 * 	It is executed before the main method at the time of class loading.
 * 
 * 
 * @author ICHIGO
 *
 */
class Student {

	int rollno;
	String name;
	static String college = "ITS";

	// static method to change the value of static variable
	static void change() {
		college = "BBDIT";
	}

	// constructor to initialize the variable
	Student(int r, String n) {
		rollno = r;
		name = n;
	}

	// method to display values
	void display() {
		System.out.println(rollno + " " + name + " " + college);
	}
}

public class Static {

	static {
		System.out.println("static block is invoked");
	}

	public static void main(String args[]) {
		Student.change();// calling change method
		// creating objects
		Student s1 = new Student(111, "Karan");
		Student s2 = new Student(222, "Aryan");
		Student s3 = new Student(333, "Sonoo");
		// calling display method
		s1.display();
		s2.display();
		s3.display();
	}

}
