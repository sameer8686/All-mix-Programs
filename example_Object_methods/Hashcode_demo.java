package example_Object_methods;

public class Hashcode_demo {
	
	int i;
	Hashcode_demo(int i)
	{
		this.i=i;
	}
	
	@Override
	public int hashCode()
	{
		return i;
	}

	public static void main(String[] args) {

		//here hashcode will change into hexedecimal then print the answer
		Hashcode_demo h1=new Hashcode_demo(10);
		Hashcode_demo h2=new Hashcode_demo(100);
		System.out.println(h1);
		System.out.println(h2);

		
	}

}
