package basicPractical;

public class B001_oddeven {
	public static void main(String[] args) {
		
		for(int a=1;a<=100;a++)
		{
			if(a%2==0)
			{
				System.out.println(a+" : Even");
			}
			else
			{
				System.out.println(a+" : Odd");
			}
		}
		
	}
}
