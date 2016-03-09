import java.io.*;
import java.util.*;
import java.text.*;

public class Church
{
	static private String name,email,dateOfBirth,address,phoneNumber,ss1,ss2;

	public static void main(String[]args)throws IOException
	{
		String test;
		int tkCount; //the numbers of tokens per line

		LinkedList<Member> linkedlist = new LinkedList<Member>(); //linkelist initiated
		Scanner kb = new Scanner(System.in);


//*-*-*-*-*--**-*-*---*-*-Date Function *-*--**-*-**-*-*-*-*-*-*--
   	  Date dNow = new Date( );
      SimpleDateFormat ft = new SimpleDateFormat ("MM/dd/YYYY");
      String hehe=ft.format(dNow);
      System.out.println("Current Date: " + hehe);





		        // The name of the file to open.
		        String fileName = "temp.txt";
		        // This will reference one line at a time
        		String line = null;
		 try {
		            // FileReader reads text files in the default encoding.
		            FileReader fileReader = new FileReader(fileName);

		            // Always wrap FileReader in BufferedReader.
		            BufferedReader bufferedReader =	new BufferedReader(fileReader);
					int j=0;
		            while((line = bufferedReader.readLine()) != null)
		            {
		                //System.out.println(line);
		                StringTokenizer st = new StringTokenizer(line,";");
		           		tkCount=st.countTokens();
		           		name=st.nextToken();
		           		email=st.nextToken();
		           		dateOfBirth=st.nextToken();
		           		address=st.nextToken();
		           		phoneNumber=st.nextToken();


						linkedlist.add(new Member(name, email, dateOfBirth, address, phoneNumber));

		               for(int i=0;i<((tkCount-5)/2);i++)
		               {
							ss1=st.nextToken();
							ss2=st.nextToken();
							linkedlist.get(j).setAttendence(ss1, ss2);

						}
						j++;
		            }

					String helloo=linkedlist.get(0).getName();
		            System.out.println(helloo);

		            String helloo2=linkedlist.get(3).linkedlist2.get(0).getdate();
		           System.out.println(helloo2);
		          // System.out.println(ss1);


		            // Always close files.
		            bufferedReader.close();
		        }
		        catch(FileNotFoundException ex) {
		            System.out.println(
		                "Unable to open file '" +
		                fileName + "'");
		        }
		        catch(IOException ex) {
		            System.out.println(
		                "Error reading file '"
		                + fileName + "'");
		            // Or we could just do this:
		            // ex.printStackTrace();
        }


  File file = new File("tempp.txt");
        // creates the file
        file.createNewFile();
        // creates a FileWriter Object
        FileWriter writer = new FileWriter(file);
        // Writes the content to the file
        writer.write("This\n is\n an\n example\n");
        writer.flush();
        writer.close();


        //************************** OPERATION **************************
        							/*  Menu */
        int ans=0;
		int listSize=linkedlist.size();
		int listSize2=0;

        System.out.println("1-Show all members");
        System.out.println("2-Show all members attended at a certain date");
        System.out.println("3-Search by member name");
        System.out.println("4-Take Attendance");

        System.out.println("Enter a number from the menu:");
        ans=kb.nextInt();





        if(ans==1)
        {
			for(int i=0;i<listSize; i++)
			{
				System.out.println(linkedlist.get(i).getName());
			}
		}

		if(ans==2)
		{
			System.out.println("Enter the Date in format dd/mm/yyyy");
			String dateEnterd;
			dateEnterd=kb.nextLine();dateEnterd=kb.nextLine();
			System.out.println(dateEnterd);


			for(int i=0;i<listSize; i++)
			{
				listSize2=linkedlist.get(i).linkedlist2.size();
				for(int g=0;g<listSize2; g++)
				{
					if(linkedlist.get(i).linkedlist2.get(g).getdate().equals(dateEnterd) && linkedlist.get(i).linkedlist2.get(g).getAttendence().equals("yes"))
					{
						System.out.println(    linkedlist.get(i).getName()    );
					}
				}
			}
		}









	}
}