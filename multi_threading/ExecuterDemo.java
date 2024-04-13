package multi_threading;
import java.util.concurrent.*;
class PrintJob implements Runnable
{
	String name;
	PrintJob(String name)
	{
		this.name=name;
	}
	@Override
	public void run()
	{
		System.out.println(name+"..job started bt thread:"+Thread.currentThread().getName());
	
		try {
			Thread.sleep(5000);
		}catch(InterruptedException e) {}
		System.out.println(name+"..job completed by th eThread"+Thread.currentThread().getName());
	}
}

public class ExecuterDemo {

	public static void main(String[] args) {
		
		PrintJob[]  jobs= {new PrintJob("durga"),
				           new PrintJob("ravi"),
				           new PrintJob("sunil"),
				           new PrintJob("suresh"),
			               	new PrintJob("Anil")};

		ExecutorService service=Executors.newFixedThreadPool(3);
		
		for(PrintJob job:jobs)
		{
			service.submit(job);
		}
		service.shutdown();
	}

}
