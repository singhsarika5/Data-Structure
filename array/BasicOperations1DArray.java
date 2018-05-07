package array;

public class BasicOperations1DArray {
	
	public int arraySum(int[] array) {
		if(array == null) {
			throw new IllegalArgumentException("Please enter a valid array.");
		}
		if(array.length == 0) {
			throw new IllegalArgumentException("Please enter a valid array.");
		}
		int sum = 0;
		for(int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}

	
	public int largestFromArray(int[] array) {
		if(array == null) {
			throw new IllegalArgumentException("Please pass a valid array as Argument.");
		}
		if(array.length == 0) {
			throw new IllegalArgumentException("Please pass a valid array as Argument.");
		}
		int largest = array[0];
		for(int i = 1; i < array.length; i++) {
			if(array[i] > largest) {
				largest = array[i];
			}
		}
		return largest;
	}
	
	public int recSearchElement(int[] array, int leftIndex, int rightIndex, int item) {     // This method will search an element in array and find its index.
		if(array == null) {
			throw new IllegalArgumentException("Pass a valid Array.");
		}
		if(array.length == 0) {
			throw new IllegalArgumentException("Pass a valid Array.");
		}
		if(leftIndex > rightIndex) {
			return -1;
		}
		if(item == array[leftIndex]) {
			return leftIndex;
		} else {
			return recSearchElement(array, leftIndex + 1, rightIndex, item);
		}
		
	}
	
	public static void main(String[] args) {
		BasicOperations1DArray obj = new BasicOperations1DArray();
		int[] array = {7,1,3,2,10};
		System.out.println(obj.arraySum(array));
		System.out.println(obj.largestFromArray(array));
		if(obj.recSearchElement(array, 0, array.length - 1, 11) == -1) {
			System.out.println("Element not found.");
		} else {
			System.out.println("Position of element 11 is " + (obj.recSearchElement(array, 0, array.length - 1, 11) + 1));
		}
	}
}
