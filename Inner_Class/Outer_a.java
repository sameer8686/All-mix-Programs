package Inner_Class;

public class Outer_a {
	class Inner_a
	{
		public void m1()
		{
			System.out.println("Inner class method accessing from instance area of outer class");
		}
	}
	public void m2()
	{
		Inner_a i=new Inner_a();
		i.m1();
		
	}

	public static void main(String[] args) {

		Outer_a o=new Outer_a();
		o.m2();
		
	}

}
