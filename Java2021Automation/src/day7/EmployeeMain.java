package day7;

public class EmployeeMain 
{

	public static void main(String[] args) 
	{
		Employee emp1=new Employee();
		emp1.eid=101;
		emp1.empname="John";
		emp1.empjob="Manager";
		emp1.empsal=50000;
		emp1.display();
		
		Employee emp2=new Employee();
		emp2.eid=102;
		emp2.empname="Scott";
		emp2.empjob="Analyst";
		emp2.empsal=100000;
		emp2.display();
	}
}


