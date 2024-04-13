package Inner_Class;

class popcorn
{
	public void taste()
	{
		System.out.println("salty");
	}
}


public class Anonymous_class1 {

	public static void main(String[] args) {

		
		popcorn p=new popcorn()
				{
			      @Override
			      public void taste()
			      {
			    	  System.out.println("spice");
			      }
			       
				};
				
				p.taste(); // by call child object on parent refernce 
				
				popcorn p1=new popcorn()
						{
					@Override
					public void taste()
					{
						System.out.println("sweet");
					}
						};
						p1.taste(); // by call child object on parent refernce 

						popcorn p2=new popcorn(); // it is object of popcorn class
						p2.taste();
						
						// To get compiled file name of the  flie
						
						System.out.println(p.getClass().getName());
						System.out.println(p1.getClass().getName());
						System.out.println(p2.getClass().getName());

						
						
						
						
						
	}
	

}
