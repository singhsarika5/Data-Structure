/*Write a method to decide if two strings are anagrams or not.
*/

// Solution :-- naive method 

public class TestStringAnagram
{
	TestStringAnagram() { }

/*	
	public boolean isStringanagram(String str1, String str2)
	{
		if((str1==null)||(str2==null)) {
			System.out.println("Provide non-null inputs");
		System.exit(1); }
					
		int charCount=0;
		boolean isAnagram=false;			
		
		if(str1.length() != str2.length())	
			isAnagram = false;
		else
		{
			for(int i=0;i<str1.length();i++)
			{
		//		System.out.println("Inside for loop 1");
				for(int j=0;j<str2.length();j++)
				{
					if(str1.charAt(i) == str2.charAt(j)) 
					{
						isAnagram = true;
						charCount++;
						break;
					}
	//				System.out.println("Inside for loop 2");
				}
		    }
		}	
	return (isAnagram && (charCount==str1.length()));
    }
*/


public boolean isStringanagram(String str1, String str2) 
{
	if(str1== null || str2==null)
	{
		System.out.println("Provide non-null string.");
	}
	if(str1.length() != str2.length())
		return false;
	
	int letters[] = new int[256];
	int ch;
	int i=0;
	int uniqueChars=0;
	int completedChars=0;
	
	for(i=0;i<str1.length();i++)
	{	
		ch=str1.charAt(i);
		if(letters[ch] == 0) 
		{
			letters[ch]++;
			uniqueChars++;
		}
	}
	
	for(i=0;i<str2.length();i++)
	{
		ch=str1.charAt(i);
		if(letters[ch] == 0) 
		{
		return false; 
	    }
		letters[ch]--;
		if(letters[ch] == 0) 
		{
		completedChars++;
		}
	}
	
		if(uniqueChars == completedChars ) 
		{	return(i == str2.length());   }
		else {
		 return false;
		}
}
	
	public static void main(String args[]) 
	{
		TestStringAnagram obj1 = new TestStringAnagram();
		
		if(obj1.isStringanagram("apile","pleai") == true)
			System.out.println("Anagram");
		else
			System.out.println("Not Anagram");
	}
}



	
	