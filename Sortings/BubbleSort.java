package Sortings;

public class BubbleSort 
{
	// Traditional way of solving bubble sort
	public void bubbleSort(int[] arr) 
	{
		for(int i = 0; i < arr.length; i++)
		{
			for(int j = 0; j < arr.length - 1; j++)
			{
				if( arr[j] > arr[j + 1])
				{
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}	
		}
	//	return arr;
	}
	
	// This approach will limit the number of passes if array has been sorted after a certain number passes.
	
	public void bubbleSortEnhanced(int[] arr)
	{
		boolean isSwapped = false;
		
		for(int i = 0; i < arr.length && !isSwapped ; i++)
		{
			isSwapped = true;
			System.out.println("Pass" + (i + 1));
			
			for(int j = 0; j < arr.length - 1; j++)
			{
				if( arr[j] > arr[j + 1])
				{
					isSwapped = false;
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
				
			}
		}
	}		
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BubbleSort obj = new BubbleSort();
		int[] input ={1,2,6,5};	
	    obj.bubbleSortEnhanced(input);
		for(int i = 0; i < input.length; i++)
		{
			System.out.print(input[i] + " ");
		}	
	}
}
