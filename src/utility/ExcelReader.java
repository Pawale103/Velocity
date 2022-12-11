package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {
	
	
	public static String ReadData(int row,int col) throws IOException
	{
		File file= new File("C:\\Users\\91738\\Desktop\\Test_Data_01.xlsx");	
		FileInputStream fis= new FileInputStream(file);	
		XSSFWorkbook wb= new XSSFWorkbook(fis);		
		XSSFSheet sh1=wb.getSheet("Test_Sheet_01");	
		DataFormatter df= new DataFormatter();
		String formattedData=df.formatCellValue(sh1.getRow(row).getCell(col));
		return formattedData;
		
	}

}
