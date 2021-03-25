package day4;

public class ReverseNumber {

	public static void main(String[] args) {
		int a=1234;
		int rev=0;
		System.out.println("The number is "+a);
		while(a!=0)
		{
			rev=rev*10+a%10;
			a=a/10;
		}
		System.out.println("The reverse number is "+rev);
	}

}
