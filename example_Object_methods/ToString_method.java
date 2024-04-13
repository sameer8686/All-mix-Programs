package example_Object_methods;

public class ToString_method {
	
	String name;
	int rollno;

	public ToString_method(String name, int rollno) 
	{
		this.name = name;
		this.rollno = rollno;
	}
	
	//we can override toString method and it is recommanded
	@Override
	public String toString()
	{
		return name+"...."+ rollno;
	}

	public static void main(String[] args) {

		ToString_method t1=new ToString_method("sam",101);
		ToString_method t2=new ToString_method("ravi",102);
		System.out.println(t1);
		System.out.println(t1.toString());
		System.out.println(t2);


	}

}
