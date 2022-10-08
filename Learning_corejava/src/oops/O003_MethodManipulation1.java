package oops;


class Calc1
{
	public void arrayAdd(int a[])
	{
		int sum = 0;
		for (int i = 0; i < a.length; i++) {
			sum = sum + a[i];
		}
		System.out.println("sum of array is : "+sum);
	}
} 

public class O003_MethodManipulation1 {
	public static void main(String[] args) {
		
		int a[] = {10,20,30,40,50};
		int b[] = {1,20,3,4,5,6};
		
		Calc1 c1 = new Calc1();
		c1.arrayAdd(a);
		c1.arrayAdd(b);
	}
}
