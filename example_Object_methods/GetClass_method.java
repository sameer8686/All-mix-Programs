package example_Object_methods;

import java.lang.reflect.Method;

public class GetClass_method {

	public static void main(String[] args) {

		int count=0;
		Object o=new String("sam");
		Class c=o.getClass();
		System.out.println("Fully qualified name of the class :"+c.getClass());
        Method[] m=c.getDeclaredMethods();
        System.out.println("Method information");
        for(Method m1:m)
        {
        	count++;
        	System.out.println(m1.getName());
        }
        System.out.println("the number of methods"+count);
	}

}
