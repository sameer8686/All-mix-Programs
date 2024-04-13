package File_Input_Output;
import java.io.*;
public class FileExtractor {

	public static void main(String[] args) throws IOException {

		PrintWriter pw=new PrintWriter("output.txt");
		BufferedReader br=new BufferedReader(new FileReader("input.txt"));
		String line=br.readLine();
		while(line != null)
		{
			boolean available=false;
			BufferedReader br1=new BufferedReader(new FileReader("delete.txt"));
			String target=br1.readLine();
			while(target != null)
			{
				if(line.equals(target))
				{
					available=true;
					break;
				}
				target=br1.readLine();
			}
			if(available == false)
			{
				pw.println(line);
			}
			line=br.readLine();
		}
		
	}

}
