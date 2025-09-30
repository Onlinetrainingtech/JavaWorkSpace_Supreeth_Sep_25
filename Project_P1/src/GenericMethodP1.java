class Demo14
{
	public <M> void test(M t)
	{
		System.out.println(t);
	}
}
public class GenericMethodP1 {

	public static void main(String[] args) {
		
		Demo14 f1=new Demo14();
		f1.test(1001);
		f1.test("mohamed");

	}

}
