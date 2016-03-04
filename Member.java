import java.io.*;
import java.util.*;
public class Member
{
	private String name,email,dateOfBirth,address,phoneNumber;
	LinkedList<Attendance> linkedlist2 = new LinkedList<Attendance>();

	Member(String name,String email,String dateOfBirth,String address,String phoneNumber)
	{
		this.name=name;
		this.email=email;
		this.dateOfBirth=dateOfBirth;
		this.address=address;
		this.phoneNumber=phoneNumber;

	}

	//Set Value statements
	void setName(String name)
	{
		this.name=name;
	}
	void setEmail(String email)
	{
		this.email=email;
	}
	void setDOP(String dateOfBirth)
	{
		this.dateOfBirth=dateOfBirth;
	}
	void setAdress(String address)
	{
		this.address=address;
	}
	 void setAttendence(String date, String attended)
	{
		linkedlist2.add(new Attendance(date,attended));
	}

	void setPn(String phoneNumber)
	{
		this.phoneNumber=phoneNumber;
	}

	// Return Statements
		String getName()
		{
			return name;
		}
		String getEmail()
		{
			return email;
		}
		String getDOP()
		{
			return dateOfBirth;
		}
		String getAdress()
		{
			return address;
		}
		String getPn()
		{
			return phoneNumber;
		}



}