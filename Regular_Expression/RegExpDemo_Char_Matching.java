package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpDemo_Char_Matching {

	public static void main(String[] args) {

		Pattern p=Pattern.compile("[abc]");
		Matcher m=p.matcher("a36#k@9z");
		
		while(m.find())
		{
			System.out.println(m.start()+"....."+m.group());
		}
		
//		Pattern p1=Pattern.compile("[^abc]");
//		Matcher m1=p1.matcher("a36#k@9z");
//		
//		while(m.find())
//		{
//			System.out.println(m.start()+"....."+m.group());
//		}
//		
//		Pattern p2=Pattern.compile("[a-z]");
//		Matcher m2=p2.matcher("a36#k@9z");
//		
//		while(m.find())
//		{
//			System.out.println(m.start()+"....."+m.group());
//		}
//		
//		Pattern p3=Pattern.compile("[0-9]");
//		Matcher m3=p3.matcher("a36#k@9z");
//		
//		while(m.find())
//		{
//			System.out.println(m.start()+"....."+m.group());
//		}
//		
//		Pattern p4=Pattern.compile("[a-zA-Z0-9]");
//		Matcher m4=p4.matcher("a36#k@9z");
//		
//		while(m.find())
//		{
//			System.out.println(m.start()+"....."+m.group());
//		}
//		
//		Pattern p5=Pattern.compile("[^a-zA-Z0-9]");
//		Matcher m5=p5.matcher("a36#k@9z");
//		
//		while(m.find())
//		{
//			System.out.println(m.start()+"....."+m.group());
//		}
		
		
	}

}
