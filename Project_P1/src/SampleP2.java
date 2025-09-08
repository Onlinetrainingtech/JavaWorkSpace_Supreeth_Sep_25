
public class SampleP2 {

	int productid=1001;//class or instance variable
	void get1()
	{
		String pname="apple";//localvariable
		System.out.println("Your value is::"+pname+""+productid);
	}
	void get2()
	{
		System.out.println("Your value is::"+productid);
	}
	public static void main(String[] args) {
		
		SampleP2 f1=new SampleP2();
		f1.get1();
		f1.get2();

	}

}
