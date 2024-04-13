package example;

class myThread extends Thread
{
	@Override
	public void run()
	{
		for(int i=0;i<10;i++)
		{
			System.out.println("child Thread");
			try { Thread.sleep(1000);
			}catch(InterruptedException e) {}
			}
		}
	
}
public class Test  {

	public static void main(String[] args) throws InterruptedException
	{
		myThread t=new myThread();
		t.start();
		t.join(5000);
		for(int i=0;i<10;i++) {
		System.out.println("main thread");
		}
	}
}
