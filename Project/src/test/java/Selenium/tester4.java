package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class tester4 {
	@Test
	public void demo1() throws InterruptedException
	{
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.get("https://www.google.com/");	
		Thread.sleep(5000);
		WebElement imagee = driver.findElement(By.id("hplogo"));
		String name = imagee.getTagName();
		if(name.equals("img"))
		{
			System.out.println("Passed");
		}
		
		else
		{
			System.out.println("failed");
		}
		
		
		
		
	}
}
