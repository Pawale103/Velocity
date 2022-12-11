package waits;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaits {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\VELOCITY/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);// url should load in 20 seconds if not it will throw exception.
		driver.get("https://groww.in/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement loginOrRegisterButton = driver.findElement(By.xpath("//div[@class='btn51Btn btn51RipplePrimary btn51Primary' and @style='width: 175px; height: 45px; font-size: 16px;']"));
		loginOrRegisterButton.click();
		
		WebElement emailField = driver.findElement(By.xpath("//*[@id='login_email1']"));
		emailField.sendKeys("abc@gmail.com");
		WebElement continueButton = driver.findElement(By.xpath("//span[@class='absolute-center']//*[text()='Continue']"));
		continueButton.click();		
		WebElement passwordField = driver.findElement(By.xpath("//*[@id='login_password1']"));
		passwordField.sendKeys("abc@123");
	}

}
