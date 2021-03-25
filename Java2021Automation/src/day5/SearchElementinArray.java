package day5;

public class SearchElementinArray {

	public static void main(String[] args) {
		int a[]= {30,10,40,60,70};
		int element=100;
		boolean flag=false;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==element)
			{
				System.out.println("Element Found at "+i);
				flag=true;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}

}
