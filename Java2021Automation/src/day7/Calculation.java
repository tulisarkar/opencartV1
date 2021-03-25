package day7;

public class Calculation {

	int x,y;
	/*//no parameter, no value
	//void add()
	//{
	//System.out.println(x+y);	
	//}
	//no parameter returns value
	int add()
	{
		return x+y;
	}
	//take parameters no return value
	
	void add(int a,int b)
	{
		System.out.println(a+b);
	}*/
	int add(int a,int b) {
		x=a;
		y=b;
		return(x+y);
		
	}
	//take parameter returns value
	
	
	
	
	public static void main(String[] args) {
		
Calculation cal=new Calculation();
/*cal.x=100;
cal.y=200;
cal.add();
System.out.println(cal.add());
cal.add(100, 200);*/
System.out.println(cal.add(100, 200));

	}

}
