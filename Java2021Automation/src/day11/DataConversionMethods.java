package day11;

public class DataConversionMethods {

	public static void main(String[] args) {
		//String to Integer
		/*String s="1234";
		System.out.println(s.getClass().getName());
		Integer num=Integer.parseInt(s);
		System.out.println(num.getClass().getName());*/
		
		//integer to string
		int num=101;
		String s=String.valueOf(num);
		System.out.println(s.getClass().getName());
		
		//String to decimal
		
		String s1="150.5";
		Double d=Double.parseDouble(s1);
		System.out.println(s1.getClass().getName());
		
		//double to string
		
		double number=123.456;
		String s2=String.valueOf(num);
		System.out.println(s2.getClass().getName());
		
		
		
				
		
	}

}
