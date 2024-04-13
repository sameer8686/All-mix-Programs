package collections_Examples;
import java.util.*;
public class Itarator_cursar {

	public static void main(String[] args) {

		ArrayList l=new ArrayList();
		for(int i=0;i<=10;i++)
		{
			l.add(i);
		}
		System.out.println(l);
		Iterator its=l.iterator();
		while(its.hasNext())
		{
			Integer i=(Integer)its.next();
			if(i%2==0)
			{
				System.out.println(i);
			}
			else
			{
				its.remove();
			}
		}
		System.out.println(l);
	}

}
