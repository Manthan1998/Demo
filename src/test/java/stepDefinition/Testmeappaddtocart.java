package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Testmeappaddtocart {
	static WebDriver Driver;
	@Given("App is launched with the url zz")
	public void app_is_launched_with_the_url_zz() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\training_d2.03.07\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe");
	Driver = new ChromeDriver();
		
Driver.get("http://10.232.237.143:443/TestMeApp");
Driver.manage().window().maximize();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Given("Enter the username {string} zz")
	public void enter_the_username_zz(String string) {
		Driver.findElement(By.linkText("SignIn")).click();
	 Driver.findElement(By.xpath("//*[@id='userName']")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Enter the password {string} zz")
	public void enter_the_password_zz(String string) {
		Driver.findElement(By.xpath("//*[@id=\"password\"]")).sendKeys(string);
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("User clicks on the login button zz")
	public void user_clicks_on_the_login_button_zz() {
	    // Write code here that turns the phrase above into concrete actions
//	    throw new cucumber.api.PendingException();
		Driver.findElement(By.xpath("/html/body/main/div/div/div/form/fieldset/div[4]/div/input[1]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("Select the product from all categories zz")
	public void select_the_product_from_all_categories_zz() {
		Driver.findElement(By.xpath(".//button[contains(@onclick,'viewProd')]")).click();
		Select cat_name= new Select(Driver.findElement(By.id("categorydropid")));
		cat_name.selectByVisibleText("Electronics");
		Select sub_cat=new Select(Driver.findElement(By.id("subcategorydropid")));
		sub_cat.selectByVisibleText("Travel Kit");
		Driver.findElement(By.id("subcategorydropid")).click();
		Driver.findElement(By.xpath(".//input[@value='View Products']")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("click on add to cart zz")
	public void click_on_add_to_cart_zz() {
		Driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[2]/center/a")).click();
		
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

	@Then("click on cart button zz")
	public void click_on_cart_button_zz() {
		Driver.findElement(By.xpath("//*[@id=\"header\"]/div[1]/div/div/div[2]/div/a[2]")).click();
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
	}

	@Then("click on remove button zz")
	public void click_on_remove_button_zz() {
		Driver.findElement(By.xpath("//*[@id=\"cart\"]/tbody/tr/td[5]/form/input[2]")).click();
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	}

}
