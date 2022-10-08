package oops;

class Calc
{
	public void add(int a, int b)
	{
		int result = a+b;
		System.out.println("Addition is : "+result);
	}
	
	public void square(int a)
	{
		int result = a*a;
		System.out.println("square is : "+result);
	}
	
	public int cube(int a)
	{
		int result = a*a*a;
		return result;
	}
	
}
public class O003_MethodManipulation {
	public static void main(String[] args) {
		
		Calc c = new Calc();
		c.add(10, 20);
		c.add(20, 30);
		c.square(5);
		c.square(10);
		
		int cube =  c.cube(3);
		//c.square(cube);
		//System.out.println(cube);
		
	
	}
}
