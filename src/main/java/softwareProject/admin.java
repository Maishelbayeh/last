package softwareProject;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class admin {

	boolean logState;
	String password;
	
	
	public admin() {
		password="mamash";
		 
	  
		logState=false;
	}
	
	public void setLogState(boolean b) {
		
		logState=b;
	}

	
	public boolean login(String pass) {
		
		if(logState) {
			System.out.println("you are already logged in");
			return false;
		}
		else {
			if(this.password.equals(pass)) {
				System.out.println("successfull log in");
				logState=true;
				return true;
		
			}
			else {
				System.out.println("wrong password");
				return false;
			}
		}
	}

	public boolean getLogState() {
		if(logState) {
			
		}
		
		return logState;
	}

	public void logout() {
		
		if(logState ==false ) {
		
		}
		else {
			logState=false;
			

		}
		
	}
	
	
	
	

}