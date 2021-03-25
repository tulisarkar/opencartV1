package Assignment2;

import java.util.Scanner;

public class negativepositive {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a number");
		
	    int a = s.nextInt();
	    
	    if (a>0) {
	    	System.out.println("It is a positive number");
	    }
	    else if (a<0) {
	    	System.out.println("It is a negative number");	
	    }
	    else {
	    	System.out.println("It is zero");
	    }
	}

}
