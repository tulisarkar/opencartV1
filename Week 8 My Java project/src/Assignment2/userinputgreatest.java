package Assignment2;

import java.util.Scanner;

public class userinputgreatest {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		System.out.println("Enter 3 integers");
		int a=s.nextInt();
		int b= s1.nextInt();
		int c= s2.nextInt();
		if (a>b && a>c) {
			System.out.println("a is the greatest");
		}	
		else if (b>a && b>c) {
			System.out.println("b is the greatest");
		}
		else {
			System.out.println("c is the greatest");
		}
	}

}
