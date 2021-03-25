package day5;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		//declare an array
		//Approach1
		int a[][]=new int[3][2];
		//int[][]a=new int [3][2];
		//int []a[]=new int [3][2];
		a[0][0]=100;
		a[0][1]=200;
		a[1][0]=300;
		a[1][1]=400;
		a[2][0]=500;
		a[2][1]=600;
		//approach2
		int b[][]= {{100,200},{300,400},{500,600}};
		//find size of array
		System.out.println("No. of rows" +b.length);
		System.out.println("No. of cols" +b[0].length);
		//read single value
		System.out.println(b[2][1]);
		//read all the data from two dimensional array
		//for(int r=0;r<3;r++)
		//{
			//for(int c=0;c<2;c++)
			//{
				//System.out.println(a[r][c]);
			//}
			for(int r=0;r<a.length;r++)
			{
				for(int c=0;c<a[r].length;c++)
				{
					System.out.print(a[r][c]+" ");
				}
				System.out.println();
	//enhanced for loop
				
				for(int x[]:a)
				{
					for(int val:x)
					{
						System.out.print(val);
					}
					System.out.println();
				}
				
		}
	}

}
