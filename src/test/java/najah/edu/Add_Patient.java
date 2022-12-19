package najah.edu;

	import java.util.List;
	import java.util.Map;

	import io.cucumber.datatable.DataTable;
	import io.cucumber.java.en.Given;
	import io.cucumber.java.en.Then;
	import io.cucumber.java.en.When;
import softwareProject.user;

public class Add_Patient {
	DataTable dataTable;
	List<Map<String, String>> pList;
	public user p;
	@Given("Admin is on Add_patient page")
	public void admin_is_on_add_patient_page() {
			System.out.println("user navigates on registration page");
		}

	@When("Admin enters following Patient details")
	public void admin_enters_following_patient_details(io.cucumber.datatable.DataTable dataTable) {
			List<List<String>> List = dataTable.asLists(String.class);

			for (List<String> e : List) {
				System.out.println(e);
			}
		}

	@When("Admin enters following Patient details with columns")
	public void admin_enters_following_patient_details_with_columns(io.cucumber.datatable.DataTable dataTable) {
		
		List<Map<String, String>> patientList = dataTable.asMaps(String.class, String.class);
		pList=patientList;
			for(Map<String, String> e : pList) {
				System.out.println(e.get("id"));
				System.out.println(e.get("firstname"));
				System.out.println(e.get("lastname"));
				System.out.println(e.get("email"));
				System.out.println(e.get("phone"));
				System.out.println(e.get("city"));
				System.out.println(e.get("date_visit"));
				System.out.println(e.get("visit flag"));
				
			}
			p=new user();
			p.test(dataTable);
		}

		@Then("user registration should be successful")
		public void user_registration_should_be_successful() {
			System.out.println("Patient registration should be successful");

		}

	}


