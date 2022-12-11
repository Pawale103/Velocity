package selenium1;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelWriter {
	
	public void writeData() throws IOException
	{
		File file= new File("C:\\Users\\91738\\Desktop\\Test_Data_01.xlsx");	
		FileInputStream fis= new FileInputStream(file);	
		XSSFWorkbook wb= new XSSFWorkbook(fis);		
		XSSFSheet sh1=wb.getSheet("Test_Sheet_01");	
		
		File fout= new File("C:\\Users\\91738\\Desktop\\Test_Data_01.xlsx");
		
		FileOutputStream fos= new FileOutputStream(fout);
		sh1.getRow(5).getCell(1).setCellValue("write operations");//existing row  and column data update
		sh1.getRow(6).createCell(12).setCellValue("Newly created Cell");//it will create the Column and write the data
		sh1.createRow(25).createCell(12).setCellValue("Newly created row and column");// it will create the non existing row and column and then write the data.
		sh1.createRow(26).createCell(12).setCellValue("12345435");
		wb.write(fos);
	}

	public static void main(String[] args) throws IOException{
		ExcelWriter wr= new ExcelWriter();
		wr.writeData();
		

	}

}
