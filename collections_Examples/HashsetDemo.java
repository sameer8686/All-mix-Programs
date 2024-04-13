package collections_Examples;
import java.util.*;
public class HashsetDemo {

	//insertion order is not preserved,duplicate elements are not allowd
	
	public static void main(String[] args) {

		HashSet h=new HashSet();
		h.add("B");
		h.add("C");
		h.add("D");
		h.add("Z");
		h.add(null);
		h.add(10);
		System.out.println(h.add("Z"));
		System.out.println(h);

		
	}

}
