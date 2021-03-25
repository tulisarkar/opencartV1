package day24;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WriteDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileOutputStream fs=new FileOutputStream("C:\\DemoFile\\practice.xlsx");//it will create a new file if file is not there.will not give any error
		
		//create a workbook
		XSSFWorkbook workbook=new XSSFWorkbook();
		
		//create sheet
		XSSFSheet sheet=workbook.createSheet("Data");
		
		for(int r=0;r<=5;r++)
		{
			XSSFRow row=sheet.createRow(r);//creates row in a particular sheet
			for(int c=0;c<3;c++)//represents cells
			{
				XSSFCell cell=row.createCell(c);
				cell.setCellValue("Welcome");
			}
		}
		workbook.write(fs);
		workbook.close();
		fs.close();
	}

}
