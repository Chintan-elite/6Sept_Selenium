package wrapperclass;

public class W001_FirstDemo {
	public static void main(String[] args) {
		
		
		int a = 1044444;
		
		//boxing
		Integer b = new Integer(a);
		//auto boxing
		Integer c = a;
		
		//int l = c.toString().length();
		//System.out.println(l);
		
		Integer k = 25;
		//unboxing
		int l = k.intValue();
		//auto unboxing
		int m = k;
	}
}
