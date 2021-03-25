import java.util.Scanner;

public class busyqascan {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int grade;
		System.out.println("Enter your grade");
		grade=scan.nextInt();
		if(grade<=50)
		{
			System.out.println("Failure");
		}
		else if (grade<=65)
			
		{
			System.out.println("Average");
		}
		else 
		{
			System.out.println("Excellent");
		}

	}

}
