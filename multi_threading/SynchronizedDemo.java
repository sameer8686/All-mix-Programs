package multi_threading;

class Display
{
	public synchronized void wish(String name)
	{
		for(int i=1;i<10;i++)
		{
			System.out.print("Good morning: ");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {}
			System.out.println(name);
			
		}
	}
}

class Test extends Thread
{
	Display d;
	String name;
	Test(Display d,String name)
	{
		this.d=d;
		this.name=name;
	}
	@Override
	public void run()
	{
		d.wish(name);
		
	}
}

public class SynchronizedDemo {

	public static void main(String[] args) {

		Display d=new Display();
		Test t=new Test(d,"sam");
		t.start();
	}

}
