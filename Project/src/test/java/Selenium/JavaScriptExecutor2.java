package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JavaScriptExecutor2 {


	@Test
	public void demo() throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	driver.get("https://demo.actitime.com/login.do");
	WebElement UN = driver.findElement(By.id("username"));
    WebElement PWD = driver.findElement(By.name("pwd"));
	WebElement Login = driver.findElement(By.id("loginButton"));
	
	
	Thread.sleep(4000);
	
	JavascriptExecutor JS = (JavascriptExecutor)driver;
	JS.executeScript("arguments[0].value='admin'", UN);
	JS.executeScript("arguments[0].value='manager'", PWD);
	JS.executeScript("arguments[0].click()", Login);
	
	System.out.println("Done");
}
}





