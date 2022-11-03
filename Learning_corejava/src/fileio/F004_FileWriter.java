package fileio;

import java.io.FileWriter;
import java.io.IOException;

public class F004_FileWriter {
	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("D:\\newgit\\test.txt");
			String str = "hello java, selenium";
			fw.write(str);
			fw.flush();
		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
