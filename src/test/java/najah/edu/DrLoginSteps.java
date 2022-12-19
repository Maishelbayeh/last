package najah.edu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import softwareProject.doctor;


public class DrLoginSteps {
	public doctor d;
	public String pass;
	public String name;
	
	public List<Map<String, String>> DrData;		
	public boolean logP;
	public DrLoginSteps() {
	}
	
	
	@Given("these doctors work in the clinic")
	public void theseDoctorsWorkInTheClinic(io.cucumber.datatable.DataTable dataTable) {
		
		
			DrData=  dataTable.asMaps(String.class, String.class);

			

			 System.out.println(DrData);

			


		  
		
	   
	}
	@Given("that the Dr is  logged in")
	public void thatTheDrIsLoggedIn() {
		d=new doctor();
		logP=d.test(DrData);

		d.setLogState(true);
	   
	}
	@Then("the Dr login succeeds")
	public void theDrLoginSucceeds() {

	 assertTrue(d.login(d.logState));

    

	    
	}
	
@Then("the Dr is logged in")
public void  theDrIsLoggedIn() {
	assertTrue(d.getLogState());
   

	    
	}

@Given("that the Dr is not logged in")
public void that_the_dr_is_not_logged_in() {
	d=new doctor();
	logP=d.test1(DrData);

	d.setLogState(false);
   
}

@Then("the Dr login fails")
public void the_dr_login_fails() {
	 assertFalse(d.login(d.logState));
  
}

@Then("the Dr is not logged in")
public void the_dr_is_not_logged_in() {
	 assertFalse(d.login(logP));
  
}


@Given("the password is wrong")
public void thePasswordIsWrong() {
   
}




}