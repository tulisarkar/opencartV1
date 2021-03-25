package day24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("C:\\DemoFile\\sample.xlsx");//opens the file
		
		//extract workbook from file
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
				
		//extract sheet from workbook
		XSSFSheet sheet=workbook.getSheet("Sheet1");
		
		
		int rows=sheet.getLastRowNum();//returns number of rows from the sheet
		int cols=sheet.getRow(1).getLastCellNum();//first specify row number which returns row object and then returns number of columns/cells from the sheet.
		
		System.out.println("Number of rows" +rows);
		System.out.println("Number of columns:" +cols);
		
		for(int r=0;r<=rows;r++)
		{
			//read each and every row
			XSSFRow row=sheet.getRow(r);//create row object to extract the particular row from the sheet
			for(int c=0;c<cols;c++) 
			{
				XSSFCell cell=row.getCell(c);//get cell object
				System.out.print(cell.toString()+"    ");//extract value from the cell
			System.out.println();
			fis.close();
			workbook.close();
			
		}
			
			
		
	
	}

}
