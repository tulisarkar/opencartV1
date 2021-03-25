package day5;

public class EvenandOddInArray {

	public static void main(String[] args) {
		//classic for loop
		int a[]= {1,2,3,4,5,6};
		System.out.println("The even numbers are");
		for(int i=0;i<a.length;i++ )
		{
			if(a[i]%2==0)
			{
			System.out.println(a[i]);
			}
		}
			System.out.println("The odd numbers are");	
			for(int i=0;i<a.length;i++)
			{
				if(a[i]%2!=0)
				{
					System.out.println(a[i]);	
				}
//************************************************************************************
	// for each loop
				int b[]	= {5,6,7,8,9};
				System.out.println("The even numbers are");
				for(int num:b)
				{
					if(num%2==0)
					System.out.println(num);
				}
				System.out.println("The odd numbers are");
					for(int val:b)	
					{
						if(val%2!=0)
							System.out.println(val);	
						}
				}
	}
}
