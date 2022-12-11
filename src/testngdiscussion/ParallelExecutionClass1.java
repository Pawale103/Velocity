package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ParallelExecutionClass1 {
	
public static WebDriver driver;
	
	
	@Test 
	public void lunchChrome1()
	{
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sudhakar pawale\\\\Desktop\\\\Testing Course\\\\VELOCITY\\\\chromedriver.exe");
		driver= new ChromeDriver();
		driver.get("https://www.google.com/");
		System.out.println("lauching chrome browser");
	}

}
