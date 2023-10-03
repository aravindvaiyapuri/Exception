package Exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class DemoFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		try {
		File f=new File("C:/Users/ADMIN/Documents/a.txt");
		
		FileReader d=new FileReader(f);
	
		int temp=0;
		while((temp=d.read())!=0) {
			System.out.print((char)(temp));
		}
		}
		catch(FileNotFoundException e) {
			System.out.println(e);
		}
		}

	}


