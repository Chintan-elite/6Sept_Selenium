package statements;

import java.util.Scanner;

public class S005_Calc {
	public static void main(String[] args) {
		
		int choice = 0;
		do
		{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter num 1 : ");
		int a = sc.nextInt();
		System.out.println("enter num 2");
		int b = sc.nextInt();
		System.out.println("enter choice : ");
		System.out.println("1 : add , 2 : sub , 3 : div, 4 : mul, 0 : exit");
		choice = sc.nextInt();
		
		switch (choice) {
		case 0 : 
			System.out.println("Exit !!");
			break;
		case 1:
			System.out.println("Addition is : "+(a+b));
			break;
		case 2 : 
			System.out.println("substraction is : "+(a-b));	
			break;
		case 3 : 
			System.out.println("division is : "+(a/b));
			break;
		case 4 : 
			System.out.println("multiplication : "+(a*b));
			break;
		default:
			System.out.println("Invalid choice");
			
		}
		}while(choice !=0);
		
	}
}
