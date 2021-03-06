package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class tester3 {

	
	@Test
	public void demo1()
	{
		
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		WebDriverWait wait = new WebDriverWait(driver, 20);
		
		driver.get("https://demo.actitime.com/login.do");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		System.out.println("Total no of links are "  +links.size());
		for(WebElement L: links)
		{
			System.out.println(L.getText());
		}
	}
}
