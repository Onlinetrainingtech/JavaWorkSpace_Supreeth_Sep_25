
public class ControlP1 {

	int pid=1002;
	void get1()
	{
		if(pid==1001)
		{
			System.out.println("Your pid is eqaul");
		}
		else
		{
			System.out.println("Your pid is not equal");
		}
	}
	void get2()
	{
		int age=61,bns,salary=20000;
		if(age>=60)
		{
			if(salary>=20000)
			{
				bns=salary+500;
				System.out.println("Your salary is::"+bns);
			}
			else
			{
				bns=salary+1000;
				System.out.println("Your salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Your age is low");
		}
	}
	public static void main(String[] args) {
		
		ControlP1 f1=new ControlP1();
		//f1.get1();
		f1.get2();

	}

}
