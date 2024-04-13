package example_Object_methods;

public final class Immutable_our_own_Class {

	private int i;
	Immutable_our_own_Class(int i)
	{
		this.i=i;
	}
	public Immutable_our_own_Class modify(int i)
	{
		if(this.i == i)
		{
			return this;
		}
		else
		{
			return (new Immutable_our_own_Class(i));
		}
	}
	
	public static void main(String[] args) {

		Immutable_our_own_Class i1=new Immutable_our_own_Class(10);
		Immutable_our_own_Class i2=i1.modify(100);
		Immutable_our_own_Class i3=i1.modify(10);
		System.out.println(i1==i2);
		System.out.println(i1==i3);

	}

}
