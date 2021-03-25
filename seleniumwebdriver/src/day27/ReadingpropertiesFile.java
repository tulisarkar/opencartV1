package day27;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.ResourceBundle;

public class ReadingpropertiesFile {

	public static void main(String[] args) throws IOException {
		//Approach1
		
		//create file object and give the path where file is located
		File f= new File(System.getProperty("user.dir")+ "\\resources\\app.properties");
		FileInputStream fis=new FileInputStream(f);
		
		Properties pro=new Properties();
		pro.load(fis);
		
		String url=pro.getProperty("url");
		String useremail=pro.getProperty("useremail");
		String userpassword=pro.getProperty("userpassword");
		
		System.out.println(url);
		System.out.println(useremail);
		System.out.println(userpassword);
		
		//approach2
		
		/*ResourceBundle rb=ResourceBundle.getBundle("app");
		String url=rb.getString("url");
		String email=rb.getString("useremail");
		String password=rb.getString("userpassword");
		
		System.out.println(url);
		System.out.println(email);
		System.out.println(password);*/
		
		
		
	}

}
