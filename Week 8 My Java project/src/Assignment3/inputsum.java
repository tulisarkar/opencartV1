package Assignment3;

import java.util.Scanner;

public class inputsum {

	public static void main(String[] args) {
		int x =0;
		Scanner sc= new Scanner (System.in);
		System.out.println("Enter a number");
		x=sc.nextInt();
		
		int y=x%10;
		int s=x/10;
		int z=s%10;
		int t=s/10;
		
		int a =t%10;
		int u=t/10;
		int b= u%10;
		int sum= y+z+a+b;
		
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println("the sum of digits is" +sum);
		


	}

}
