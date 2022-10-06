package excelConfig;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ConfigClass {

	XSSFSheet sheet1;
	XSSFWorkbook wb;

	public ConfigClass(String excelPath) {

		try {
			File src = new File (excelPath);

			FileInputStream fis = new FileInputStream(src);

			wb = new XSSFWorkbook(fis);

			sheet1 = wb.getSheetAt(0);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public String getData(int sheetNumber,int rowNum ,int cellNum) {
		String data = sheet1.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return data ;
	}
}
