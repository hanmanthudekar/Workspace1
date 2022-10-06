package practice;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class CreateExcelSheet {
	public void create() throws IOException {
		XSSFWorkbook s=new XSSFWorkbook();
		XSSFSheet sheet=s.createSheet("Velocity");
		int[] sr=new int[10];
		sr[0]=1;
		sr[1]=2;
		sr[2]=3;
		sr[3]=4;
		sr[4]=5;
		sr[5]=6;
		sr[6]=7;
		sr[7]=8;
		sr[8]=9;
		sr[9]=10;	
		String name[]=new String[10];
		name[0]="Hanmant";
		name[1]="Mayur";
		name[2]="Amit";
		name[3]="Ajay";
		name[4]="Nagesh";
		name[5]="Prathmesh";
		name[6]="Pratik";
		name[7]="Ganesh";
		name[8]="Nilesh";
		name[9]="Tushar";


		int rows = sr.length;
		int cells=2;
		XSSFRow r;
		XSSFCell c;
		r = sheet.createRow(0);
		XSSFCell cell0 = r.createCell(0);
		XSSFCell cell1 = r.createCell(1);

		for(int i=0;i<rows;i++) {
			r = sheet.createRow(i+1);
			for(int j=0;j<cells;j++) {			
				c = r.createCell(j);
				if(c.getColumnIndex()==0) {
					c.setCellValue(sr[i]);
				}
				else if(c.getColumnIndex()==1) {
					c.setCellValue(name[i]);
				}

			}
		}
		String path = "C:\\velocityTraining\\setups\\Excel_Sheets\\H.xlsx";
		FileOutputStream file=new FileOutputStream(path);
		s.write(file);
		s.close();
		System.out.println("File created succesfully.....");

	}
	public static void main(String [] args) throws IOException {
		CreateExcelSheet a = new CreateExcelSheet();
		a.create();
	}
}
