/*
 * How to find largest and smallest number in unsorted array?

Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4pwUzWNwS

 * */
public class SmallestLargestOfArray {

	// Solution Case : When array is not sorted.

	/*
	 * public void findSmallestAndLargest(int[] numbers) { int smallest =
	 * numbers[0]; int largest = numbers[0];
	 * 
	 * for (int i = 1; i < numbers.length; i++) { if (numbers[i] < smallest) {
	 * smallest = numbers[i]; } if (numbers[i] > largest) { largest =
	 * numbers[i]; } } System.out.println("Smallest number in array =" +
	 * smallest); System.out.println("largest number in array =" + largest); }
	 * 
	 */
	// Solution case : When array is sorted.

	public void findSmallestAndLargest(int[] numbers) {

		// provided that array is sorted.

		int smallest = 0;
		int largest = 0;

		if (numbers[0] < numbers[numbers.length - 1]) {
			smallest = numbers[0];
			largest = numbers[numbers.length - 1];
		} else {
			largest = numbers[0];
			smallest = numbers[numbers.length - 1];
		}
		System.out.println("Smallest number in array =" + smallest); 
		System.out.println("largest number in array =" + largest); 
 }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] numbers = {1,2,3,4,5,6};
		SmallestLargestOfArray obj = new SmallestLargestOfArray();
		obj.findSmallestAndLargest(numbers);
	}

}
