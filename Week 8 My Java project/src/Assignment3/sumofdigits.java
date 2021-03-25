package Assignment3;

public class sumofdigits {

	public static void main(String[] args) {
		int x =3456;
	
		int y=x%10;
		int s=x/10;
		int z=s%10;
		int t=s/10;
		
		int a =t%10;
		int u=t/10;
		int b= u%10;
		int sum= y+z+a+b;
		
		System.out.println(y);
		System.out.println(z);
		System.out.println(a);
		System.out.println(b);
		System.out.println("the sum of digits is" +sum);

	}

}
