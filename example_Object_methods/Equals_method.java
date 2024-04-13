package example_Object_methods;

public class Equals_method {
	
	String name;
	int rollno;
	
	Equals_method(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	
	//for cntent comparison we override the .equals method
	
	public boolean equals(Object obj)
	{
		try {
			String name1=this.name;
			int rollno1=this.rollno;
			Equals_method e=(Equals_method)obj;
			String name2=e.name;
			int rollno2=e.rollno;
			if(name1.equals(name2) && rollno1 == rollno2)
			{
				return true;
			}
			else
			{
				return false;
			}
		}catch(ClassCastException e) { return false ;}
		catch(NullPointerException e) { return false;}
	}

	public static void main(String[] args) {

		// object method .equal() will use object refernce comparison but not content comparison
		
		Equals_method e1=new Equals_method("sam",101);
		Equals_method e2=new Equals_method("durga",102);
		Equals_method e3=new Equals_method("sam",101);
		Equals_method e4=e1;
		System.out.println(e1.equals(e2));
		System.out.println(e2.equals(e3));
		System.out.println(e1.equals(e4));
		System.out.println(e1.equals("sam"));
		System.out.println(e1.equals(null));



	}

}
