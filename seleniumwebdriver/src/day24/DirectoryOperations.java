package day24;

import java.io.File;

public class DirectoryOperations {

	public static void main(String[] args) {
		
		//create new directory
		
		File mydir=new File("C:\\DemoFile\\mydir");
		if(mydir.mkdir())
		{
			System.out.println("directory created");
		}
		else
		{
			System.out.println("directory not created");
		}
		
//rename directory
		File old_dir=new File("C:\\DemoFile\\mydir");
		File new_dir=new File("C:\\DemoFile\\mydir123");
		if(old_dir.renameTo(new_dir))
		{
			System.out.println("Directory name changed");
		}
		else
		{
			System.out.println("Name not changed");
		}
		//delete a directory
		File dir=new File("C:\\DemoFile\\mydir123");
		if(dir.delete())
		{
			System.out.println("Directory deleted");
		}
		else
		{
			System.out.println("Directory not deleted");
		}
		
		//getting current directory
	String loc=	System.getProperty("user.dir");
	System.out.println("Current directory is"+ loc);
		
	}

}
