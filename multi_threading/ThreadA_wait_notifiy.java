package multi_threading;

public class ThreadA_wait_notifiy  {

	public static void main(String[] args) throws InterruptedException{

		ThreadB b=new ThreadB();
		b.start();
		synchronized(b)
		{
			System.out.println("main thread is calling waiting state");
			b.wait();
			System.out.println("main thread got notification ");
		}
		System.out.println(b.total);
	}

}

class ThreadB extends Thread
{
	int total=0;
	@Override

	public void run()
	{
		synchronized(this)
		{
			System.out.println("child start calculation");

			for(int i=1;i<=100;i++)
			{
				total=total+i;
			}
			System.out.println("child completed calculation and notifying the call");
			this.notify();
		}
		
	}
}
