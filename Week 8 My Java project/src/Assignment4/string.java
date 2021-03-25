package Assignment4;

public class string {

	public static void main(String[] args) {
		 String s=" Welcome to selenium java training";
		String slower = s.toLowerCase();
		String upper=s.toUpperCase();
		String arr[]=s.split(" ");
		int a = arr.length-1;
		for (int i=arr.length-1;i>=0;i--) {
			System.out.println( arr[i]);
		}
		
		System.out.println( slower);
		System.out.println( upper);
		System.out.println( s.contains("selenium"));
		System.out.println( a);
	}

}
