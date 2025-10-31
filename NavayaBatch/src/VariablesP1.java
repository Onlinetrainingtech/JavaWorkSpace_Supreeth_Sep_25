
public class VariablesP1
{
	int empid=1001;//class or instance variable
    void get1()
    {
    	String empname="azar";//localvariable
    	System.out.println("Your data is::"+empid+"Your empname is::"+empname);
    }
    void get2()
    {
    	System.out.println("Get2 function is::"+empid);
    }
	public static void main(String[] args) {
		
		VariablesP1 f1=new VariablesP1();
		f1.get1();
		f1.get2();

	}

}
