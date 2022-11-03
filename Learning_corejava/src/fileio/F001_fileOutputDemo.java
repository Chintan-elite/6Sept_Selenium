package fileio;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F001_fileOutputDemo {
	public static void main(String[] args) {
		
		try {
			FileOutputStream fos = new FileOutputStream("D:\\newgit\\test.txt");
			System.out.println("file created");
			
			
			String str = "topsvishwa \n"+"\n"+"\n abcd";
			
			byte b[] = str.getBytes();
			fos.write(b);
			
			System.out.println("Data written successfully..");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
