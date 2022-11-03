package fileio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class F003_Fileinputstream {
	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			 fis = new FileInputStream("D:\\newgit\\hello.txt");
			int i =  fis.read();
			
			while(i !=-1)
			{
				char c = (char) i;
				System.out.print(c);
				i = fis.read();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
	}
}
