
public class ThreadP2 extends Thread
{

	public void run()
	{
		try
		{
			System.out.println("CurrentThreadName::"+Thread.currentThread().getName());
			System.out.println("Priority::"+Thread.currentThread().getPriority());
			for(int i=0;i<=5;i++)
			{
				Thread.sleep(10000);
				System.out.println("I value is::"+i);
			}
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		
		ThreadP2 t1=new ThreadP2();
		t1.start();
		t1.setName("welcome");
		t1.setPriority(Thread.MAX_PRIORITY);
		System.out.println(t1.isAlive());
		System.out.println(t1.isInterrupted());

	}

}
