package najah.edu;

import java.util.List;
import java.util.Map;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Add_Admin {
	@Given("Admin is on Add_Admin page")
	public void admin_is_on_add_admin_page() {
		System.out.println("user navigates on registration page");
	}

	@When("Admin enters following Admin details")
	public void admin_enters_following_admin_details(io.cucumber.datatable.DataTable dataTable) {
		List<List<String>> userList = dataTable.asLists(String.class);

		for (List<String> e : userList) {
			System.out.println(e);
		}
	}

	@Then("Admin registration should be successful")
	public void admin_registration_should_be_successful() {
		System.out.println("Admin registration should be successful");
	
	}

	@When("Admin enters following Admin details with columns")
	public void admin_enters_following_admin_details_with_columns(io.cucumber.datatable.DataTable dataTable) {
	List<Map<String, String>> userList = dataTable.asMaps(String.class, String.class);
		
//		System.out.println(userList);
//		System.out.println(userList.get(0).get("firstname"));
		
		for(Map<String, String> e : userList) {
			System.out.println(e.get("username"));
			System.out.println(e.get("Password"));
			
		}
		
	}
}