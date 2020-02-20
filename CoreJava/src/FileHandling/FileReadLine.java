package FileHandling;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReadLine {

	public static void main(String[] args) throws IOException 
	{
		File f = new File("/Users/satya/Desktop/mytext.txt");
		FileReader fr = new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		String s;
		
		while((s=b.readLine()) != null)
		{
			System.out.println(s);
		}
		

	}

}
