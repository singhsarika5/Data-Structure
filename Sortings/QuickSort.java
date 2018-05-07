package Sortings;

public class QuickSort {

	public void quickSort(int[] input, int low, int high) {
		int pi;
		if (low < high) {
			pi = partition(input, low, high);
			quickSort(input, low, pi - 1);
			quickSort(input, pi + 1, high);
		}

	}

	public int partition(int[] input, int low, int high) {

		int left = low;
		int right = high;
		int pivotElem = input[low];

		while (left < right) {
			while (input[left] <= pivotElem) {
				left++;
			}
			while (input[right] > pivotElem) {
				right--;
			}
			if (left < right) {
				int temp = input[left];
				input[left] = input[right];
				input[right] = temp;
			}
		}
		
		input[low] = input[right];
		input[right] = pivotElem;
		return right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		QuickSort obj = new QuickSort();
		int[] input = { 3, 2, 4,0,1};
		obj.quickSort(input, 0, 4);
		for (int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}

}
