package Inner_Class;

public class Method_inner_class {
	
	public void m1()
	{
		class Inner
		{
			public void sum(int x,int y)
			{
				System.out.println("The sum :"+(x+y));
			}
					}
		Inner i=new Inner();
		i.sum(10,20);
		i.sum(100,200);

	}

	public static void main(String[] args) {

		
		Method_inner_class m=new Method_inner_class();
		m.m1();
	}

}
