
public class stringpactise {

	public static void main(String[] args) {
		String s=" Welcome to selenium java training";
		String[]words=s.split("\\s");
		System.out.println("The reverse order");
		System.out.println("*******************");
		for(int i=words.length-1;i>=0;i--)
		{
			System.out.println(words[i]);
		}
		
	}
	}


