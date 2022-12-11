package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropdownHandling {

	public static void main(String[] args) throws InterruptedException {
		
System.setProperty("webdriver.chrome.driver","C:\\Users\\sudhakar pawale\\Desktop\\Testing Course\\VELOCITY\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://zoom.us/signup");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id='select-0']")).click();
		//driver.findElement(By.xpath("//*[b@id='select-item-select-0-0']")).click();
		
		List<WebElement> months=driver.findElements(By.xpath("//*[contains(@id,'select-item-select-0')]"));	
		
		for(WebElement month:months)
		{
			String str=month.getText();
			System.out.println(str);
		}
		for(int i=0;i<=11;i++)
		{
			String str1=driver.findElement(By.xpath("//*[contains(@id,'select-item-select-0-"+i+"')]")).getText();
			System.out.println(str1);
		}

	}

}
