package day8;

public class StringEquals {

	public static void main(String[] args) {
		//String s1="welcome";
		//String s2="welcome";
		
		String s1=new String("welcome");
		//String s2=new String("welcome");
		String s2=s1;
		System.out.println(s1==s2);
		System.out.println(s1.contentEquals(s2));
	}

}
