package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\VELOCITY/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		FluentWait <WebDriver> wait= new FluentWait<WebDriver>(driver)
				.withTimeout(50,TimeUnit.SECONDS)
				.pollingEvery(10,TimeUnit.MILLISECONDS);
		WebElement alertEnableButton =driver.findElement(By.xpath("//*[@id='alert']"));
		alertEnableButton.click();
		wait.until(ExpectedConditions.alertIsPresent());
		driver.switchTo().alert().accept();
	}

}