package day11;

import java.util.Scanner;

public class ExceptionDemo {

	public static void main(String[] args) {
		//System.out.println("Program is started");
		//System.out.println("Program is in progress");
		//Arithmetic Exception
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a Number");
		//int num=sc.nextInt();//to input integer or number from user
		//double num=sc.nextDouble();//to input decimal from user
		//String s=sc.nextLine();// to input string from user
		//System.out.println(100/num);
		
		//ArrayIndex out of boundsException
		/*int a=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		int num=sc.nextInt();
		System.out.println("Enter position");
		int pos=sc.nextInt();
		a[pos]=num;*/
		
		//NumberFormatException
		//String s="123";//throws number format exception if s=abc
		//int num1=Integer.parseInt(s);//converts string to number format
		//double num2=Integer.parseInt(s);//converts string to decimal format
		//System.out.println(num1);
		
		//Nullpointer Exception
		String s=null;//nullpointer exception
		System.out.println(s.length());
		
		
				
		
		
		
		
		System.out.println("program is completed");
		System.out.println("program is exited");
	}

}
