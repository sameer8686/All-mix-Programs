package File_Input_Output;

import java.io.File;

public class Display_only_FileNames {

	public static void main(String[] args) {

		int count = 0;
		File f=new File("E://New Volume ( E )/levelup");
		String[] s=f.list();
		for(String s1:s)
		{
			File f1=new File(f,s1);
			if(f1.isFile())
			{
				count++;

				System.out.println(f1);

			}
			
		}
		System.out.println("The total number of files are:"+count);
	
	}

}
