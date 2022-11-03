package exception;

public class E001_Exceptiondemo {
	public static void main(String[] args) {
		
		Sample s = new Sample();
		s.display();
		
		System.out.println("Program started");
		
		
		try 
		{
//			int i = 10;
//			int j = i/2;
//			System.out.println(j);
			
			int a[] = new int[10];
			a[11] = 50;
		}
		catch (ArithmeticException e)
		{
			//e.printStackTrace();
			//System.out.println("you have an error");
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
		}
		
		System.out.println("Program ended");
		
	}
}
