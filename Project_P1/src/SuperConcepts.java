class B14
{
    int a=100;
	void get1()
	{
		System.out.println("Base class::"+a);
	}
}
class D15 extends B14
{
	void get2()
	{
		int a=200;
		System.out.println("Dervied class::"+super.a);
	}
}
public class SuperConcepts {

	public static void main(String[] args) {
		
		D15 g1=new D15();
		g1.get1();
		g1.get2();

	}

}
