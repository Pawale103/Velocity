package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionSlider {

	    public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\VELOCITY/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/slider/");
		Thread.sleep(2000);	
		WebElement iframe=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);           //switching to  frame
        WebElement sliderBar=driver.findElement(By.xpath("//*[@id='slider']"));
		Actions act = new Actions(driver);
		act.clickAndHold(sliderBar).moveByOffset(100, 0).build().perform();
	
	}
	
}
