package day6;

public class SwappingTwoStrings {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="World";
		System.out.println("Before Swapping");
		System.out.println(s1);
		System.out.println(s2);
		s1=s1.concat(s2);//HelloWorld
		s2=s1.substring(0, 5);
		s1=s1.substring(5);
		System.out.println("After Swapping");
		System.out.println(s1);
		System.out.println(s2);
		
	}

}
