package day11;

import java.util.Scanner;

public class HandleException {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();//to input integer or number from user
		
		try
		{
		System.out.println(100/num);
		}
		catch(ArithmeticException e)
		{
			System.out.println("Invalid input provided");
		}
		System.out.println("program is completed");
		System.out.println("program is exited");
	}

}
