package softwareProject;

import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Bill {
	public static String pID;
	public static String dID;
	public static String bookdate;
	public static Integer hour ;
	public static Integer min ;
	public static String Bill;
    public  String date;
	public static Map<String, String> Books;
	public static boolean correct=false;
	public static int c;
	public static List<Map<String, String>> Booking;
	public static Integer sum=0;
	public static void find(List<Map<String, String>> Bookings) 
	{
		Booking=Bookings;
		for(int i=0 ;i<Bookings.size();i++) {
			
			c=i;
			 Books= Bookings.get(i);
			 sum=sum+Integer.parseInt(Books.get("Bill"));
			 System.out.println(Books.get("Bill"));
			 if(pID.equals(Books.get("id"))) {
				 dID= Books.get("Dr_id");
				 bookdate= Books.get("bookdate");
				 if(correct) {
				 String Bookt= Books.get("booktime");
				 String[] ar;
						ar = Bookt.split(":");
						hour=Integer.parseInt(ar[0]);
						min= Integer.parseInt(ar[1]);
						
				 }
				 Bill= Books.get("Bill"); 
			   
			 }
		 
	 }
		if(!correct) {
			for(int i=0 ;i<Bookings.size();i++) {
				Books=Bookings.get(i);
				if(dID.equals(Books.get("Dr_id"))&&bookdate.equals(Books.get("bookdate"))) {
					if(!pID.equals(Books.get("id"))) {
					System.out.println("Sorry the doctor have another patient now  "+Books.get("id"));
					hour= hour+1;
					System.out.println("Your another book time at: "+hour+ ":"+min);
					}
				}
			}
		}
	}
	public void genaratebills(String month) {
		int s=0;
		sum=0;
for(int i=0 ;i<Booking.size();i++) {
			 Books= Booking.get(i);
			 date=Books.get("bookdate");
			 int no=0;
			 String[] Darr;
			 Darr = date.split("-");
			 if(Darr[1].equals("2")) {
				 	no++;
				s=s+Integer.parseInt(Books.get("Bill"));
			 }
}
        
		System.out.println(s);
}
	
	
		
	
}
	


