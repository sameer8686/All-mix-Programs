package collections_Examples;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSet_Demo2 {

	public static void main(String[] args) {

		TreeSet t=new TreeSet(new myComparator1());
		t.add("Rani");
		t.add("shobha Rani");
		t.add("rajakumari");
		t.add("gangabhavani");
        t.add("ramulama");
        System.out.print(t);
		
	}

}

class myComparator1 implements Comparator
{
	
	@Override
	public int compare(Object o1, Object o2) {
		String s1=(String)o1;
		String s2=o2.toString();
		return s1.compareTo(s2);

		
	}
}


