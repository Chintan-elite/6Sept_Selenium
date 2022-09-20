package statements;

public class S002_IF_else {
	public static void main(String[] args) {
		
		
		int a= 1000;
		int b = 200;
		int c = 30;
		
		
		if(a>b && a>c)
		{
			System.out.println("A is greater");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is greater");
		}
		else if(c>a && c>b)
		{
			System.out.println("C is greater");
		}
		
	}
}
