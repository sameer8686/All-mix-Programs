package File_Input_Output;
import java.io.*;

public class File_Listing {

	public static void main(String[] args) {

		int count = 0;
		File f=new File("E://New Volume ( E )");
		String[] s=f.list();
		for(String s1:s)
		{
			count++;
			System.out.println(s1);
			
		}
		System.out.println("The total number of files are:"+count);
	}

}
