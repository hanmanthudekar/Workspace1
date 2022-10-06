package dataDrivenTestingPractice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

public class ExcelSheetHandeling {

	@Test
	public void handel() throws EncryptedDocumentException, IOException {
		
		FileInputStream file = new FileInputStream("C:\\Setups\\setups\\Excel_Sheets\\Book2.xlsx");	
		Sheet o = WorkbookFactory.create(file).getSheet("Sheet1");
		System.out.println(o.getRow(0).getCell(0));

	}
}
