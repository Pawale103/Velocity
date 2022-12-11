package autosuggestions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestionsHandle {

	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\sudhakar pawale\\Desktop\\Testing Course\\VELOCITY\\chromedriver.exe");	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in/");
		WebElement searchbox = driver.findElement(By.xpath("//*[@title='Search']"));
		//searchbox.sendKeys("ind");                //Normal send  Keys method 
		Actions act = new Actions(driver);
		act.sendKeys(searchbox, "ind").perform();   // Send Keys with action class
		Thread.sleep(2000);
		
		act.sendKeys(searchbox, Keys.ARROW_DOWN)
		.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		

	}

}
