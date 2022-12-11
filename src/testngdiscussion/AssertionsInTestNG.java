package testngdiscussion;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class AssertionsInTestNG {
	
	
	@Test
	public void login()
	{
		Reporter.log("Login Test",true);
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudhakar pawale\\Desktop\\Testing Course\\VELOCITY\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		
		String url=driver.getCurrentUrl();
		String expected="viewEmployeeList";
		
		//Assert.assertEquals(url.contains(expected), true);
		
		System.out.println("Completed");
	}

}
