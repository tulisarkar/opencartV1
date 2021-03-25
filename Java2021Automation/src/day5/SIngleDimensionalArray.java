package day5;

public class SIngleDimensionalArray {

	public static void main(String[] args) {
		//declare an array
		//Approach1(when we know the size of array)
		int a[]= new int[5];//declaration
		//insert values in array
		a[0]=100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		a[4]=500;
		//Approach2(when we do not know the size of array)
		int b[]= {100,200,300,400,500,100};
		//size of an array
		System.out.println(a.length);//returns length of array
		System.out.println(b.length);
		//read or access a single value from array
		System.out.println(a[4]);
		System.out.println(a[0]);
		//access all values from array
		for(int i=0;i<=4;i++)
		{
			System.out.println(a[i]);
		}
		//if we do not use length of array
		for(int i=0;i<a.length;i++)
		{
			System.out.println("position" +i+"value is"+a[i]);
		}
		//for each loop or enhanced for loop
		for(int x:a)
		{
			System.out.println(x);
		}
		
		}

	}


