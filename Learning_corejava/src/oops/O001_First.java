package oops;

class Pen
{
	//variables , datamember
	int price = 10;
	String color = "Blue";
	String company = "cello";
	
	//methods or function member
	public void toWrite()
	{
		System.out.println(price+" "+color+" "+company);
	}
	
	
}

public class O001_First {
	
	public static void main(String[] args) {
		
		//System.out.println("Program strated...");
		Pen p =new Pen();
		p.price=200;
		p.toWrite();
		
		Pen p1 = new Pen();
		p1.color="Red";
		p1.toWrite();
		
		Pen p3 = new Pen();
		p3.toWrite();
	}
}


