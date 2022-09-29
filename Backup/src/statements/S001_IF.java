package statements;

public class S001_IF {
	public static void main(String[] args) {
		
		
		int a = 100;
		int b = 2000;
		int c = 3000;
		
		
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("B is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("c is greater");
		}
		
		
		
//		if(a>b)
//		{
//			if(a>c)
//			{
//			 System.out.println("a is greater");
//			}
//			else
//			{
//				System.out.println("c is greater");
//			}
//		}
//		else
//		{
//			if(b>c)
//			{
//				System.out.println("b is greater");
//			}
//			else
//			{
//				System.out.println("c is greater");
//			}
//		}
//		
		
		
	}
}
