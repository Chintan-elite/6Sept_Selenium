package oops;

class Emp {
	// static or not static
	static int id = 10;
	static String name = "tops";
	String email = "tops@gmail.com";

	public void display() {
		System.out.println(id + " " + name + " " + email);
	}

	public static void demo() {
		System.out.println("running demo");
	}

}

public class O004_StaticDemo {
	public static void main(String[] args) {

		Emp.id = 80;
		Emp e = new Emp();
		e.display();
		Emp.name = "tech";

		Emp e1 = new Emp();
		e1.display();

		Emp e2 = new Emp();
		e2.display();

		Emp.demo();

	}
}
