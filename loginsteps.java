package stepdefintion;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
 
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class loginsteps {
	WebDriver driver=null;
	
	@Given("browser is open")
	public void browser_is_open() {
	    System.out.println("inside step-browser is open");
	    System.setProperty("webdriver.gecko.mariomette","D:\\cucumber_selenium\\art1\\src\\test\\resources\\Drivers\\geckodriver.exe");
	    driver= new FirefoxDriver();
	    driver.manage().window().maximize();
	}

	@And("user is on login page")
	public void user_is_on_login_page() throws Exception {
	  driver.navigate().to("https://www.saucedemo.com/");
	  Thread.sleep(2000);
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() throws Exception {
	     driver.findElement(By.id("user-name")).sendKeys("standard_user");
	     driver.findElement(By.id("password")).sendKeys("secret_sauce");
	      
	}

	@And("User clicks on login")
	public void user_clicks_on_login() {
	     driver.findElement(By.id("login-button")).click();
	     
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() throws Exception {
		 
		driver.findElement(By.id("logout_sidebar_link")).isDisplayed();
		Thread.sleep(5000);
		driver.quit();
		driver.close();
		
	     
	}


}
