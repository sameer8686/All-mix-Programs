package File_Input_Output;
import java.io.*;

public class BufferWriter_demo {

	public static void main(String[] args) throws IOException {

		FileWriter fw=new FileWriter("sam.txt");
		BufferedWriter bw=new BufferedWriter(fw);
		bw.write(100);
		bw.newLine();
		char[] ch1= {'a','b','c'};
		bw.write(ch1);
		bw.newLine();
		bw.write("durga");
		bw.newLine();
		bw.write("Software solutions");
		bw.flush();
		bw.close();
		
	}

}
