package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\VELOCITY/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		WebDriverWait wait = new WebDriverWait(driver,30);
//		WebElement enableButton = driver.findElement(By.xpath("//*[@id='enable-button']"));
//		enableButton.click();
//		WebElement buttonTobeEnabled = driver.findElement(By.xpath("//*[@id='disable']"));
//		wait.until(ExpectedConditions.elementToBeClickable(buttonTobeEnabled));
//		enableButton.click();
		
//		WebElement checkboxEnableButton=driver.findElement(By.xpath("//*[@id='checkbox']"));
//		checkboxEnableButton.click();
//		wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//*[@type='checkbox']"), true));
//		Thread.sleep(3000);
//		checkboxEnableButton.click();
		
//		WebElement textChangeButton =driver.findElement(By.xpath("//*[@id='populate-text']"));
//		textChangeButton.click();
//		wait.until(ExpectedConditions.textToBe(By.xpath("//*[@id='h2']"), "Selenium Webdriver"));
//		System.out.println("completed");
		
		WebElement alertEnableButton =driver.findElement(By.xpath("//*[@id='alert']"));
		alertEnableButton.click();
		wait.until(ExpectedConditions.alertIsPresent());
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		
		
		
	}

}
