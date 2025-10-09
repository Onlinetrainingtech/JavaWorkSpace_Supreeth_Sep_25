import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionP1 {

	void get1()
	{
		try
		{
		int a=100/0;
		}
		catch(ArithmeticException t)
		{
			System.out.println("Please check the value"+t);
		}
		System.out.println("This is Exception");
	}
	void get2()
	{
		try
		{
		String s1=null;
		//String s1="welcome";
		System.out.println("Your value is::"+s1.length());
		}
		catch(NullPointerException t)
		{
			System.out.println("Please check the value");
		}
	}
	void get3()
	{
		try
		{
		int a[]=new int [2];
		int n,i;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the n value is::");
		n=sc.nextInt();
		for(i=0;i<=n;i++)
		{
			System.out.println("Enter the array value is::");
			a[i]=sc.nextInt();
			System.out.println("Your value is::"+a[i]);
		}
		}
		catch(ArrayIndexOutOfBoundsException t)
		{
			System.out.println("Array out of size::"+t);
		}
		catch(InputMismatchException t1)
		{
			System.out.println("Given Input Properly::"+t1);
		}
		finally
		{
			System.out.println("This is finally block");
		}
		
	}
	public static void main(String[] args) {
		
		ExceptionP1 f1=new ExceptionP1();
		//f1.get1();
		//f1.get2();
		f1.get3();

	}

}
