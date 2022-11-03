package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class C005_linkedhashSetDemo3 {
	public static void main(String[] args) {
		
		
		TreeSet<String> sh = new TreeSet<String>();
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
