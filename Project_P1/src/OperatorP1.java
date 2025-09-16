import java.util.Scanner;

public class OperatorP1 {

	int a1,a2;
	Scanner sc=new Scanner(System.in);
	void arithmeticOperators()
	{
		System.out.println("Enter the value is::");
		a1=sc.nextInt();
		a2=sc.nextInt();
		System.out.println("Add::"+(a1+a2));
		System.out.println("Sub::"+(a1-a2));
		System.out.println("Mul::"+(a1*a2));
		System.out.println("Div::"+(a1/a2));
		System.out.println("Mod::"+(a1%a2));
	}
	void comparisionOperator()
	{
		System.out.println("Enter the value is::");
		a1=sc.nextInt();
		a2=sc.nextInt();
		System.out.println("Lessthan::"+(a1<a2));
		System.out.println("Greaterthan::"+(a1>a2));
		System.out.println("Equal to::"+(a1==a2));
		System.out.println("Not equal::"+(a1!=a2));
	}
	void LogicalOperator()
	{
		System.out.println("Enter the value is::");
		a1=sc.nextInt();
		a2=sc.nextInt();
		System.out.println("LogicalAND::"+((a1<a2)&&(a2>a1)));
		System.out.println("LogicalOR::"+((a1<a2)||(a2<a1)));
		System.out.println("LogicalNOT::"+(!(a1<a2)));
	}

	public static void main(String[] args) {
		
		OperatorP1 f1=new OperatorP1();
		f1.arithmeticOperators();
		f1.comparisionOperator();
		f1.LogicalOperator();

	}

}
