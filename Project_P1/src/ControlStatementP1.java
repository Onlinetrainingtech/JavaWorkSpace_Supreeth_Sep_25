import java.util.Scanner;

public class ControlStatementP1 {

	int a;
	Scanner sc=new Scanner(System.in);
	void get1()
	{
		System.out.println("Enter the a value is::");
		a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("Its is Even");
		}
		else
		{
			System.out.println("Its is Odd");
		}
	}
	void get2()
	{
		int age,salary,bns;
		System.out.println("Enter the age is::");
		age=sc.nextInt();
		if(age>=60)
		{
			System.out.println("Enter the salary is::");
			salary=sc.nextInt();
			if(salary>=20000)
			{
				bns=salary+500;
				System.out.println("Your Salary is::"+bns);
			}
			else
			{
				bns=salary+1000;
				System.out.println("Your Salary is::"+bns);
			}
		}
		else
		{
			System.out.println("Your age is low");
		}
	}
	public static void main(String[] args) {
		
		ControlStatementP1 f1=new ControlStatementP1();
		//f1.get1();
		f1.get2();

	}

}
