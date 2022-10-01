package array;

public class A004_2dArray1 {
	public static void main(String[] args) {
		
		
		String str[][] = new String[3][2];
		
		str[0][0] = "ravina@gmail.com";
		str[0][1] = "ravina123";
		
		str[1][0] = "nidhi@gmail.com";
		str[1][1] = "nidhi13";
		
		str[2][0] = "smit@gmail.com";
		str[2][1] = "smit123";
		
		
		for(int i=0;i<3;i++)
			for(int j=0;j<2;j++)
			{
				System.out.println(str[i][j]);
			}
		
		}
		
	}
}
