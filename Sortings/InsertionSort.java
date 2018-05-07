package Sortings;

public class InsertionSort {
	
	public void insertionSort(int[] arr) {
		
		for(int i = 1; i < arr.length ; i++) {
			int key = arr[i];
			int j = i - 1;
			while( j >= 0 && key < arr[j] )
			{
				arr[j + 1] = arr[j];
				j--;
			}
			arr[j + 1] = key;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] input = {4,3,7,2,1};
		InsertionSort obj = new InsertionSort();
		obj.insertionSort(input);
		for(int i = 0; i < input.length; i++)
		{
			System.out.print(input[i] + " ");
		}
	}

}
