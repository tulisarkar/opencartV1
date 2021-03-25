package day6;

public class StringMethods {

	public static void main(String[] args) {
		String s="welcome";
		//System.out.println(s);
		
		// length()-returns length of a string
		System.out.println(s.length());
		
		//concat()-join the strings
		String s1="welcome";
		String s2="to java";
		String s3="automation";
				
		System.out.println(s1+" "+s2+" "+s3);
		System.out.println(s1.concat(" " +s2).concat(" "+s3));
	
	
	//trim()
	 s="   Automation     ";
	System.out.println(s.length());
	System.out.println(s.trim().length());
	
	//charAt()-returns single character based on index provided
	s="welcome";
	System.out.println(s.charAt(3));
	
	//contains()-returns boolean value true or false
	s="Selenium";
	System.out.println(s.contains("Sel"));
	System.out.println(s.contains("wel"));
	
	//equals() equalsIgnoreCase()-compares two strings
	System.out.println(s.equals("selenium"));
	System.out.println(s.equals("Selenium"));
	System.out.println(s.equalsIgnoreCase("selenium"));
	System.out.println(s=="Selenium");
	
	//replace()-replace single or multiple sequence of characters
	s="welcome to selenium automation testing";
	System.out.println(s.replace('e', 'X'));
	System.out.println(s.replace("selenium", "X"));
	s="   welcome";
	System.out.println(s.replace("   ", ""));
	//substring()
	s="Welcome";
	System.out.println(s.substring(0, 3));
	System.out.println(s.substring(3, 7));
	System.out.println(s.substring(1,4));
	//toUpperCase() & toLowerCase()
	s="WelCOMe";
	System.out.println(s.toUpperCase());
	System.out.println(s.toLowerCase());
	

}
}
