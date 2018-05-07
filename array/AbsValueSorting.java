package array;

public class AbsValueSorting {
	
	public void  mergeSort(int[] array, int low, int high, int givenNum) {
		if(low < high) {
			int mid = (low + high)/2;
			mergeSort(array, low, mid, givenNum);
			mergeSort(array, mid + 1, high, givenNum);
			merge(array, low, mid, high, givenNum);
		}
	}
	
	public void  merge(int[] array, int low, int mid, int high, int givenNum) {
			int[] array1 = new int[mid - low + 1];
			int[] array2 = new int[high - mid];
			int i, j, k;	
			for(i = 0; i < array1.length; i++) {
				array1[i] = array[low + i];
			}
			for(i = 0; i < array2.length; i++) {
				array2[i] = array[mid + 1 + i];
			}
			j = 0; k = 0; i = low;
			while(j < array1.length && k < array2.length) {
				
				if(Math.abs(array1[j] - givenNum) <= Math.abs(array2[k]- givenNum)) {
					array[i] = array1[j];
					j++;
				}
				else {
					 array[i] = array2[k];
					 k++;
				}
				i++;
			}
			while(j < array1.length) {
				array[i] = array1[j];
				i++;
				j++;
			}
			while(k < array2.length) {
				array[i] = array2[k];
				i++;
				k++;
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]  array = {31, 50, 1, 2, 3,4};
		AbsValueSorting obj = new AbsValueSorting();
		obj.mergeSort(array, 0, array.length - 1, 5);
		
		for(int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}

}
