package collection;

import java.util.HashSet;

public class C003_hashSetDemo {
	public static void main(String[] args) {
		
		
		HashSet<String> sh = new HashSet<String>();
		sh.add("java");
		sh.add("php");
		sh.add("android");
		sh.add("java");
		
		for(String s : sh)
		{
			System.out.println(s);
		}
		
	}
}
