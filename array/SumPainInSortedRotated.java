package array;

// Problem : TO find pair of numbers which are equal to given sum, in a sorted rotated array. Array is sorted in ascending order.

public class SumPainInSortedRotated {

	public void pairForSum(int[] input, int sum) {
		if(input == null) {
			throw new IllegalArgumentException("Invalid array as input.");
		}
		if(input.length < 2) {
			throw new IllegalArgumentException("Invalid array as input.");	
		}
		int rotationPoint = findRotationPoint(input);
		int i = 0;
		int j = input.length - 1;
		while(i < rotationPoint && j >= rotationPoint) {
			if(sum < (input[i] + input[j])) {
				j--;
			} else if(sum > (input[i] + input[j])) {	
				i++;
			} if(sum == (input[i] + input[j])){
				System.out.println("Number which are equal to given sum are " + input[i] + " " + input[j]);
				break;
			}
		}
		if(i == rotationPoint || j < rotationPoint) {
			System.out.println("Pair for given sum not found.");
		}
	}
	
	//This method will find the point where  array starts before rotation.
	
	public int findRotationPoint(int[] input) {
		
		int low = 0; 
		int high = input.length - 1;
		int mid;
		
		while(low < high) {
			mid = (low + high) / 2;
			if(high < low) {
				return 0;
			}
			if(high == low) {
				return low;
			}
			if(mid < high && input[mid + 1] < input[mid]) {
				return mid + 1;
			}
			
			if(low < mid && input[mid - 1] > input[mid]) {
				return mid;
			}
			
			if(input[mid] > input[high]) {
				low = mid + 1;
			}
			
			if(input[mid] < input[low]) {
				high = mid - 1;
			}
		}
		return 0;
	}

	public static void main(String[] args) {
		int[] input = {25, 30, 35, 41, 9, 11, 19, 23};
		SumPainInSortedRotated obj = new SumPainInSortedRotated();
		obj.pairForSum(input, 40);
	}
}
