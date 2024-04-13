package collections_Examples;

import java.util.Comparator;
import java.util.PriorityQueue;

public class PriorityDemo2 {

	public static void main(String[] args) {

		PriorityQueue q=new PriorityQueue(15,new mycomparator());
		q.offer("A");
		q.offer("Z");
		q.offer("L");
		q.offer("B");
    	System.out.println(q);
	
	}

}
class mycomparator implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {

		String s1=(String)o1;
		String s2=o2.toString();
			
		return s2.compareTo(s1);
	}
	
}