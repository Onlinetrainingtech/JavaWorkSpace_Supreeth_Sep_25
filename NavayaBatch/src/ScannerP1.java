import java.util.Scanner;

public class ScannerP1 {

	int empid;
	String empname;
	Scanner sc=new Scanner(System.in);
	void input()
	{
		System.out.println("Enter the empid is::");
		empid=sc.nextInt();
		empname=sc.next();
	}
	void display()
	{
		System.out.println("Your data is::"+empid+""+empname);
	}
	public static void main(String[] args) {

      ScannerP1 f1=new ScannerP1();
      f1.input();
      f1.display();

	}

}
