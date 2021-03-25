package day24;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.util.PDFTextStripper;


public class ReadDataFromPdf {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis=new FileInputStream("C:\\DemoFile\\r.pdf");//open file in inputstream mode
		PDFParser parser=new PDFParser(fis);//parse the file
		parser.parse();//method from pdfparser class to convert file into readable format
		
		PDFTextStripper str=new PDFTextStripper();
		String data=str.getText(parser.getPDDocument());//read the text from pdf file
		
		System.out.println(data);
	}

}
