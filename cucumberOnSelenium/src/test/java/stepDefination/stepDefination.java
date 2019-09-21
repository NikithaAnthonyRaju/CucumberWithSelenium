package stepDefination;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import commonUtility.base;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.gmailPage;
import pages.googlePage;

public class stepDefination {
	base base = new base();
	gmailPage gmail = new gmailPage();
	googlePage google = new googlePage();

	// //To execute before a scenario with Tag
	// @Before("@Tag")
	// public void beforeMethod() {
	// System.out.println("########### Beforeeeeee Methoddddd ###########");
	// }
	//
	// //To execute after each scenario irrespective of feature files
	// @After
	// public void afterMethod() {
	// System.out.println("########### Afterrrrrr Methoddddd ###########");
	// }
	//
	// static {
	// System.out.println("$$$$$$$$$$$$$$ Executing Static Block
	// $$$$$$$$$$$$$$$$$");
	// }

	@Given("^Application URL & driver details from Configuration file$")
	public void application_URL_and_driver_details() throws Throwable {
		System.out.println("Information are feeded in config.properties file");
	}

	@When("^launch the application on browser$")
	public void launch_the_application_on_browser() throws Throwable {
		base.setBrowser();
		base.accessApplicationURL();
	}

	@When("^reading a Json \"([^\"]*)\"$")
	public void reading_a_Json(String fileName) throws Throwable {
		File requestFile = new File("src/test/resources/testdata/" + fileName);
		String request = new String(Files.readAllBytes(Paths.get(requestFile.getCanonicalPath())));
		System.out.println(request.toString());

	}

	@Then("^navigate to forWork Page$")
	public void navigate_to_forWork_Page() throws Throwable {
		gmail.validatePageTitle();
		gmail.clickForWork();
	}

	@Then("^Click on Get Started button$")
	public void click_on_Get_Started_button() throws Throwable {
		Thread.sleep(10000);
		google.validatePageTitle();
		google.clickGetButton();
	}

}
