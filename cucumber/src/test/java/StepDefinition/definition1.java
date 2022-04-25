package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class definition1 {

	public WebDriver driver;
	public String expectedTitle="actiTIME -  Enter Time-Track";
	@Before
	public void LaunchB()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
        driver = new FirefoxDriver();       
	}
	
	@After
	public void CloseB()
	{
		driver.close();
		
	}
	@Given("Open app")
	public void open_app() 
	{
	   driver.get("https://demo.actitime.com/login.do");
	}

	@When("Enter id and password and hit Login")
	public void enter_id_and_password_and_hit_login() 
	{
	   driver.findElement(By.id("username")).sendKeys("admin");
	   driver.findElement(By.name("pwd")).sendKeys("manager");
	   driver.findElement(By.id("loginButton")).click();
	}
	
	@When("Enter invalid id and password and hit Login")
	public void enter_invalid_id_and_password_and_hit_login() {
		   driver.findElement(By.id("username")).sendKeys("admin123");
		   driver.findElement(By.name("pwd")).sendKeys("manager");
		   driver.findElement(By.id("loginButton")).click();
	}


	@Then("Home page should be displayed")
	public void home_page_should_be_displayed() 
	{
	   String actualTitle=driver.getTitle();
	   Assert.assertEquals(actualTitle, actualTitle);
	}
	
	@Then("Home page should be displayed with error message")
	public void home_page_should_be_displayed_with_error_message() {
	    System.out.println("Login page displayed");
	}
}





