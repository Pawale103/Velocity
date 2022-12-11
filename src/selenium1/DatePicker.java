package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\VELOCITY/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/datepicker/");
		Thread.sleep(2000);	
		WebElement iframe=driver.findElement(By.xpath("//*[@class='demo-frame']"));
		driver.switchTo().frame(iframe);           //switching to  frame
		
		WebElement datePicker=driver.findElement(By.xpath("//*[@id='datepicker']"));
		datePicker.click();
		String month=driver.findElement(By.xpath("//*[@class='ui-datepicker-title']")).getText();
		//while((month.contains("a"))
		{
			if(month.contains("June"))
			{
				
			}
			else {
				
			}
		}
	}

}
