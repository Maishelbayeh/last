//package softwareProject;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//public class visited {
//	public static String ID;
//	public static String firstname;
//	public static String lastname;
//	public static String email;
//	public static String phone;
//	public static String city;
//	public static String date_visit; 
//	public static String visitedFlag;
//	public static String idD;
//	public static String bookdate;
//	public static String booktime;
//	public static String Bill;
//	static Map<String, String> pati;
//	static Map<String, String> doc;
//	static Map<String, String> bookings;
//	public static boolean chP=false;
//	public static ArrayList<String> newP=new ArrayList<String>();
//	public static ArrayList<String> newBookings= new ArrayList<String>() ;
//	
//	public static void checkP(List<Map<String, String>> patientData,List<Map<String, String>> docData)
//	{
//		
//		for(int i=0 ;i<patientData.size();i++) 
//		{
//			pati=patientData.get(i);
//			
//			if(ID.equals(pati.get("id"))) {
//				 chP= true;
//			}
//			
//		}
//		    if(!chP) 
//		    {
//		    	newP.add(ID);
//		    	newP.add(firstname);
//		    	newP.add(lastname);
//		    	newP.add(email);
//		    	newP.add(phone);
//		    	newP.add(city);
//		    	newP.add(date_visit);
//		    	newP.add(visitedFlag);
//		    	newBookings.add(ID);
//		    	newBookings.add(idD);
//		    	newBookings.add(bookdate);
//		    	newBookings.add(booktime);
//		    	for(int i=0 ;i<docData.size();i++) 
//				{
//					doc=docData.get(i);
//					
//					if(idD.equals(doc.get("Dr_id"))){
//						Bill= doc.get("bill");
//						newBookings.add(Bill);
//					}
//		    	 	
//		        }
//		    }
//		    
//	}
//
//}
