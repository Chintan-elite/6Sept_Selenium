package fileio;

import java.io.File;
import java.io.IOException;

public class F005_FileDemo {
	public static void main(String[] args) {
		
			File file = new File("D:\\newgit\\home.txt");
			
			//file.mkdir();

			System.out.println(file.isFile());
			System.out.println(file.isDirectory());
//			if(file.exists())
//			{
//				System.out.println("Available");
//				file.delete();
//			}
//			else
//			{
//				System.out.println("not available");
//				try {
//					file.createNewFile();
//					System.out.println("file created...");
//				} catch (IOException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
//		
	}
}
