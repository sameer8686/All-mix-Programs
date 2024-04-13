package collections_Examples;
import java.util.*;
public class ListIterator_Demo {

	public static void main(String[] args) {

		LinkedList l=new LinkedList();
		l.add("balaKreishna");
		l.add("venky");
		l.add("chiru");
		l.add("nag");
		System.out.println(l);
		ListIterator itr=l.listIterator();
		while(itr.hasNext())
		{
			String s=(String)itr.next();
			if(s.equals("venky"))
			{
				itr.remove();
			}
			else if(s.equals("nag"))
			{
				itr.add(s);
			}
		}
	System.out.println(l);	
	}

}
