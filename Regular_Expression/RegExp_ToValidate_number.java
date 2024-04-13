package Regular_Expression;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class RegExp_ToValidate_number {

	public static void main(String[] args) {

		Pattern p=Pattern.compile("(0|91)?[7-9][0-9]{9}");
		Matcher m=p.matcher("9856231478");
		if(m.find() && m.group().equals("9856231478"))
		{
			System.out.println("Valid Mobile number");
		}
		else
		{
			System.out.println("invalid mobile number");
		}
		
	}

}
