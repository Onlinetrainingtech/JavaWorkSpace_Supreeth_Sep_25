import java.util.Scanner;

public class Sample3 {

	int empid,salary;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid,empname,salary");
		empid=sc.nextInt();
		empname=sc.next();
		salary=sc.nextInt();
	}
	void display()
	{
		System.out.println("Your value is::"+empid+""+empname+""+salary);
	}
	public static void main(String[] args) {
		
		Sample3 f1=new Sample3();
		f1.input();
		f1.display();

	}

}
