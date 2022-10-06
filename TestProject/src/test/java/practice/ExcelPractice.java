package practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class ExcelPractice {

	@Test
	public void sheet1() throws Exception {
		
		File src = new File("C:\\Setups\\setups\\Excel_Sheets\\Sheet1.xlsx");
		
		FileInputStream fis = new FileInputStream(src);
		
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		
		XSSFSheet sh1 = wb.getSheetAt(0);
		
		String data = sh1.getRow(0).getCell(0).getStringCellValue();
		
		System.out.println(data);
		
		
	}
}
