package Regular_Expression;
import java.util.*;
import java.util.regex.Pattern;
public class RegExp_Pattern {

	public static void main(String[] args) {

		Pattern p= Pattern.compile("\\s");
		String[] s=p.split("Durga software solutios");
		for(String s1:s)
		{
			System.out.println(s1);
		}
		
	}

}
