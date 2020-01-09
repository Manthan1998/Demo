package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class FlipkartLoginDefinitions {
static WebDriver driver;
	@Given("User launches the DemoWebShop App")
	public void user_launches_the_DemoWebShop_App() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("http://demowebshop.tricentis.com/");
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User clicks on SignIn button")
	public void user_clicks_on_SignIn_button() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).click();
		//driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[1]/div[3]/input")).click();
			    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("User provides the valid data for all the fields")
	public void user_provides_the_valid_data_for_all_the_fields() {
		driver.findElement(By.xpath("//*[@id=\"gender-male\"]")).click();
		driver.findElement(By.xpath("//*[@id=\"FirstName\"]")).sendKeys("Manthan");
		driver.findElement(By.xpath("//*[@id=\"LastName\"]")).sendKeys("Chandel");
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("manthanchandl31@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Manthan");
		driver.findElement(By.xpath("//*[@id=\"ConfirmPassword\"]")).sendKeys("Manthan");
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@When("User clciks in submit button at the end of the form")
	public void user_clciks_in_submit_button_at_the_end_of_the_form() {
		driver.findElement(By.xpath("//*[@id=\"register-button\"]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Verifies the result for registration")
	public void verifies_the_result_for_registration() {
		Assert.assertTrue(driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a")).getText().contains("manthanchandel31@gmail.com"));
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Prints the message")
	public void prints_the_message() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Applicatiion launched by registered user")
	public void applicatiion_launched_by_registered_user() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[2]/input")).click();
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User access the Login link")
	public void user_access_the_Login_link() {
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Provides the valid data as input")
	public void provides_the_valid_data_as_input() {
		driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys("manthanchandl31@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"Password\"]")).sendKeys("Manthan");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Verifies the login status")
	public void verifies_the_login_status() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}
	
}

