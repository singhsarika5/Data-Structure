/*
 * How to find duplicate number on Integer array in Java?
 * */

//import java.util.*;
public class DuplicateNumIntArray {

//Solution 1 :-  This method will find duplicates in an array of 1 to n. an A.P sequence.
/*	public void findDuplicate(int[] numbers, int len)
	{
		int actualSum = (len * (len + 1 ))/2;
		int arraySum=0;
		for(int i = 0; i < numbers.length ; i++ )
		{
			arraySum+= numbers[i];
		}
		System.out.println("Duplicate Element=" + (arraySum - actualSum));
	}
*/	
//Solution2: Brute Force method to find duplicates in a sorted array

/*	public void removeDuplicates(int[] numbers)
	{
		int tail=1;
		int j;
		for(int i=1;i<numbers.length;i++)
		{
			for(j=0;j<tail;j++)
			{
				if(numbers[i] == numbers[j])
				{
					break;
				}
			}
			if(j==tail)
			{
				numbers[tail] = numbers[i];
				tail++;
			}
		}
		for(int i=0;i<numbers.length;i++)
			{ System.out.println(numbers[i]); }	
	}
*/
	
	
	
// Solution 3 : Finding duplicates in an array of integers. In this case the input array will be in A.P sequence.
	
	public void removeDuplicates(int[] numbers)
	{
		int previous = numbers[0];
		
		System.out.println(previous);
		for(int i=1; i<numbers.length; i++)
		{
			if(numbers[i] != previous)
			{
				previous = numbers[i];
				System.out.println(previous);
			}
		}
	}
	
// this solution will use BitSet. Time Complexity : O(n)
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateNumIntArray obj1 = new DuplicateNumIntArray();
		int[] numbers = {1,2,3,3,4,4,5};
		obj1.removeDuplicates(numbers);
		
//		obj1.findDuplicate(numbers, 6);

		
	}

}
