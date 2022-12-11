package xlOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLoginCredFromXL {

	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\91738\\Downloads\\VELOCITY/chromedriver.exe");		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		File file = new File("C:\\Users\\91738\\Desktop\\Test_Data_01.xlsx");		
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sh1 = wb.getSheet("Test_Sheet_01");
		String username=sh1.getRow(0).getCell(0).getStringCellValue();		
		String password=sh1.getRow(0).getCell(1).getStringCellValue();				
		driver.findElement(By.xpath("//*[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//*[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//*[text()=' Login ']")).click();
		

	}

}
