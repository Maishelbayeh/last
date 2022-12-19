package softwareProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class doctors {
	public static String d_id,name, specialty, phone,password,city,bill;
	static Map<String, String> doctors;
	public static boolean ex=false;
	public static ArrayList<String> doc=new ArrayList<String>();
	
	
	
	public static boolean check(List<Map<String, String>> docData)
	{
		for(int i=0 ;i<docData.size();i++) {
			 doctors= docData.get(i);
			 
				
		 if(d_id.equals(doctors.get("Dr_id"))) {
				
				ex=true;
				break;
			
			
			}
		}
			if(!ex) {
				ex=false;
				doc.add(0,d_id);
				doc.add(name);
				doc.add(specialty);
				doc.add(phone);
				doc.add(password);
				doc.add(city);
				doc.add(bill);
				System.out.println("The doctor with these informations added");
				System.out.println("|  "+d_id+"  |  "+name+"  |  "+specialty+"  |  "+phone+"  |  "+password+"  |  "+city+"  |  "+bill+"  |  ");
			
			}
		
		
			
		
		return ex;
	}
}
