package day4;

public class NumberofDigits {

	public static void main(String[] args) {
		int a= 1234;
		int count=0;
		
		while (a>0)
		{
			a=a/10;
			count++;
			
		}
		System.out.println("The number of digits is "+count);
	
		
	}

}
