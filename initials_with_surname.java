//!/bin/java
import java.util.*;
public class short_name
{
	public static void main (String args[])
	{
		Scanner in = new Scanner(System.in);
		
		
		//Declaration
		String full_name=""; int length=0; int last_index;
		char ch; String space_name=""; String t1=""; String title="";
		String final_name;
		
		//Input from user
		System.out.println("Enter the full name");
		full_name=in.nextLine();
		
		
		
		//Adding space before name
		length=full_name.length();
		space_name= ' '+full_name;
		
		//To extract title
			last_index= space_name.lastIndexOf(" ");
			title= space_name.substring(last_index);
			
			
			
		//Loop to extract initials from the name
		for(int i=0; i<last_index; i++)
		{
			ch=space_name.charAt(i);
			if(ch==' ')
			t1=t1 + space_name.charAt(i+1) + '.';
		}
		
		
		
		//Final name
		final_name= t1+title;
		System.out.println(final_name);
	}
}
