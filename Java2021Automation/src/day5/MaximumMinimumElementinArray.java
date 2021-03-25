package day5;

public class MaximumMinimumElementinArray {

	public static void main(String[] args) {
		//maximum number
		int a[]= {20,10,5,40,7};
		int max=a[0];
		for(int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
				}
		System.out.println("The maximum number in array is "+max);
		//***************************************************************
		//minimum number
		int b[]= {90,100,200,5,1};
		int min=b[0];
		for(int i=1;i<b.length;i++)
		{
			if(b[i]<min)
			{
				min=b[i];
			}
		}
		System.out.println("The minimum number in array is "+min);
	}

}
