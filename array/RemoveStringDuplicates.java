/* Design an algorithm and write code to remove the duplicate characters in a string without using any additional buffer. NOTE: One or two additional variables are fine. An extra copy of the array is not.
FOLLOW UP
Write the test cases for this method. 
*/

public class RemoveStringDuplicates
{
	RemoveStringDuplicates()
	{
	}

/*	
// Solution 1 to remove duplicates 
//Withour using any other large size variable such as array

	public void removeDuplicatesInString(String str) 
	{
		char ch[] = str.toCharArray();
		
		for(int i=0;i<ch.length;i++)
		{
			for(int j=i+1;j<ch.length;j++)
			{
					if((ch[i] == ch[j])&&(ch[j]!='\0'))
						ch[j] = '\0';
			}
		}
		
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]!='\0')
				System.out.print(ch[i]);
		}
	}
*/


//Solution 2):- Withour using any buffer array  Time complexity : O(n^2)

/*
public String removeDuplicates(String input)
{
	 int tail=1;
	 int j=0;
	 char ch[] = input .toCharArray();
	 
	 for(int i=1;i<ch.length;i++) 
	 {
		 for(j=0;j<tail;j++)
		 {
			 if(ch[i] == ch[j])
				 break;
		 }
		 
		 if(j == tail) 
		 {
			 ch[tail]=ch[i];
			 tail++;
		 }
	 }
	 for(j=tail;j<ch.length;j++)
	 ch[j]=0; 
	 return(new String(ch));
}

*/


//Solution 3 ):- Remove duplicates in a string using array as buffer Time Complexity : O(n)

public String removeDuplicates(String input)
{
	char ch[] = input.toCharArray();
	boolean[] charFound = new boolean[256];
	if(ch.length < 2)  System.exit(1);
			charFound[ch[0]]=true;
			int tail=1;
		
	for(int i=1;i<ch.length;i++)
	{
		 if(charFound[ch[i]] == false)
		 {
			 ch[tail] = ch[i];
			 tail++;
			 charFound[ch[i]] = true;
		 }		
	}
	for(int j=tail;j<ch.length;j++)
		ch[j] = 0;
	return(new String(ch));
}


	public static void main(String[] args) 
	{
		
		RemoveStringDuplicates  obj1 = new RemoveStringDuplicates();
		String str = obj1.removeDuplicates("appleapple");
		System.out.println(str);
	}
	
}


