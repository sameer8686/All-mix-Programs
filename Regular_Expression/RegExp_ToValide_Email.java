package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExp_ToValide_Email {

	public static void main(String[] args) {

		Pattern p=Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_ .]*@[a-zA-z0-9]+([.][a-za-z]+)+");
		Matcher m=p.matcher("sameer678@gmail.com");
		if(m.find() && m.group().equals("sameer789@gamil.com"))
		{
			System.out.println("Valid Email Id");
		}
		else
		{
			System.out.println("invalid Email Id");
		}
	}

}
