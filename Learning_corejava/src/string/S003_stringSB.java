package string;

public class S003_stringSB {
	public static void main(String[] args) {
		
		double starTime = System.currentTimeMillis();
		StringBuffer sb = new StringBuffer("tops");
		for(int i=1;i<100000;i++)
		{
			sb.append("tech");
		}
		double endtime = System.currentTimeMillis();
		
		
		double starTime1 = System.currentTimeMillis();
		StringBuilder sb1 = new StringBuilder("tops");
		for(int i=1;i<100000;i++)
		{
			sb1.append("tech");
		}
		double endtime1 = System.currentTimeMillis();
		
		System.out.println("buffer : "+(endtime-starTime));
		System.out.println("builder : "+(endtime1-starTime1));
	}
}
