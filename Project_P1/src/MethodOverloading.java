
public class MethodOverloading {

	void get1(int a)
	{
		System.out.println("Your data is::"+a);
	}
	void get1(String name,int salary)
	{
		System.out.println("Your data is::"+name+""+salary);
	}
	public static void main(String[] args) {
		
		MethodOverloading f1=new MethodOverloading();
		f1.get1(1001);
		f1.get1("azar",10000);

	}

}
