package softwareProject;

import java.util.List;
import java.util.Map;

public class invoice {
     public static String pID;
     public static boolean f=false;
     public static Map<String, String> in;
	 public static Integer c= 1;
	
	public static void find(List<Map<String, String>> Bookings) 
	{
		for(int i=0; i<Bookings.size(); i++) {
			in= Bookings.get(i);
			if(pID.equals(in.get("id"))) {
			
				System.out.println("|   "+c+"  |  "+in.get("id")+"  |  "+in.get( "Dr_id")+"  |  "+in.get("bookdate")+"  |  "+in.get("booktime")+"  |  "+in.get("Bill")+"  |");
				c++;
			}
			
		}
	}
}
