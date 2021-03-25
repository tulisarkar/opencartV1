package day5;

import java.util.Arrays;
import java.util.Collections;

public class SortElementinArray {

	public static void main(String[] args) {
		//Approach 1
		int a[]= {30,50,68,10,40};
		System.out.println("Before Sorting" + Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("After Sorting" + Arrays.toString(a));
		
		//Approach 2
		
		int b[]= {30,50,68,10,40};
		System.out.println("Before Sorting" + Arrays.toString(b));
		Arrays.sort(b);
		System.out.println("After Sorting" + Arrays.toString(b));
		
		//Approach 3 in reverse or descending order
	Integer c[]= {30,50,68,10,40};
	System.out.println("Before Sorting" + Arrays.toString(c));
	Arrays.sort(c,Collections.reverseOrder());
	System.out.println("After Sorting" + Arrays.toString(c));
		
		
		

	}

}
