
public class ThisConcepts {

	int a,b;
	void get1(int a,int b)
	{
		this.a=a;
		this.b=b;
		System.out.println("Your value is::"+a+""+b);
	}
	void display()
	{
		System.out.println("Your value is::"+a+""+b);
	}
	public static void main(String[] args) {
		
		ThisConcepts f1=new ThisConcepts();
		f1.get1(100,200);
		f1.display();

	}

}
