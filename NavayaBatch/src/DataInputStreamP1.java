import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamP1 {

	int pid;
	String pname;
	DataInputStream dis=new DataInputStream(System.in);
	void input() throws NumberFormatException, IOException
	{
		System.out.println("Enter the pid is::");
	    pid=Integer.parseInt(dis.readLine());
		pname=dis.readLine();
	}
	void display()
	{
		System.out.println("Your value is:"+pid+""+pname);
	}
	public static void main(String[] args) throws IOException {
		
		DataInputStreamP1 f1=new DataInputStreamP1();
		f1.input();
		f1.display();

	}

}
