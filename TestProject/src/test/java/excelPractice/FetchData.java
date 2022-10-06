package excelPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class FetchData {

	public static void main(String[] args) throws Exception {

		File src = new File("C:\\Setups\\setups\\Excel_Sheets\\LoginData.xlsx");

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheetAt(0);

		int rowNum = sh1.getLastRowNum();

		System.out.println("Count of test Data is "+(rowNum+1));

		System.out.println("Login data is ");
		for(int i=0;i<rowNum;i++) {
				String userName = sh1.getRow(i).getCell(0).getStringCellValue();
				String password = sh1.getRow(i).getCell(1).getStringCellValue();
				System.out.println(userName+"\t"+password);
		}
	}
}
