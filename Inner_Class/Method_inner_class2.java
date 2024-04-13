package Inner_Class;

public class Method_inner_class2 {
	
	int x=10;
	static int y=20;
	public void m1()  // if we decleare m1 method as static the we get compile time error for sop(x)
	{
		class Inner
		{
			public void m2()
			{
				System.out.println(x); //we ca access instance and static variable directly 
				                        //     from instance method of outer clas
				System.out.println(y);

			}
		}
		
		Inner i=new Inner();
		i.m2();
		
		
	}

	public static void main(String[] args) {

		Method_inner_class2 m=new Method_inner_class2();
		m.m1();
		
	}

}
