package Inner_Class;

public class Outer_Class {
	
	class Inner
	{
		public void m1()
		{
			System.out.println("Inner class method");
		}
	}

	public static void main(String[] args) {

		Outer_Class.Inner i=new Outer_Class().new Inner();
		i.m1();
	}

}
