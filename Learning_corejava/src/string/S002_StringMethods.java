package string;

public class S002_StringMethods {
	public static void main(String[] args) {
		
		String s = "sun rise In East";
		System.out.println(s.length());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.charAt(5));
		System.out.println(s.indexOf('s'));
		System.out.println(s.lastIndexOf('s'));
		System.out.println(s.endsWith("t"));
		System.out.println(s.startsWith("u"));
		System.out.println(s.substring(5));
		System.out.println(s.substring(5,14));
		System.out.println(s.trim());
		System.out.println(s.replace('s', 'y'));
		
		System.out.println("******************************");
		
		String a = "Vishva";
		String b = "vishva";
		
		System.out.println(a.equals(b));
		System.out.println(a.equalsIgnoreCase(b));
		
		System.out.println("******************************");
		
		
		 String str[] = s.split(" ");
		
		 for(int i=0;i<str.length;i++)
		 {
			 System.out.println(str[i]);
		 }
		
		 System.out.println("*************************");
	
		 char ch[] = s.toCharArray();
		 
		 for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		 
		System.out.println("************************");
	
		byte bt[] = s.getBytes();
		
		for (int i = 0; i < bt.length; i++) {
			System.out.println(bt[i]);
		}
		
	}
}
