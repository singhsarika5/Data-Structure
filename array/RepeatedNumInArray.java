
import java.util.*;
//import java.util.Set;

public class RepeatedNumInArray {

	
	public void reverseArray(int[] numbers)
	{
		for (int i = 0; i < numbers.length / 2; i++) {
			
			int temp = numbers[i];
			numbers[i] = numbers[numbers.length - 1 -i];
			numbers[numbers.length - 1 -i] = temp;
			
		}
		
		for (int i = 0; i < numbers.length; i++) {
			
			System.out.print(numbers[i] + " ");
		}
			
	}
	
	public void findDuplicates(int[] numbers)
	{
		ArrayList<Integer> set = new ArrayList<Integer>();
		
		for (int i = 0; i < numbers.length; i++)
		{
			if(set.contains(numbers[i]))
			{
				System.out.print(numbers[i] + " ");
			}
			else
			{
				set.add(numbers[i]);
			}
		}
				
	}
	public static void main(String[] args) {
		
		RepeatedNumInArray obj1 = new RepeatedNumInArray();
		int[] numbers = {1,2,3,4,5};
		// TODO Auto-generated method stub

		obj1.reverseArray(numbers); 


	}

}
