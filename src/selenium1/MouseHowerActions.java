package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHowerActions {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\VELOCITY/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		
		WebElement admin = driver.findElement(By.xpath("//*[@href='/web/index.php/admin/viewAdminModule']"));
		Actions act=new Actions(driver);
		act.moveToElement(admin).perform();
		Thread.sleep(2000);
		WebElement buzz=driver.findElement(By.xpath("//*[@href='/web/index.php/buzz/viewBuzz']"));	
		act.moveToElement(buzz).perform();
	}

}
