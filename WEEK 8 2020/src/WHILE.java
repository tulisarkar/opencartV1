import java.util.Scanner;

public class WHILE {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int i=10;
		//while (i>=0) {
			//System.out.println(i);
			//i--;
		
		
		  //int i=12345;
		//while ( i !=0)
		//{
		//int d=i%10;
		//i=i/10;
		//System.out.println(d);
		
		//Scanner sc=new Scanner(System.in);
		//System.out.println("Enter a number");
		//int r=sc.nextInt();
		//while ( r !=0)
			{
			//int d=r%10;
			//r=r/10;
			//System.out.println(d);
		
		
		
		/*int i=10;
		do {
			System.out.println(i);
			i--;
		}
		while(i>0);
		
	*/}
			int a =0; int r=0; int sum=0;
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter a number");
			 a=sc.nextInt();
			 while (a>0) 
			 {
				r= a % 10;
				 sum=sum+r;
				 a=a/10;
				 
			 }
			 System.out.println("Sum of the digits"+sum);
			 
		}
}
		
		
		
		

	


