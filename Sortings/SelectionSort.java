package Sortings;

public class SelectionSort {

	public void selectionSort(int[] arr) {
		
		for(int i = 0 ; i < arr.length; i++) {
			
			for(int j = i + 1; j < arr.length; j++) {
				
				if(arr[i] > arr[j])
				{
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			
		}
			
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] input = {4,3,2,1};
		SelectionSort obj = new SelectionSort();
		obj.selectionSort(input);
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		
		
		

	}

}
