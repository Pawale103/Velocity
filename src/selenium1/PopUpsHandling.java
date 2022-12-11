package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PopUpsHandling {

	public static void main(String[] args) throws InterruptedException {
		    System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\VELOCITY/chromedriver.exe");	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
			Thread.sleep(2000);
			WebElement doubleclickbutton = driver.findElement(By.xpath("//*[@id='double-click']"));
			Actions act =new Actions(driver);
			act.doubleClick(doubleclickbutton).perform();//double click
			String alertText = driver.switchTo().alert().getText();
			System.out.println(alertText);
			driver.switchTo().alert().accept();	         //alert handling
		   // act.contextClick(doubleclickbutton);      //right click 
	        WebElement fileUpload = driver.findElement(By.xpath("//*[@name='upload']"));
	
	        fileUpload.sendKeys("C:\\Users\\91738\\Desktop\\123.txt");//file upload
	        
	        WebElement sunMenu = driver.findElement(By.xpath("//*[@id='sub-menu']"));
	        act.moveToElement(sunMenu).perform();
	        Thread.sleep(2000);
	        WebElement googleLink = driver.findElement(By.xpath("//a[@href='https://google.com']"));
	        //act.click(googleLink).build().perform();
	        googleLink.click();
	        
	         
	        
	}

}
