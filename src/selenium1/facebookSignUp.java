package selenium1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class facebookSignUp {
	
	public static void main(String[]args)
	{
		
        System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sudhakar pawale\\\\Desktop\\\\Testing Course\\\\VELOCITY\\\\chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/r.php");
		WebElement day=driver.findElement(By.xpath("//*[@id='day']"));		
		Select sel = new Select(day);
		sel.selectByVisibleText("30");
		WebElement month=driver.findElement(By.xpath("//*[@id='month']"));	
		Select sel2 = new Select(month);
		sel2.selectByIndex(5);
		driver.findElement(By.name("firstname")).sendKeys("firstname123");
		driver.findElement(By.name("lastname")).sendKeys("lastname123");
		driver.findElement(By.xpath("//*[@name='reg_email__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[text()='Male']")).click();
		driver.findElement(By.xpath("//*[@name='reg_email_confirmation__']")).sendKeys("abc@gmail.com");
		driver.findElement(By.xpath("//*[@name='reg_passwd__']")).sendKeys("Pass234@");
		
		
		//get options method   it returns list of WebElements 
		
		Select sel3 = new Select(month);
		List<WebElement> op=sel3.getOptions();
		System.out.println(op);
		
		String a[]= {"a","b"};
		
		if(op.contains(a))
		{
			
		}
		
	
	}
		
	}


