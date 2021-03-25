package day11;

import java.util.Scanner;

public class TryClassFinally {

	public static void main(String[] args) {
		System.out.println("program Started...");
		int a[]=new int[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter value");
		int num=sc.nextInt();
		System.out.println("Enter position");
		int pos=sc.nextInt();
		try {
			a[pos]=num;
		}
		catch(Exception e)
		{
			System.out.println("Exception Occured. HAndled..");
					
		}
		finally {
			System.out.println("Enterted into Final block");
		}
	}

}
