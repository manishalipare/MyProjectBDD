package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class tester1 {

	@Test
	public void launchB()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.get("https://demo.actitime.com/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		WebElement logOut = driver.findElement(By.id("logoutLink"));
		
		wait.until(ExpectedConditions.elementToBeClickable(logOut));
		
		
	//	WebElement logOut = driver.findElement(By.id("logoutLink"));
		
		//Assert.assertEquals(logOut.isDisplayed(), true);
		
		SoftAssert SA = new SoftAssert();
		SA.assertEquals(logOut.isDisplayed(), true);
		SA.assertAll();
		
		System.out.println("Done");
		
	}
}
