import java.util.HashMap;
import java.util.Map;

public class MapConcepts {

	HashMap<Integer,String>list1=new HashMap<Integer, String>();
	void get1()
	{
		list1.put(1001,"azar");
		list1.put(1002,"mohamed");
		list1.put(1003,"raja");
		for(Map.Entry h1:list1.entrySet())
		{
			System.out.println(h1.getKey());
			System.out.println(h1.getValue());
		}
		System.out.println("List is::"+list1);
		System.out.println("Removing data is::"+list1.remove(1001));
		System.out.println("Searching data is::"+list1.containsKey(1001));
		System.out.println("TotalSize is::"+list1.size());
		System.out.println("Your data is after removing..."+list1);
	}
	public static void main(String[] args) {
	
		MapConcepts f1=new MapConcepts();
		f1.get1();

	}

}
