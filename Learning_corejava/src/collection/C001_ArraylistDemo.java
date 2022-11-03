package collection;

import java.util.ArrayList;

public class C001_ArraylistDemo {
	public static void main(String[] args) {
		
		
		ArrayList<String> al = new ArrayList<String>();
		al.add("Java");
		al.add("selenium");
		al.add("php");
		al.add(null);
		al.add("Java");
		
		//al.add(2,"android");
		//al.set(2,"Android");
		//al.remove(2);
		System.out.println(al.get(1));
		for(String s : al)
		{
			System.out.println(s);
		}
		
		
		
		
	}
}
