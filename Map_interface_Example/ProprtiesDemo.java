package Map_interface_Example;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Properties;

public class ProprtiesDemo {

	public static void main(String[] args) throws Exception {

		Properties p=new Properties();
		FileInputStream fis=new FileInputStream("abc.properties");
		p.load(fis);
		System.out.println(p);
		String s=p.getProperty("venki");
		System.out.println(s);
		p.setProperty("nag","8888 ");
		FileOutputStream fos=new FileOutputStream("abc.properties");
		p.store(fos, "upadted by durga for SCJP Demo");
		
		
	}

}
