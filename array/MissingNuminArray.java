/*Program to Find Missing number in an array of 1 to n where number are in sequence of 1,2,3..n
 * */

//import java.util.BitSet;
public class MissingNuminArray {

	//Solution 1 to find missing number in array
	/*
	public int findMissingNumber(int[] numbers, int len) {
		if (numbers.length == len) {
			System.out.println("No Missing number in array");
			System.exit(1);
		}

		int expectedSum = (len * (len + 1)) / 2;
		int actualSum = 0;
		for (int i = 0; i < numbers.length; i++) {
			actualSum = actualSum + numbers[i];
		}

		return (expectedSum - actualSum);

	}
*/

//Solution 2 to find missing array
// This method will also work when there are more then one missing numbers.
// This solution will use BitSet
/*	public void findMissingNumber(int[] numbers, int len)
	{
		BitSet setBits= new BitSet(len);
		
		for(int i =0; i < numbers.length; i++)
		{
			setBits.set(numbers[i]);
		}
		int lastIndex = 1;
		for(int i = 1; i<=(len - numbers.length);i++)
		{
				lastIndex = setBits.nextClearBit(lastIndex);
				System.out.println("Missing number is: " + lastIndex++);
			
		}
	}
*/

	
//Solution 3 : Using a array of boolean variables to mark numbers present.
// This solution will also find more than one missing numbers.
	
	public void findMissingNumber(int[] numbers, int len)
	{
		boolean[] markNumbers = new boolean[len];
		
		for(int i = 0;i < numbers.length; i++)
		{
			markNumbers[numbers[i] - 1] = true;
		}
		
		//Finding and print missing numbers
		
		for(int i = 0;i < markNumbers.length; i++)
		{
			if(markNumbers[i] == false )
				System.out.println(i+1);
		}
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = { 1,3, 4, 6 };
		MissingNuminArray obj1 = new MissingNuminArray();
        obj1.findMissingNumber(numbers, 6);

	}

}
