import java.io.*;
import java.util.*;
public class Church
{
	static private String name,email,dateOfBirth,address,phoneNumber,ss1,ss2;

	public static void main(String[]args)
	{
		String test;
		int tkCount; //the numbers of tokens per line

		LinkedList<Member> linkedlist = new LinkedList<Member>(); //linkelist initiated










		        // The name of the file to open.
		        String fileName = "temp.txt";
		        // This will reference one line at a time
        		String line = null;
		 try {
		            // FileReader reads text files in the default encoding.
		            FileReader fileReader = new FileReader(fileName);

		            // Always wrap FileReader in BufferedReader.
		            BufferedReader bufferedReader =	new BufferedReader(fileReader);

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
							Member.linkedlist2.add(new Attendance(ss1,ss2));
						}

		            }

					String helloo=linkedlist.get(0).getName();
		            System.out.println(helloo);

		            String helloo2=linkedlist.get(0).linkedlist2.get(0).getdate();
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
	}
}