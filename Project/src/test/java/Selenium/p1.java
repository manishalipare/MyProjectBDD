package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class p1 {
   
	@Test
	public void demo() throws InterruptedException
	{
	System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	WebDriver driver = new FirefoxDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	WebDriverWait wait = new WebDriverWait(driver, 20);
	
	driver.get("https://www.flagstar.com/");
	WebElement Banking = driver.findElement(By.xpath("//span[text()='Banking']"));
	
	Actions action = new Actions(driver);
	action.moveToElement(Banking).click().perform();
	
	Thread.sleep(5000);
	
	WebElement ViewRate = driver.findElement(By.xpath("(//span[text()='View Rates'])[1]"));
	
	action.moveToElement(ViewRate).click().perform();
	
	
	
}
}
