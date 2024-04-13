package Inner_Class;

public class Anonymous_implements_Runnable {

	public static void main(String[] args) {

		Runnable r=new Runnable()
				{
			@Override
			public void run()
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println("child Thread which implements Runnable interface");
				}
			}
				};
				
				Thread t=new Thread(r);
				t.start();
				
				for(int i=1;i<=10;i++)
				{
					System.out.println("main method");
				}
		
	}

}
