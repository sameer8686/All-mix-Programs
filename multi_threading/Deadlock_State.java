package multi_threading;
class A
{
	public  synchronized void d1(B b)
	{
		System.out.println("Thread 1 start excuting d1 method");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {}
		System.out.println("thread 1 trying to call B last method");
		b.last();
	}
	public  synchronized void last()
	{
		System.out.println("Inside A last method");
	}
}

class B
{
	public  synchronized void d2(A a)
	{
		System.out.println("Thread 2 start excuting d2 method");
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {}
		System.out.println("thread 2 trying to call A last method");
		
		a.last();
	}
	public  synchronized void last()
	{
		System.out.println("Inside B last method");
	}
}

public class Deadlock_State extends Thread {

	A a=new A();
	B b=new B();
	public void m1()
	{
		this.start();
		a.d1(b);
	}
	@Override
	public void run()
	{
		b.d2(a);
	}
	
	public static void main(String[] args) {

		Deadlock_State d=new Deadlock_State();
		d.m1();
	}

}
