package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FacebookSignUpWithActionsClass {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\VELOCITY/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		Thread.sleep(2000);		
		WebElement firstname=driver.findElement(By.xpath("//*[@name='firstname']"));		
		Actions act = new Actions(driver);	
		act.sendKeys(firstname, "NameTab").sendKeys(Keys.TAB)
		.sendKeys("LastNameTab").sendKeys(Keys.TAB)
		.sendKeys("EmailID").sendKeys(Keys.TAB)
		.sendKeys("ConfirmEmailID").sendKeys(Keys.TAB)
		.sendKeys("Password@123").sendKeys(Keys.TAB).
		sendKeys(Keys.ENTER).sendKeys("10").sendKeys(Keys.ENTER).build().perform();
		
		//WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		//act.click(day).sendKeys("8").sendKeys(Keys.ENTER).build().perform();
	}

}
