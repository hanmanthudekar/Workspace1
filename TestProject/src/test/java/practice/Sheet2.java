package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sheet2 {
	String Path="C:\\velocityTraining\\setups\\Excel_Sheets\\Sheet2.xlsx";
	public void output1() throws EncryptedDocumentException, IOException {
		FileInputStream file = new FileInputStream(Path);
		Sheet o = WorkbookFactory.create(file).getSheet("Sheet1");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(o.getRow(i).getCell(j)+"\t");
			}
			System.out.println();
		}
	}
	public static void main(String [] args) throws EncryptedDocumentException, IOException {
		Sheet2 s = new Sheet2();
		s.output1();
	}
}
