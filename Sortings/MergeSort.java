package Sortings;

public class MergeSort {
	
	public void mergeSort(int[] input, int low, int high)
	{
		int mid;
		if ( low < high) {
			mid = (low + high) / 2; 
			mergeSort(input, low, mid);
			mergeSort(input, mid + 1, high);
			merge(input, low, mid, high);
		}
	}
	
	
	public void merge(int[] input, int low, int mid, int high) {
		
		int i, j;
		int[] input1 = new int[mid - low + 1];
		int[] input2 = new int[high - mid];
		
		for(i = 0; i < input1.length; i++)
		{
			input1[i] = input[low + i];
		}
		for(i = 0; i < input2.length; i++)
		{
			input2[i] = input[mid + 1 + i];
		}
		
		int k = low;
		i = 0;
		j = 0;
		while(i < input1.length && j < input2.length) {
			
			if( input1[i] < input2[j])	{
				input[k] = input1[i];
				i++;
				k++;
			}
			else 
			{
				input[k] = input2[j];
				j++;
				k++;
			}
		}
		
			while( j < input2.length)
			{
				input[k] = input2[j];
				j++;
				k++;
			}
		
	
			while( i < input1.length)
			{
				input[k] = input1[i];
				i++;
				k++;
			}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MergeSort obj = new MergeSort();
		int[] input= {4,5,2,1,3};
		obj.mergeSort(input, 0, 4);
		for(int j = 0; j < input.length; j++)
		{
			System.out.print(input[j] + " ");
		}
	}

}
