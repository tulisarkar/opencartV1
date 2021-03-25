package day8;

public class ThisExample {

	
		int x,y;
		void getData(int x,int y)
		{
		this.x=x;
		this.y=y;
		}
		void display()
		{
			System.out.println(x);
			System.out.println(y);
		}
		public static void main(String[] args) {
			
			ThisExample th=new ThisExample();
			th.getData(10,20);
			th.display();
	}

}
