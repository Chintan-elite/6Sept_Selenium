package statements;

import java.util.Scanner;

public class S003_Grade {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter marks : ");
		int marks = sc.nextInt();
		
		if(marks>90 && marks<=100)
		{
			System.out.println("Grade A");
		}
		else if(marks>70 && marks<=90)
		{	
			System.out.println("Grade B");
		}
		else if(marks>50 && marks<=70)
		{
			System.out.println("grade C");
		}
		else if(marks<=50 && marks>0)
		{
			System.out.println("grade D");
		}
		else
		{
			System.out.println("Invalid !!");
		}
		
	}
}
