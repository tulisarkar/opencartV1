package day6;

public class Assignment {

	public static void main(String[] args) {
		//to compare two strings, ignoring case differences.
		String s1="Welcome";
		String s2="welcome";
		System.out.println(s1.equalsIgnoreCase(s2));
		
		//concatenate a given string to the end of another string.
		String a1="Welcome";
		String a2="to Selenium";
		System.out.println(a1.concat(" "+ a2));
		
		//program to get the length of a given string
		System.out.println(s1.length());
		
		//to get a substring of a given string between two specified positions
		System.out.println(s1.substring(0, 3));
		
		//convert all the characters in a string to uppercase.
		System.out.println(s2.toUpperCase());
		//convert all the characters in a string to lowercase.
		System.out.println(s1.toLowerCase());
	}

}
