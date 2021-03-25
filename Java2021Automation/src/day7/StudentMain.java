package day7;

public class StudentMain {

	public static void main(String[] args) {
		//Student stu=new Student();
		
		//approach 1 by usinf object reference variable
		/*stu.sid=101;
		stu.sname="Smith";
		stu.grade='A';
		
		stu.show();*/
		
		//approach 2 by using a mathod
		
		/*stu.setData(101, "Smith", 'A');
				stu.show();*/
				//approach 3 using constructor
		
		Student stu=new Student(101,"Smith",'A');
				stu.show();
				
		
	}

}
