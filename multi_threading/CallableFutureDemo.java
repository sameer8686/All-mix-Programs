package multi_threading;
import java.util.concurrent.*;
class mycallable implements Callable
{
	int num;
	mycallable(int num)
	{
		this.num=num;
	}
	
	public Object call() throws Exception
	{
		System.out.println(Thread.currentThread().getName()+"is.. responsibe to find sum of first "+num+"number");
	int sum=0;
	for(int i=0;i<=num;i++)
	{
		sum=sum+i;
	}
	return sum;
		
	}
}

public class CallableFutureDemo {

	public static void main(String[] args) throws InterruptedException, ExecutionException {


		mycallable[] jobs= {new mycallable(10),
				new mycallable(20),
				new mycallable(30),
				new mycallable(40),
				new mycallable(50),
				new mycallable(60)};
		ExecutorService service=Executors.newFixedThreadPool(3);
		for(mycallable job:jobs)
		{
			Future f=service.submit(job);
			System.out.println(f.get());
		}
		service.shutdown();
		
	}

}
