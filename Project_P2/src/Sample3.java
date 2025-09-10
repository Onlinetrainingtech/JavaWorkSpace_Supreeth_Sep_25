
public class Sample3 
{
	
	String cname="azar";//global variable
    void input()
    {
    	int token_number=1001;//local variable
    	System.out.println("Your data is::"+token_number+""+cname);
    }
    void display()
    {
    	System.out.println("Your data is::"+cname);
    }
	public static void main(String[] args) {
		
		Sample3 f1=new Sample3();
		f1.input();
		f1.display();

	}

}
