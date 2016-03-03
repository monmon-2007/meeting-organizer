import java.io.*;
import java.util.*;
public class Member
{
	private String name,email,dateOfBirth,address,phoneNumber,b;

		private String a;
	/*	private String fileName = "attend.txt";
		private String line = null;
		private int tkCount;*/
		static LinkedList<Attendance> linkedlist2 = new LinkedList<Attendance>();

	Member(String name,String email,String dateOfBirth,String address,String phoneNumber)
	{
		this.name=name;
		this.email=email;
		this.dateOfBirth=dateOfBirth;
		this.address=address;
		this.phoneNumber=phoneNumber;

/*
		String fileName = "attend.txt";
		 String line = null;
		 int tkCount;




		try
		{
			FileReader fileReader = new FileReader(fileName);
			BufferedReader bufferedReader =	new BufferedReader(fileReader);
			while((line = bufferedReader.readLine()) != null)
			{
				StringTokenizer st2 = new StringTokenizer(line,";");
				tkCount=st2.countTokens();
System.out.println(tkCount);
				for(int i=0;i<tkCount;i++)
				{
						//a=st2.nextToken();
					//	b=st2.nextToken();
					//	linkedlist2.add(new Attendance(b,a));
						System.out.println("idiot");
				}
						//				a=st2.nextToken();
					//	b=st2.nextToken();
				//linkedlist2.add(new Attendance(b,a));
            }


			bufferedReader.close();
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("Unable to open file '" +fileName + "'");
		}
		catch(IOException ex)
		{
				System.out.println("Error reading file '" + fileName + "'");
        }

*/
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