package Assignment1;

import java.util.Scanner;

public class sumuserinput {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		Scanner s1=new Scanner (System.in);
		System.out.println("Enter two integers");
		
		int a= s.nextInt();
		int b= s1.nextInt();
		int sum=a+b;
		System.out.println("The sum of two numbers is " +sum);
		
		
	}

}
