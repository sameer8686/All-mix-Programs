package Inner_Class;

public class Anonymous_Thread_demo {

	public static void main(String[] args) {

		Thread t=new Thread()
				{
			@Override
			public void run()
			{
				for(int i=1;i<=10;i++)
				{
					System.out.println("child Thread");
				}
			}
				};
				
				t.start();
				
				for(int i=1;i<=10;i++)
				{
					System.out.println("main Thread");
				}
				
				
						
	}

}
