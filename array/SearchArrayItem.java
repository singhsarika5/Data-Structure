
public class SearchArrayItem {

//Solution1 : To find an item in unsorted array.

/*	public void findItemInArray(int[] numbers, int item) {
		if(numbers.length == 0)
		{
			System.out.println("Array is Blank");
			System.exit(1);
		}
		int i;
		for (i = 0; i < numbers.length; i++) {

			if (numbers[i] == item) {
				System.out.println("Position of Item =" + (i+1));
				break;
			}
		}
		if (i == numbers.length)
			System.out.println("Item not found");
	}

*/
	
//Solution 2: To find an item in sorted array;
	
	public void binarySearch(int[] numbers, int item) {
		int low = 0;
		int high = numbers.length - 1;
		int mid;
		while(low <= high)
		{
			mid = low  + (high - low) / 2;
			
			System.out.println(mid + " " + numbers[mid]);
			if(item < numbers[mid])
			{
				high = mid - 1;	
				System.out.println(numbers[high]);
			}
			else if(item > numbers[mid])
			{
				low = mid + 1;
			}
			else
			{
				System.out.println("Position of item is " + (mid +1));
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchArrayItem obj1 = new SearchArrayItem();
		int[] numbers = {1,2,3,4,5,6,7};
		obj1.binarySearch(numbers, 3);
	}

}
