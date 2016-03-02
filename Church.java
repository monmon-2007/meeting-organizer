import java.io.*;
import java.util.*;
public class Church
{
	static private String name,email,dateOfBirth,address,phoneNumber;

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
		           		//tkCount=st.countTokens();
		           		name=st.nextToken();
		           		email=st.nextToken();
		           		dateOfBirth=st.nextToken();
		           		address=st.nextToken();
		           		phoneNumber=st.nextToken();
						linkedlist.add(new Member(name, email, dateOfBirth, address, phoneNumber));




		              /*  for(int i=0;i<tkCount;i++)
		                {
							test=st.nextToken();
							System.out.println(test);
						}*/

		            }

					String helloo=linkedlist.get(2).getName();
		            System.out.println(helloo);


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