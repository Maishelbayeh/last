package najah.edu;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import softwareProject.clinic;

public class C_Search {
	public clinic ad;
	public boolean checkAdd;
	public C_Add d;
	


	@Given("that the admin is loggined in")
	public void thatTheAdminIsLogginedIn() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Given("the admin want to search clinic with name {string}")
	public void theAdminWantToSearchClinicWithName(String string1) {
	    // Write code here that turns the phrase above into concrete actions
	    ad.c_Name=string1;   
	}


	@When("the clinic not found")
	public void theClinicNotFound() {
	    // Write code here that turns the phrase above into concrete actions
		ad.check(d.clinicData);
	}
     
	@Then("error message {string}")
	public void error_message(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    assertFalse(ad.ex);
	    System.out.println("clinic with name "+ad.c_Name+" "+string);
	}

	@Given("the admin search by number {string}")
	public void theAdminSearchByNumber(String string) {
	    // Write code here that turns the phrase above into concrete actions
	   ad.c_Nom=string;
	   ad.c_Name="";
	}
	@When("the clinic found")
	public void theClinicFound() {
	    // Write code here that turns the phrase above into concrete actions
		ad.check(d.clinicData);
	   
	}
	@Then("the clinic with name {string} is found")
	public void theClinicWithNameIsFound(String string) {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(ad.ex);
	    System.out.println("the clinic with number "+ad.c_Nom+"  and name  "+ad.c_Name+ "  is found");
	}


	@Given("the admin search by name {string}")
	public void theAdminSearchByName(String string) {
	    // Write code here that turns the phrase above into concrete actions
		   ad.c_Name=string;
		   ad.c_Nom="";
	  
	}
	@When("the  clinic exist")
	public void theClinicExist() {
	    // Write code here that turns the phrase above into concrete actions
		ad.check(d.clinicData);
	}
	@Then("the clinic with number {string} is found")
	public void theClinicWithNumberIsFound(String string) {
	    // Write code here that turns the phrase above into concrete actions
		    assertTrue(ad.ex);
		    System.out.println("the clinic with number "+ad.c_Nom+"  and name  "+ad.c_Name+ "  is found");
	}









}
