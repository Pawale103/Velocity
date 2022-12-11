package utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {
	
	public static void captureScreenshot(WebDriver driver,String filename) throws IOException
	{
        
		TakesScreenshot scrshot=(TakesScreenshot)driver;
		File source = scrshot.getScreenshotAs(OutputType.FILE);
		String path=System.getProperty("user.dir")+"\\Scrshot\\"+filename+".png";
		//File destination= new File("C:\\Users\\91738\\eclipse-workspace\\Velocity1\\Scrshot"+filename+".jpg");
		File destination= new File(path);		
		FileHandler.copy(source, destination);
	}

}
