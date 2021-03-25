package day11;

import java.util.Scanner;

public class MultipleCatchBlocks {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a Number");
		//int num=sc.nextInt();//to input integer or number from user
		
		try
		{
		//System.out.println(100/num);
			String s="abc";
			int num=Integer.parseInt(s);
		}
		/*catch(ArithmeticException e)
		{
			System.out.println("Invalid input provided. Got ArithmeticException ");
		}
		catch(NullPointerException e)
		{
			System.out.println("Invalid input provided. Got NullPointerException");
		}
		catch(NumberFormatException e)
		{
			System.out.println("Invalid input provided. Got NumberFormatException");
		}*/
		catch(Exception e)
		{
			System.out.println("Invalid input provided");
			System.out.println(e.getMessage());
			System.out.println(e.printStackTrace());//prints exception details
			
		}
		System.out.println("program is completed");
		System.out.println("program is exited");
	}

	}


