package statements;

public class S001_IF {
	public static void main(String[] args) {
		
		int a = 100000;
		int b = 2000;
		int c = 500;
		
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is greater!!!");
			}
			else
			{
				System.out.println("c is greater");
			}
			
		}
		else
		{
			if(b>c)
			{
			System.out.println("B is greater");
			}
			else
			{
				System.out.println("c is greater");
			}
		}
		
		
		
		
	}
}
