package collections_Examples;
import java.util.*;
public class LinkedList_Demo {

	public static void main(String[] args) {

		LinkedList l=new LinkedList();
		l.add("durga");
		l.add(30);
		l.add(null);
		l.add("durga");
		l.set(0,"Software");
		l.add(0,"Venky");
		l.removeLast();
		l.addFirst("ccc");
		System.out.println(l);
		
	}

}
