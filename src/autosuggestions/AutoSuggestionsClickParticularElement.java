package autosuggestions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutoSuggestionsClickParticularElement {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sudhakar pawale\\Desktop\\Testing Course\\VELOCITY\\chromedriver.exe");	
			WebDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.google.co.in/");
			WebElement searchbox = driver.findElement(By.xpath("//*[@title='Search']"));
			//searchbox.sendKeys("ind");                //Normal send  Keys method 
			Actions act = new Actions(driver);
			act.sendKeys(searchbox, "india").perform();   // Send Keys with action class
			Thread.sleep(4000);
			//WebElement indvspak=driver.findElement(By.xpath("//*[text()='ia vs pakistan']"));
			List<WebElement> autoSuggestList = driver.findElements(By.xpath("//*[@role='listbox']"));
			
			for(WebElement listElement:autoSuggestList)
			{
				String text = listElement.getText();
				if(text.contains("india"))
				{
					try
					{
						listElement.click();
					}
					catch(Exception e)
					{
						listElement.click();
					}
				}
			
			}
			

	}

}
