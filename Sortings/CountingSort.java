package Sortings;

public class CountingSort {
	
	public void countingSort(int[] arr)  {
		int[] count = new int[100];
		int output[] = new int[arr.length]; 
		for(int i = 0; i < count.length; i++) {
			count[i] = 0;
		}
		
		for(int i = 0; i < arr.length; i++) {
			
			count[arr[i]] = count[arr[i]] + 1;
		}

		for(int i = 1; i < count.length;  i++) {
			count[i] = count[i] + count[i - 1];
		}


		for(int i = 0; i < output.length; i++) {
			
			output[count[arr[i]] - 1] = arr[i];
			count[arr[i]] = count[arr[i]] - 1;
		}
		System.out.println();
		for(int i = 0; i < output.length; i++)
		{
			System.out.print(output[i] + " ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CountingSort obj = new CountingSort();
		int input[] = {6, 2, 4, 1, 2};
		for(int i = 0; i < input.length; i++)
		{
			System.out.print(input[i] + " ");
		}
		obj.countingSort(input);
		
		
	}

}
