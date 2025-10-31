class Demo
{
	void get1()
	{
		System.out.println("This is get1 methods");
	}
	void get2(int empid,String empname)
	{
		System.out.println("This is get2 methods"+empid+""+empname);
	}
}
public class Program1 {

	public static void main(String[] args) {
		
		Demo f1=new Demo();
		f1.get1();
		f1.get2(1001,"raja");

	}

}
