package collections_Examples;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo4_String_lenthWise {

	public static void main(String[] args) {

		TreeSet t=new TreeSet(new myComparator2());
		t.add("A");
		t.add(new StringBuffer("ABC"));
		t.add(new StringBuffer("AA"));
		t.add("ABCD");
		t.add("A");
		System.out.println(t);

		
	}

}

class myComparator2 implements Comparator
{
	
	@Override
	public int compare(Object o1, Object o2) {
		String s1=o1.toString();
		String s2=o2.toString();

		int i1=s1.length();
		int i2=s2.length();
		if(i1<i2)
			return -1;
		else if(i1>i2)
			return +1;
		else
			return s1.compareTo(s2);
		
	}
}
