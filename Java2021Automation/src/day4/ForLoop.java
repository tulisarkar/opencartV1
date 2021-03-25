package day4;

public class ForLoop {

	public static void main(String[] args) {
		//printing 1 to 10
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
//print even numbers
		for(int a=2;a<=10;a+=2)
		{
			System.out.println(a);
		}
	//print odd numbers	
		for(int b=1;b<=10;b+=2)
		{
			System.out.println(b);
		}
		//descending order
		for(int y=10;y>=1;y--)
		{
			System.out.println(y);
		}
		//print welcome 10 times
		String s="welcome";
		for(int d=1;d<=10;d++)
		{
			System.out.println(s);
		}
	}

}
