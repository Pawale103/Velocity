package xlOperations;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadFromXL {

	public static void main(String[] args) throws IOException {
		
		
		File file= new File("C:\\Users\\91738\\Desktop\\Test_Data_01.xlsx");
		
		FileInputStream fis= new FileInputStream(file);
		
		XSSFWorkbook wb= new XSSFWorkbook(fis);
		
		XSSFSheet sh1= wb.getSheet("Test_Sheet_01");
		int rowcount = sh1.getLastRowNum();
		int colcount=sh1.getRow(0).getLastCellNum();
		
		//String value=sh1.getRow(0).getCell(1).getStringCellValue();
		//System.out.println(value);
		for(int i=0;i<=rowcount;i++)
		{
			for(int j=0;j<colcount;j++)
			{
				String tableValues = sh1.getRow(i).getCell(j).getStringCellValue();
				System.out.println(tableValues+"");
			}
			//System.out.println();
		}
	}

}
