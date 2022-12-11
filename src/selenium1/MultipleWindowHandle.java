package selenium1;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandle {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudhakar pawale\\Desktop\\Testing Course\\VELOCITY\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		
		String parentId = driver.getWindowHandle();
		System.out.println("parent window id :"+parentId);
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("//*[text()='OrangeHRM, Inc']")).click();
		Set<String> allWindow = driver.getWindowHandles();
		int numberOfWindows = allWindow.size();
		String winId[]= new String[numberOfWindows];
		int i=0;
		for(String id:allWindow)
		{
			winId[i]=id;
			i++;
		}
		// to print the array whcih contains all the elements
		for(String ss:winId)
		{
			System.out.println(ss);
		}
		
		
		
	}

}
