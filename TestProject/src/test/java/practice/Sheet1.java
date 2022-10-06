package practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Sheet1 {
	String path="C:\\Setups\\setups\\Excel_Sheets\\Sheet1.xlsx";
	
	public void sheet1() throws EncryptedDocumentException, IOException {
		System.out.println("<-<--------Firrst output--------->->");
		FileInputStream file=new FileInputStream(path);
		Sheet o = WorkbookFactory.create(file).getSheet("Sheet1");
		
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(o.getRow(i).getCell(j)+"\t");
			}
			System.out.println();
		}
		
	}
	public void sheet2() throws EncryptedDocumentException, IOException {
		System.out.println("<-<--------Second output--------->->");
		FileInputStream file=new FileInputStream(path);
		Sheet o2 = WorkbookFactory.create(file).getSheet("Sheet1");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(o2.getRow(j).getCell(i)+"\t");
			}
			System.out.println("");
		}
	}
	public void sheet3() throws EncryptedDocumentException, IOException {
		System.out.println("<-<--------Third output--------->->");
		FileInputStream file=new FileInputStream(path);
		Sheet o3 = WorkbookFactory.create(file).getSheet("Sheet1");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.println(o3.getRow(i).getCell(j)+"\t");
			}
		}
	}
	public void Sheet4() throws EncryptedDocumentException, IOException {
		System.out.println("<-<--------Fourth output---------->>");
		FileInputStream file=new FileInputStream(path);
		Sheet o2 = WorkbookFactory.create(file).getSheet("Sheet1");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				System.out.print(o2.getRow(i).getCell(j)+" ");
			}
		}
	
	}
	public static void main(String [] args) throws EncryptedDocumentException, IOException {
		Sheet1 a = new Sheet1();
		a.sheet1();
		a.sheet2();
		a.sheet3();
		a.Sheet4();
	}
}
