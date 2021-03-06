package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class JavaScriptExecutor1 {

	@Test
	public void demo() throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	driver.get("https://www.istqb.org/");
	
	Thread.sleep(4000);
	
	JavascriptExecutor JS = (JavascriptExecutor)driver;
	JS.executeScript("window.scrollBy(0,500)");
	
	
	
}
}
