package softwareProject;


	import java.util.ArrayList;
	
	import java.util.List;
import java.util.Map;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import io.cucumber.datatable.DataTable;


	public class user {
		private static String PName;
		public static Map<String, String> ps;
		
		public static List<Map<String, String>>p;
		

		public void setPaName(String PName) {
			this.PName =PName;
		}
		public static String getUserName() {
			return PName;
		}

		public void setmedicalspecialtyName(String pName) {
			this.PName = pName;
		}


		public static List<String> getpatientList() {
			List<String> PatientList = new ArrayList<String>();
			PatientList.add("naveen ");
			PatientList.add("dentist");
			PatientList.add("Neurologist ");
			return PatientList;

		}

		public void test(DataTable dataTable) {
			p=dataTable.asMaps(String.class, String.class);
			
			
		}

		public void genaratenumber(String month) {
			 int no=0;
			 String[] Darr;
			 String[] name =new String[5];
			 System.out.println("Name of The patients");
			for(int i=0 ;i<p.size();i++) {
			
				ps= p.get(i);
				String date=ps.get("date_visit");
				
				 Darr = date.split("-");
				 if(Darr[1].equals("2")) {
					 	no++;
					 	System.out.println(ps.get("firstname"));
					
				 }
			
		}
			// OptionPaneExample("number of patients in hospital in February is : ",no,name);
			
		}
			
	
			
		

			
			
		}

		
		



