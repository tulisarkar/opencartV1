package day6;

public class ReverseaString {

	public static void main(String[] args) {
		String str="ABCD";
		String rev="";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
			
		}
		System.out.println("The reverse String is: "+rev);
		
		//check palindrome or not
		if(str.equals(rev))
		{
			System.out.println("palindrome string");
		}
		else
		{
			System.out.println("not a palindrome string");
		}
	}

}
