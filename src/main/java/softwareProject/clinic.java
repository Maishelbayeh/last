package softwareProject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class clinic {
	public static String c_Nom;
	public static String c_Name;
	static Map<String, String> clinics;
	public static boolean ex=false;
	
	public static boolean check(List<Map<String, String>> clinicData)
	{
		for(int i=0 ;i<clinicData.size();i++) {
			 clinics= clinicData.get(i);
			
			if(c_Nom.isEmpty()) {
				if(c_Name.equals(clinics.get("Clinic_name"))) {
					ex=true;
					System.out.println("The clinic with Number "+clinics.get("Clinic_num"));
					c_Nom=clinics.get("Clinic_num");
					break;
				}
				else
					continue;
			}
			
			else if(c_Name.isEmpty()) {
				if(c_Nom.equals(clinics.get("Clinic_num"))) {
					ex=true;
					System.out.println("The clinic is "+clinics.get("Clinic_name"));
					c_Name=clinics.get("Clinic_name");
					break;
				}
				else
					continue;
			}
			else if(c_Nom.equals(clinics.get("Clinic_num"))&&(c_Name.equals(clinics.get("Clinic_name")))) {
				
				ex=true;
				break;
			
			
			}
	       
			else
				ex=false;
		
		
			}
		
		return ex;
	}

}
