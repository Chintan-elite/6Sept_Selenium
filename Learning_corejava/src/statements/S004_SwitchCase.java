package statements;

import java.util.Scanner;

public class S004_SwitchCase 
{
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Choice : ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1 :
			System.out.println("You have choose Gujarati");
			break;
		case 2 :
			System.out.println("You have choose Hindi");
			break;
		case 3 :
			System.out.println("You have choose English");
			break;
		default :
			System.out.println("Invalid Choice !!!!");
			
		}
		
		
		
	}
}
