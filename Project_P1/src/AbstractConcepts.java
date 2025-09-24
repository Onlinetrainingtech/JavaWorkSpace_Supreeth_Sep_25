abstract class Sample19
{
	abstract void get1();
	void get2()
	{
		System.out.println("This is get2 function...");
	}
}
class D12 extends Sample19
{
	public void get1()
	{
		System.out.println("This is abstract methods...");
	}
}
public class AbstractConcepts {

	public static void main(String[] args) {
		
		D12 f1=new D12();
		f1.get1();
		f1.get2();

	}

}
