package day7;

public class Student {
int sid;
String sname;
char grade;

Student(int id,String name,char g)
{
	sid=id;
	sname=name;
	grade=g;
	
}



void show()
{
	System.out.println(sid+" "+sname+" "+grade);
}
void setData(int id,String name,char g)	
{
	sid=id;
	sname=name;
	grade=g;
}
}
