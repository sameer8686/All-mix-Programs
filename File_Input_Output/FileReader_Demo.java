package File_Input_Output;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReader_Demo {

	public static void main(String[] args) throws IOException {

		File f=new File("sam.txt");
		FileReader fr=new FileReader(f);
		char[] ch=new char[(int)f.length()];
		fr.read();
		for(char ch1: ch)
		{
			System.out.println(ch1);
		}
		System.out.println("*************************");
		FileReader fr1=new FileReader("sam.txt");
		int i=fr1.read();
		while(i!= -1)
		{
			System.out.println((char)i);
			i=fr1.read();
		}
		
	}

}
