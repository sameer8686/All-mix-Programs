package multi_threading;
import java.util.concurrent.*;
class Display1
{
	static ReentrantLock l=new ReentrantLock();
	public void wish(String name)
	{
		
		for(int i=0;i<=10;i++)
		{
			System.out.print("Good morning :");
			try {
				Thread.sleep(2000);
			}catch(InterruptedException e) {}
			System.out.println(name);
		}
		
	}
}
class myTHread extends Thread
{
	Display1 d;
	String name;
	myTHread(Display1 d,String name)
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

public class ReentrantLock {

	public static void main(String[] args) {

		Display1 d=new Display1();
		myTHread t1=new myTHread(d,"sam");
		myTHread t2=new myTHread(d,"Kholi");
		t1.start();
		t2.start();
	}

	


}
