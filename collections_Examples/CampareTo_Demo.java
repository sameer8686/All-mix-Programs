package collections_Examples;

public class CampareTo_Demo {

	//obj1.compareTo.obj2 -ve if obj1 before the obj2
	//obj1.compareTo.obj2 +ve if obj1 After the obj2
	//obj1.compareTo.obj2 0 if obj before the obj2

	
	public static void main(String[] args) {

		System.out.println("A".compareTo("Z")); //-ve
		System.out.println("Z".compareTo("K")); //+ve
		System.out.println("A".compareTo("A")); //0

		
	}

}
