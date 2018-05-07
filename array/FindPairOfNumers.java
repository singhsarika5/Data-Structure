/*
 * How to find all pairs on integer array whose sum is equal to given number?

Read more: http://javarevisited.blogspot.com/2015/06/top-20-array-interview-questions-and-answers.html#ixzz4pwYFt8AE

 * */
public class FindPairOfNumers {

	// Brute Force method for getting pair of number from given array witch sum
	// is equal to sum of given numbers.
	public void findPairOfSum(int[] numbers, int sum) {
		if(numbers.length <2) {
			System.out.println("Less number of elements");
			return;
		}
		for (int i = 0; i < numbers.length; i++) {

			for (int j = i + 1; j < numbers.length; j++) {
				if ((numbers[i] + numbers[j]) == sum) {
					System.out.println(numbers[i] + " " + numbers[j]);
				}
			}
		}
	}

	
//Solution 2 : Using HashSet
	
	public void findPairOfSum(int[] numbers, int sum, int a) {
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		FindPairOfNumers obj1 = new FindPairOfNumers();
//		int []numbers = {1,-2,3,5,8,10,12};
		
		int []numbers = {1};
		obj1.findPairOfSum(numbers, 10);
	}

}
