package FileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileRead {

	public static void main(String[] args) throws IOException 
	{
		File f = new File("/Users/satya/Desktop/mytext.txt"); // connection created
		FileReader fr = new FileReader(f);
		
		int a;
		
		while((a=fr.read())!=-1)
		{
//			char c = (char)a; 
			System.out.println((char)a);
		}
		

	}

}
