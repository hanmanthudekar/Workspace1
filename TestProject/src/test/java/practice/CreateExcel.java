package practice;
import org.apache.poi.xssf.usermodel.XSSFRow;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcel {

	private static final String XSSFRow = null;
	public void a1() throws IOException {
		XSSFWorkbook wb= new XSSFWorkbook();
		XSSFSheet sheet =wb.createSheet("Hanmant");
		int sr[]= {1,2,3,4,5,6,7,8,9,10};
		String name[]= {"Tushar","Hanmant","Mayur","Shubham","Amit","Ajay","Nagesh","Ganesh","Pratik","Prathmesh"};
		int age[]= {24,23,21,23,24,25,22,23,21,12};

		int rows=sr.length;
		int cell=3;
		XSSFRow r;
		XSSFCell c;
		r = sheet.createRow(0);
		XSSFCell cell0 = r.createCell(0);
		XSSFCell cell1 = r.createCell(1);
		XSSFCell cell2 = r.createCell(2);
		
		for(int i=0;i<rows;i++) {
			
			r=sheet.createRow(i);
			for(int j=0;j<3;j++) {
				
				c=r.createCell(j);
				
				if(c.getColumnIndex()==0) {
					c.setCellValue(sr[i]);
				}
				else if (c.getColumnIndex()==1){
					c.setCellValue(name[i]);
				}
				else if(c.getColumnIndex()==2) {
					c.setCellValue(age[i]);
				}
			}
		}
		String path = "C:\\velocityTraining\\setups\\Excel_Sheets\\Hanmant.xlsx";
		FileOutputStream file = new FileOutputStream(path);
		wb.write(file);
		wb.close();
		System.out.println("File created succesfully.....");
	} 
	public static void main(String [] args) throws IOException {
		CreateExcel s = new CreateExcel();
		s.a1();
	}
}
