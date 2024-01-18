package StepDefinition;

import java.util.Iterator;
import java.util.List;
import java.util.Map;


import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UserRegistration {

	@Given("user is on registration on page")
	public void user_is_on_registration_on_page() {
		System.out.println("user navigates on registration page");
	}

	@When("user enters following user details")
	public void user_enters_following_user_details(DataTable dataTable) {
		//List<Map<String, String>> listofmaps = dataTable.asMaps();

				List<String> userlist = dataTable.asList(String.class);
				
				for(String e : userlist) {
					System.out.println(e);
					
				}
				
				
//		for (Map<String, String> map : listofmaps) {
//			for (String key : map.keySet()) {
//
//				String value = map.get(key);
//				
//				System.out.println(key + "--" + value);
//
//			}
//			System.out.println("-----------");
//		}
		
	}
	
	/*
	 * by using columns in dataTable concept..
	 */
	@When("user enters following user details with columns")
	public void user_enters_following_user_details_with_columns(DataTable dataTable) {
	    
		   List<Map<String, String>> userlist= dataTable.asMaps(String.class, String.class);
//		   System.out.println(userlist);
//		   System.out.println(userlist.get(0).get("firstname"));
		    
		   for (Map<String, String> e : userlist) {
			   System.out.println(e.get("firstname"));
			   System.out.println(e.get("position"));
			   System.out.println(e.get("email"));
			   System.out.println(e.get("phone"));
			   System.out.println(e.get("location"));
			   
			
		}
	}

	@Then("user registration should be successful")
	public void user_registration_should_be_successful() {
		System.out.println("user registered successful");
	}

}
