package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Autosuggestions {

	@Test
	public void launchB()
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
		FirefoxOptions op= new FirefoxOptions();
		op.addPreference("", false);
		
		WebDriver driver = new FirefoxDriver();
	
}
}
