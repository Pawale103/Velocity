package dataprovider;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class dataProviderClass {
	@DataProvider(name="testdata")
	public static String[][] dpTest() throws IOException 
	{
		String path=System.getProperty("user.dir")+"\\testdata.xlsx";
		File file= new File(path);
		
		FileInputStream fis=new FileInputStream(file);
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		XSSFSheet sheet= wb.getSheetAt(0);
		int row=sheet.getLastRowNum();
		System.out.println("Row count is:"+row);
		int column=sheet.getRow(1).getLastCellNum();
		System.out.println("Column count is:"+column);
		String data[][]= new String[row][column];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<column;j++)
			{
				data[i-1][j]=sheet.getRow(i).getCell(j).getStringCellValue();
			}
		}
		return data;
		
		
	}

}
