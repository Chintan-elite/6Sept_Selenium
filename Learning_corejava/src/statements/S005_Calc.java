package statements;

import java.util.Scanner;

public class S005_Calc {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value for A : ");
		int a =sc.nextInt();
		System.out.println("enter vlaue for B :");
		int b = sc.nextInt();
		System.out.println("enter Choice : 1 - Add, 2 - sub, 3 - div, 4 - mul ");
		int choice = sc.nextInt();
		
		switch(choice) {
		case 1 : 
			System.out.println("Addition is : "+(a+b));
			break;
		case 2 : 
			System.out.println("Substraction is : "+(a-b));
			break;
		case 3 : 
			System.out.println("division is : "+(a/b));
			break;
		case 4 : 
			System.out.println("Multiplication is : "+(a*b));
			break;
		default :
			System.out.println("Invalid Choice !!!");
			
		}
		
		
		
	}
}
