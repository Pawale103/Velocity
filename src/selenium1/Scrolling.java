package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {
	 public static WebDriver driver;
	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudhakar pawale\\Desktop\\Testing Course\\VELOCITY\\chromedriver.exe");		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0, 1200)");
		
		
		WebElement checkbox=driver.findElement(By.xpath("//*[@type='checkbox'and @value='17']"));
		js.executeScript("arguments[0].scrollIntoView()",checkbox);
		js.executeScript("arguments[0].click();", checkbox);
		WebElement username = driver.findElement(By.xpath("(//*[@class='oxd-input oxd-input--active'])[2]"));
		js.executeScript("arguments[0].value='typedValue';", username);
		System.out.println("completed");
		
	}

}
