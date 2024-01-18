package myHooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class AmazonHooks {

	@Before("@Smoke")
	public void setup() {
		System.out.println("...launch amazon application...");
	}

	@After("@Smoke")
	public void tearDown() {
		System.out.println("...Close the browser..");
	}
	/*
	 * we can have multiple @Before and @After annotation
	 * and declaring the order numbers that when should this
	 * particular method should execute..
	 * 
	 *  scenario levels also we can use it over here..
	 *  by getting the scenario name and status of it and isfailed  methods.. etc..
	 *  
	 *  we  can use annotation at step level also accordingly..
	 *  @BeforeStep
	 *  @AfterStep
	 *  
	 *  using Hooks with tags also we can do it.. be careful while playing with this concept..!
	 */
	
//	@Before(order = 1)
//	public void setup_browser(Scenario sc) {
//		System.out.println("...launch chrome browser...");
//		System.out.println(sc.getName());
//	}

//	@Before(order = 2)
//	public void setup_url(Scenario sc) {
//		System.out.println("...launch url...");
//		System.out.println(sc.getName());
//	}
//
//	@After(order = 2)
//	public void tearDown_close() {
//		System.out.println("...Close the browser..");
//	}
//	@After(order = 1)
//	public void tearDown_logout() {
//		System.out.println("...logout from application..");
//	}
	
//	@BeforeStep
//	public void takesScreenShot() {
//		System.out.println("Take a Screen Shot...");
//	}
//	
//	@AfterStep
//	public void refreshPage() {
//		System.out.println("Refresh the Page...");
//	}
	
}
