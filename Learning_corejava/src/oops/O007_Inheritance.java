package oops;

class Pen1 {
	int price = 10;
	String color = "red";
	String company = "Cello";

	public void display() {
		System.out.println(price + " " + color + " " + company);
	}

}

class NoteBook extends Pen1 {

	int price = 500;
	public void details() {
		
		System.out.println(super.price + " " + company);
		System.out.println(price + " " + company);
	}
}

class Paper extends Pen1
{
	
}


public class O007_Inheritance
{
	public static void main(String[] args)
	{

		Pen1 p = new Pen1();
		p.display();
		
		NoteBook n1 = new NoteBook();
		n1.company = "classmate";
		n1.details();
		
		
		
	}
}
