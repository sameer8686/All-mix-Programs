package multi_threading;
class demo1 extends Thread
{
	@Override
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("child Thread");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {}
		}
	}
}

public class DaemonThreadDemo {

	public static void main(String[] args) {

		demo1 t=new demo1();
		t.setDaemon(true);
		t.start();
  
		System.out.println("end of main class");
	}

}
