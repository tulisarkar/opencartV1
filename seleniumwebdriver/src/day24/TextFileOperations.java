package day24;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextFileOperations {

	public static void main(String[] args) throws IOException {
		//create a new file
		File myfile=new File("C:\\DemoFile\\practice.txt");
		if(myfile.createNewFile())
		{
			System.out.println("File is created");
		}
		else
		{
			System.out.println("File already exists");
		}
//write in a file
		
		FileWriter writer=new FileWriter("C:\\DemoFile\\practice.txt");
		writer.write(" This is my practice file.");
		writer.write(" This is automation online class.");
		writer.write(" This is my java project.");
		writer.write(" This is my selenium project.");
		System.out.println("Data is written into file");
		writer.close();
		
		//read the file
		
		FileReader reader=new FileReader("C:\\DemoFile\\practice.txt");
		Scanner myscanner=new Scanner(reader);
		while(myscanner.hasNextLine())
		{
			String data=myscanner.nextLine();
			System.out.println(data);
		}
		myscanner.close();
		reader.close();
		
	//rename a file
	File old_file=new File("C:\\DemoFile\\practice.txt");
	File new_file=new File("C:\\DemoFile\\practice123.txt");
	boolean value=old_file.renameTo(new_file);
	
	if(value)
	{
		System.out.println("The file is renamed");
	}
	else
	{
		System.out.println("File is not renamed");
	}
	
	File f=new File("C:\\DemoFile\\practice123.txt");
	boolean v=f.delete();
	 if(v)
	 {
		System.out.println("The file is deleted"+f.getName()); 
	 }
	 else
	 {
		 System.out.println("File cannot be deleted");
	 }
}
}


