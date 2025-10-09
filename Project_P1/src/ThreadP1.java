
public class ThreadP1 extends Thread
{

	public void run()
	{
		try
		{
		System.out.println("ThreadIn");
		Thread.sleep(10000);
		System.out.println("ThreadOut");
		}
		catch(InterruptedException t)
		{
			System.out.println(t);
		}
	}
	public static void main(String[] args) {
		
		ThreadP1 t1=new ThreadP1();
		ThreadP1 t2=new ThreadP1();
		t1.start();
		t2.start();

	}

}
