package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class C004_linkedhashSetDemo2 {
	public static void main(String[] args) {
		
		
		LinkedHashSet<String> sh = new LinkedHashSet<String>();
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
