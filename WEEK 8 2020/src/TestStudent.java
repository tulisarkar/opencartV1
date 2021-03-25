import NewPackage.student;

public class TestStudent {

	public static void main(String[] args) {
		student s = new student (10,"Maria",'A');
		student s1 =new student (11,"Harry",'B');
		student s2= new student (12,"Carlos",'A');
		student s3= new student (13,"Alex",'C');
		s.displayStudentInformation();
		s1.displayStudentInformation();
		s2.displayStudentInformation();
		s3.displayStudentInformation();

	}

}
