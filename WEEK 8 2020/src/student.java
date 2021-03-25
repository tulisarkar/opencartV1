
public class student {
	int StudentId;
	String StudentName;
	char StudentGrade; 
	public student( int id,String n, char g) {
		StudentId=id;
		StudentName=n;
		StudentGrade=g;
	}
public void displayStudentInformation() {
	System.out.println("StudentId " +StudentId + "  " + "StudentName " +StudentName + "  " + "StudentGrade " +StudentGrade );
}


}
