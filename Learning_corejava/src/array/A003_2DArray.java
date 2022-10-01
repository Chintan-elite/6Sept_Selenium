package array;

public class A003_2DArray {
	public static void main(String[] args) {
		
//		int a[][] = new int[3][7];
//		a[0][0] = 40;
//		a[0][1] = 80;
//		a[0][2] = 60;
//		System.out.println(a[0][0]);
		
		
		int a[][] = {{1,2,3},{1,0,2},{10,20,30}};
		
		//System.out.println(a[0][0]);
		//System.out.println(a[0][1]);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.println(a[i][j]);
			}
		}
		
	
		
		
		
	}
}
