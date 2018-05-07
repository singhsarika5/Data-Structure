package array;

/*Search an element in a sorted in ascending order rotated array.*/

//import java.util.regex.*;

public class  SearchSortedRotatedArray {
	
	public void  searchRotatedArray(int[] inputArray,int data) {
		 
			int startIndex = findStartIndex(inputArray, 0, inputArray.length - 1);
		    System.out.println("start index =" + startIndex);
			int low = 0;
			int high = inputArray.length - 1;
			if(data >= inputArray[startIndex] && data <= inputArray[high]) {
				binarySearch(inputArray, startIndex, high, data);
			} else {
				binarySearch(inputArray, low, startIndex - 1, data);
			}
	}
	
	public void binarySearch(int[] inputArray, int low, int high, int data) {
		int mid = 0;
		while(low <= high) {
			mid = (low + high)/2;
			if(data < inputArray[mid]) {
				high = mid -1;
			} else if(data > inputArray[mid]) {
				low = mid + 1;
			} else {
				System.out.println("Element ia at index " + mid);
				return;
			}
		}
		if(low > high) {
			System.out.println("Element not found.");
		}
	}
	
	public int findStartIndex(int[] inputArray, int low, int high) {
		int mid = 0;
		while(low <= high) 	{
			mid  = (low + high)/2;
			if(high < low) {
				return 0;
			}
			if(high == low) {
				return 0;
			}
			
			if(mid < high && inputArray[mid] > inputArray[mid + 1]) {
				return mid + 1;
			}
			
			if(mid > low && inputArray[mid - 1] > inputArray[mid] ) {
				return mid;
			}
			
			if(inputArray[high] > inputArray[mid]) {
				high = mid - 1;
			}
			else {
				low = mid + 1;
			}
		}
		
		return 0;
 	}
	
	public static void main(String[] args) {
		SearchSortedRotatedArray obj = new SearchSortedRotatedArray();
		int[] array ={25, 30, 43, 54, 6, 17, 19, 23};
		obj.searchRotatedArray(array, 20);
	}
}
