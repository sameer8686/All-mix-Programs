package Inner_Class;
//Accessing the instance variable from both classes
public class Outer3 {
	
	int x=10;
	
	class Inner3
	{
		int x=100;
		public void m1()
		{
			int x=1000;
			System.out.println(x);
			
			System.out.println(this.x); //this refer to current class object
			System.out.println(Inner3.this.x); //both the sop are same coding style is different


			System.out.println(Outer3.this.x);

		}
		
	}

	public static void main(String[] args) {

		new Outer3().new Inner3().m1();
		
	}

}
