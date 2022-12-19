package najah.edu;

import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import softwareProject.Bill;
import softwareProject.user;


public class reportSteps {
public Bill b;
public static Map<String, String> Books;
int sums;
public BillSteps c;
String month="2" ;
public user p;

@Given("month is {string}")
public void month_is(String string) {
	string=month;
	}




@Then("the Patient report is displays")
public void the_patient_report_is_displays() {
	b=new Bill();
	p=new user();
	p.genaratenumber(month);
}

@Then("the Bills report is displays")
public void the_bills_report_is_displays() {
	b=new Bill();

	b.genaratebills(month);
	
}

}
