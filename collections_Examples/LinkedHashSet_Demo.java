package collections_Examples;
import java.util.*;
public class LinkedHashSet_Demo {

	//insertion order is preserved and duplicate not alllowed
	
	public static void main(String[] args) {

		LinkedHashSet lhs=new LinkedHashSet();
		lhs.add("B");
		lhs.add("C");
		lhs.add("D");
		lhs.add("Z");
		lhs.add(null);
		lhs.add(10);
		System.out.println(lhs.add("Z"));
		System.out.println(lhs);

		
		
	}

}
