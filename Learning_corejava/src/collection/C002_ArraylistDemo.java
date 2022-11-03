package collection;

import java.util.ArrayList;

public class C002_ArraylistDemo {
	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("java");
		al.add("php");
		
		
		ArrayList<String> al2 = new ArrayList<String>(al);
		al2.add("Cricket");
		al2.add("Hockey");
		al2.addAll(al);
		
		for(String s : al2)
		{
			System.out.println(s);
		}
		
		
		
	}
}
