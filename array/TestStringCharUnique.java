/*Implement an algorithm to determine if a string has all unique characters. What if you can not use additional data structures?*/

//soultion 1

public class TestStringCharUnique
{
	TestStringCharUnique()
	{
	}

// ******************Solution 1**********************************//	

/*	public boolean isUniqueCharString(String str) 
	{
		boolean isUnique = true;
		
		for(int i=0;i<str.length();i++)
		{
			 ch=str.charAt(i);
			if((str.substring((i+1)).contains(ch+"")) == true)
			{
				isUnique = false;
				break;
			}
		}
		return isUnique;
	}
*/	

// ******************Solution 2**********************************//

public boolean isUniqueCharString(String str) 
	{
		boolean isUnique = true;
	 boolean[] checkChar = new boolean[256];
	 int num[] = new int[10];
		
		
		System.out.println(num[0]);
	
	
		for(int i=0;i<checkChar.length;i++)
		{
			checkChar[i] = false;	
		}
		
		for(int i=0;i<str.length();i++)
		{
			// ch=str.charAt(i);
			if(checkChar[str.charAt(i)])
			{
				isUnique = false;
				break;
			}
			else
			{
				checkChar[str.charAt(i)] = true;
			}
		}
		return isUnique;
	}
	
	public static void main(String[] args)
	{
		TestStringCharUnique obj1 = new TestStringCharUnique();
		System.out.println(obj1.isUniqueCharString("apple"));
	}
}