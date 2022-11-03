package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F002_fileoutputstream {
	public static void main(String[] args) {
		
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\newgit\\hello.txt");
		System.out.println("file created");
		
		String str = "this is my first io practical";
		byte b[] = str.getBytes();
		fos.write(b);
		System.out.println("content written");
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			
		}
		
		
		
	}
}
