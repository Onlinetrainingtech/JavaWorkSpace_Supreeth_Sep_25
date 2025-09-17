
public class StringManipulationP2 {

	public static void main(String[] args) {
		
		StringBuilder sb=new StringBuilder("welcome");
		
		sb.append(" are good for health");
		
		System.out.println("Appending::"+sb);
		
		sb.delete(10,15);
		
		System.out.println("Deleted::"+sb);
		
		sb.insert(6,"are");
		
		System.out.println("Inserted::"+sb);
		



	}

}
