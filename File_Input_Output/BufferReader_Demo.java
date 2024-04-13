package File_Input_Output;
import java.io.*;
public class BufferReader_Demo {

	public static void main(String[] args) throws IOException {

		FileReader fr=new FileReader("sam.txt");
		BufferedReader br=new BufferedReader(fr);
		String line=br.readLine();
		while(line != null)
		{
			System.out.println(line);
			line=br.readLine();
		}
		br.close();
		
		
		
	}

}
