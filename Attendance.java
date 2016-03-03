public class Attendance
{
	private String attendeted;
	private String date;

	Attendance(String date,String attendeted)
	{
		this.attendeted=attendeted;
		this.date=date;
	}

	//Set Value statements
	void setAttendence(String attendeted)
	{
		this.attendeted=attendeted;
	}
	void setDate(String date)
	{
		this.date=date;
	}

	// Return Statements
	String getAttendence()
	{
		return attendeted;
	}
	String getdate()
	{
		return date;
	}


}