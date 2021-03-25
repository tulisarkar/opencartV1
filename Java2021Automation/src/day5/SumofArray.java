package day5;

public class SumofArray {

	public static void main(String[] args) {
		//using enhanced for loop
		int a[]= {10,20,30,40,50};
		int sum=0;
		for(int x:a)
		{
			sum=sum+x;
		}
		System.out.println("The sum of numbers in array is "+sum);
//*****************************************************************************************		
		//using classic for loop
		int b[]=new int[3];
		b[0]=10;
		b[1]=20;
		b[2]=30;
		int s=0;
		for(int i=0;i<b.length;i++)
		{
			s=s+b[i];
		}
		System.out.println("The sum of numbers in array is "+s);
	}

}
