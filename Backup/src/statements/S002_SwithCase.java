package statements;

import java.util.Scanner;

public class S002_SwithCase {
			
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter choice : ");
		int choice = sc.nextInt();
		
		switch(choice)
		{
		case 1 : 
			System.out.println("English");
			break;
		case 2 :
			System.out.println("Hindi");
			break;
		case 3 : 
			System.out.println("gujarati");
			break;
		default :
			System.out.println("Invalid choice !!");
		}
		
		
	}
}
