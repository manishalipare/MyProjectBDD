package Selenium;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class tester5 {
	
	@Test
	public void demo()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		driver.get("https://www.flagstar.com/");	
		
		String ppid=driver.getWindowHandle();
	    Set <String> child = driver.getWindowHandles();
	    ArrayList<String> list = new ArrayList<String>(child);
	    Collections.reverse(list);
	    
	    for(String W : list)
	    {
	    	driver.switchTo().window(W);
	    	System.out.println(driver.getTitle());
	    	System.out.println(W);
	    }
	    
	  
		

}
}