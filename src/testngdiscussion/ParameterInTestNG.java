package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterInTestNG {
	public static WebDriver driver;
	@Parameters("browser")
	@Test
	public void lunchBrowser(String name)
	{
		if(name.equalsIgnoreCase("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\sudhakar pawale\\\\Desktop\\\\Testing Course\\\\VELOCITY\\\\chromedriver.exe");
			driver= new ChromeDriver();
			System.out.println("lauching chrome browser");
		}
		else if(name.equalsIgnoreCase("Edge"))
		{
			System.out.println("lunching Edge browser");
			
		}
		else if(name.equalsIgnoreCase("Firefox"))
		{
			System.out.println("luncning Firefox browser");
		}
	}
	@Parameters({"Environment","Build"})
	@Test
	public void environmentDetails(String Env, String build)
	{
		System.out.println("Env details: "+Env);
		System.out.println("Build NO: "+build);
		
	}

}
