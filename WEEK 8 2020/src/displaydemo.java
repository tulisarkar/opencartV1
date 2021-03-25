import java.util.Scanner;

public class displaydemo {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);
	double BS;
	double DA;
	double HRA;
	double Tax;
	double GrossIncome;
	System.out.println("What is your basic salary?");
		 BS = scan.nextDouble();
		 DA=.10*BS;
		 HRA=.05*BS;
		 Tax=.13*BS;
		 GrossIncome=(BS+DA+HRA+Tax);
		 System.out.println("Basic Salary of Employee is $ "+BS);
		 System.out.println("DA is $" +DA);
		 System.out.println("HRA is $" +HRA);
		 System.out.println("Tax is $" +Tax);
		 System.out.println("Gross Salary of Employee is $ "+GrossIncome);
		 
		 
	}
}
