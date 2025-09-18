class B1
{
	int a=100;
	void get1()
	{
		System.out.println("This is Base class");
	}
}
class D1 extends B1
{
	int b=200;
	void get2()
	{
		System.out.println("This is Dervied class");
	}
}
class D2 extends D1
{
	void get3()
	{
		int c;
		c=a*b;
		System.out.println("Dervied data is::"+c);
	}
}
public class MultilevelInheritanceP1 {

	public static void main(String[] args) {
		
		D2 f1=new D2();
		f1.get1();
		f1.get2();
		f1.get3();

	}

}
