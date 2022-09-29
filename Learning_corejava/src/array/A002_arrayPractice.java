package array;

public class A002_arrayPractice {
	public static void main(String[] args) {
		
		int a[]= {10,200,30,100,0,40,50,60};
		
		int sum = 0;
		for (int i = 0; i < a.length; i++) 
		{
			//sum = sum + a[i];
			sum += a[i];
		}
		
		System.out.println("sum is : "+sum);
		System.out.println("avg is : "+(sum/a.length));

		System.out.println("*******************************");
	
		int max = a[0]; // 10 20 30 100
		int min = a[0];
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]>max)
			{
				max =a[i];
			}
			
			if(a[i]<min)
			{
				min = a[i];
			}
		}
		System.out.println("max is : "+max);
		System.out.println("min is : "+min);
	
	
		
	}
}
