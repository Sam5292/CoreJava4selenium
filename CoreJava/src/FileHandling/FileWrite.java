package FileHandling;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWrite {

	public static void main(String[] args) throws IOException 
	{
		File f = new File("/Users/satya/Desktop/satya.txt");
		FileWriter fw = new FileWriter(f);
		BufferedWriter br = new BufferedWriter(fw);
		br.write("Hello File Handling i want to write inside the satya text file");
		br.newLine();
		br.write("Hey Satya How Are You");
		br.close();	

	}

}