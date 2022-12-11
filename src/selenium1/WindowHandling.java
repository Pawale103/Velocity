package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudhakar pawale\\Desktop\\Testing Course\\VELOCITY\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		
		String parentId = driver.getWindowHandle();
		System.out.println("parent window id :"+parentId);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Set<String> allWindow = driver.getWindowHandles();
// To print all the window id		
//		for(String windowId:allWindow)
//		{
//			System.out.println(windowId);
//		}
		
		for(String windowId:allWindow)
		{
			if(!(windowId.equals(parentId)))// if not equal to parent id then 
		     {
				driver.switchTo().window(windowId);
				Thread.sleep(5000);
				//driver.findElement(By.xpath("//*[@class='btn btn-ohrm btn-contact-sales']")).click();
				driver.findElement(By.xpath("//*[@id='myText']")).sendKeys("abc@gmail.com");
			 }
					
		}
		driver.switchTo().window(parentId);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("admin");
	}

}
