package string;

public class S001_firstPract {
	public static void main(String[] args) {
		
		//String is immutable class
//		String s = "Ravina";
//		String str = new String("Nidhi");
//		
//		String s1 =  s.concat("Lathiya");
//		
//		System.out.println(s);
//		System.out.println(str);
//		System.out.println(s1);
		
		
		String s1 = new String("Smit");
		String s2 = new String("Parita");
		String s3 = new String("Smit");
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		System.out.println(s1 == s3);
		
		System.out.println("*****************");
		
		String str1 = "Smit";
		String str2 = "Parita";
		String str3 = "Smit";
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equals(str3));
		System.out.println(str1 == str3);
		
		
		
		
	}
}
