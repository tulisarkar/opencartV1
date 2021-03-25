import java.util.Scanner;

public class positivenegative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a;
		System.out.println("Enter a number");
		a = sc.nextInt();
		if(a<0)
		{
			System.out.println("Number is negative");
	}
	else if (a>0)
		{
		System.out.println("Number is positive");
		}
		else 
		{
			System.out.println("Number is zero");
			
		}
		
		
		

	}

}
