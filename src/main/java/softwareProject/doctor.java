package softwareProject;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

	

public class doctor {
	public boolean logState;
	String password;
public	Map<String, String> doctor;
public	List<Map<String, String>> doctors;
public boolean ln;
public boolean lp;
public boolean SearchDr;
private Scanner scanner;

	public void setLogState(boolean b) {
		logState=b;
		
	}

	public boolean test(List<Map<String, String>> DrData) {
			doctors=DrData;
		String n="Ahmad";
		String p="ahmad123";
		
		if(n==""||p=="") {
			boolean ln = true;
			lp=true;
		}
		
		
		for(int i=0 ;i<DrData.size();i++) {
		 doctor= DrData.get(i);
		
		
		
		if(n.equals(doctor.get("Dr_name"))&&(p.equals(doctor.get("password")))) {
			
			logState=true;
			break;
		
		
		}
		else
			logState=false;
	
	
		}
		return logState;
	
			
	}
	
	public boolean test1(List<Map<String, String>> DrData) {
		doctors=DrData;
	String n="Ahmadd";
	String p="ahmad1233";
	
	if(n==""||p=="") {
		boolean ln = true;
		lp=true;
	}
	
	
	for(int i=0 ;i<DrData.size();i++) {
	 doctor= DrData.get(i);
	
	
	
	if(n.equals(doctor.get("Dr_name"))&&(p.equals(doctor.get("password")))) {
		
		logState=true;
		break;
	
	
	}
	else
		logState=false;


	}
	return logState;

		
}

	public boolean login(boolean l) {
		System.out.println(logState);
		l=logState;
		
		if(logState) {
			System.out.println("successfull log in");
			return true;
		}
		else {
			System.out.println("wrong Password");
				return false;
		
			}
	}

	public boolean getLogState() {
		
		
		return logState;
	}

	
	public void setln(boolean b) {
		ln=b;
		
	}

	public void setlp(boolean b) {
		lp=b;
	}

	public boolean search(String string) {
		return SearchDr;
		// TODO Auto-generated method stub
		
	}

	
}