package collections_Examples;

import java.util.Comparator;
import java.util.TreeSet;

public class TreeSetDemo2 {

	public static void main(String[] args) {

		@SuppressWarnings("unchecked")
		TreeSet t=new TreeSet(new MComparator5());
		t.add(10);
		t.add(0);
		t.add(15);
		t.add(5);
		t.add(20);
		t.add(20);
		System.out.println(t);

	}

}
class MComparator5 implements Comparator
{
	
	@Override
	public int compare(Object o1, Object o2) {
		Integer i1=(Integer)o1;
		Integer i2=(Integer)o2;
		if(i1<i2)
			return +1;
		else if(i1>i2)
			return -1;
		else
			return 0;

	}
}










