package day4;

public class JumpingStatements {

	public static void main(String[] args) {
		/*for(int i=1;i<=10;i++)
		{
					
			if(i==5)
			{
				break;
			}
			System.out.println(i);
		}*/
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				continue;
			}
			System.out.println(i);
				
			}
		for(int a=1;a<=10;a++)
		{
			if(a==3||a==5||a==7)
			{
				continue;
			}
			System.out.println(a);
				
		}
	}
}


