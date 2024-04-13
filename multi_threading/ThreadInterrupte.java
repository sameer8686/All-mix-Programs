package multi_threading;

class myThread1 extends Thread
{
	public void run()
	{
		try {
			for(int i=1;i<=10;i++)
			{
				System.out.println("i am lazy :"+i);
				sleep(2000);
			}
			
		}catch(InterruptedException e)
		{
			System.out.println(" child class interrupted by main class");
		}
	}
}

public class ThreadInterrupte {
	
	public static void main(String[] args) throws InterruptedException
	{
		myThread1 t=new myThread1();
		t.start();
		t.interrupt();
		System.out.println("main method End");
	}

}
