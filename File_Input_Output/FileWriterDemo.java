package File_Input_Output;
import java.io.*;

public class FileWriterDemo {

	public static void main(String[] args) throws IOException {

		FileWriter fw=new FileWriter("sam.txt");
		fw.write(100);
		fw.write("urga\nsoftwareSolutions");
		fw.write("\n");
		char[] ch= {'a','b','c'};
		fw.write(ch);
		fw.write("\n");
		fw.flush();
		fw.close();



		
	}

}
