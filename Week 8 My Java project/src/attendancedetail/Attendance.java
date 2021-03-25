package attendancedetail;

public class Attendance {
	double hoursworked = 40.5;
	double rate =50.5;
	double Totalpay= hoursworked*rate;
	public void display()
	{
		System.out.println("Total Pay= (hours worked * rate): "  +Totalpay);
	}

}
