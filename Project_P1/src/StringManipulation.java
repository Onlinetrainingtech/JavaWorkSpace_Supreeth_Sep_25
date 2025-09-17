
public class StringManipulation {

	public static void main(String[] args) {
		
		String s1=new String("welcome");
		String s2="hello";
		System.out.println("Your value is instance::"+s1);
		System.out.println("Your variable is::"+s2);
		
		System.out.println("Length::"+s1.length());
		
		System.out.println("CharAt::"+s1.charAt(0));
		
		System.out.println("joining::"+s1.concat(s2));
		
		System.out.println("CharacterIndex::"+s1.indexOf('w'));
		
		System.out.println("SubString::"+s1.substring(0));
		
		System.out.println("Starting::"+s1.startsWith("w"));
		
		System.out.println("Ending::"+s1.endsWith("h"));
		
		
		
		

	}

}
