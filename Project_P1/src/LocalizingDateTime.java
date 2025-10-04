import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class LocalizingDateTime {

	public static void main(String[] args) {
		
				/*DateFormat df=DateFormat.getTimeInstance(DateFormat.LONG,new Locale("de","DE"));
				
				String d2=df.format(new Date());
				
			
				System.out.println(d2);*/
				
				DateFormat df=DateFormat.getDateInstance(DateFormat.LONG,new Locale("de","DE"));
				
				String d2=df.format(new Date());
				
			
				System.out.println(d2);



	}

}
