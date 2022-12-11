package selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sudhakar pawale\\Desktop\\Testing Course\\VELOCITY\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		String url=driver.getCurrentUrl();
		System.out.println(url);
		driver.findElement(By.xpath("(//*[@class='oxd-text oxd-text--span oxd-main-menu-item--name'])[1]")).click();
		WebElement checkbox=driver.findElement(By.xpath("(//*[contains(@class,'oxd-checkbox-input oxd-checkbox-input--active --label-right oxd-checkbox-input')])[5]"));
		boolean ischeck=checkbox.isSelected();
		System.out.println(ischeck);
		checkbox.click();
		boolean afterclick=checkbox.isSelected();
		System.out.println(afterclick); 
		
		
	}

}
