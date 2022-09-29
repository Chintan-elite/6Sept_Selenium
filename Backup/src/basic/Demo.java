package basic;

public class Demo {
	public static void main(String[] args) {
		
		
		
		byte a = -128;
		short s = 522;
		int i = 458;
		long l = 5989774;
		
		float f = 25.66f;
		double d = 596598.6545;
		
		char ch = 'A';
		boolean bool = true;
		
		System.out.println(a);
		System.out.println(s);
		
		
		//widining  implicite
		int k = 10;
		long k1 = k;
		
		//nerrowing  explicite
		long y = 1659898;
		int y1 = (int) y;
		
		
	}
}
