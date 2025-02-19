package Regular_Expression;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExp_Demo {

	
	public static void main(String[] args) {

		int count=0;
		Pattern p=Pattern.compile("ab");
		Matcher m=p.matcher("abbabbba");
		
		while(m.find())
		{
			count++;
			System.out.println(m.start());
		}
		System.out.println("The Total number of Count:"+count);
		
		
	}

}
