package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\VELOCITY/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(2000);	
		WebElement iframe=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);           //switching to  frame
		
		WebElement draggable=driver.findElement(By.xpath("//*[@id='draggable']"));
		WebElement dropable =driver.findElement(By.xpath("//*[@id='droppable']"));
		
		Actions act = new Actions(driver);
		act.dragAndDrop(draggable, dropable).build().perform();        //1st typ		
	   //act.clickAndHold(draggable).moveToElement(dropable).build().perform();
		driver.switchTo().parentFrame();
		
		WebElement slider=driver.findElement(By.xpath("//*[text()='Slider']"));
		slider.click();
		
		
		
		
		
	}

}
