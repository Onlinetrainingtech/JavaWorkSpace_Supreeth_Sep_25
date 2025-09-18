interface B12
{
	int a=100;
	void get();
}
interface B13
{
	int b=20;
	void get1();
}
class D13 implements B12,B13
{

	@Override
	public void get1() {
		System.out.println("This is get1 function");
		
	}

	@Override
	public void get() {
		System.out.println("This is get2 function");
		
	}
	
}
public class InterfaceConcepts {

	public static void main(String[] args) {
		
		D13 f1=new D13();
		f1.get();
		f1.get1();

	}

}
