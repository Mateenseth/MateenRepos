package Stepdef;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Googledef {
	public WebDriver driver;
	public String exptT;
	public String actT;


	
	
	
	@Given("Open the Google  application")
	public void open_the_google_application() {
		driver=new ChromeDriver();
		driver.get("https://www.Google.com");
	}
	   

	@When("User captures current page title")
	public void user_captures_current_page_title() {
		String exptT="Google";
		String actT=driver.getTitle();
	   
	}

	@Then("Title should match")
	public void title_should_match() {
		Assert.assertTrue(exptT.contains("Google"), "Title is matched");
		System.out.println("Title is matched tc is passed");
	   
	}


}
