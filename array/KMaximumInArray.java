package array;


public class KMaximumInArray {

	public void findKMax(int[] input, int k) {
		for(int i =  1; i <= k; i++) {
			heapify(input, (input.length - i));
			int temp = input[0];
			input[0] = input[input.length - i];
			input[input.length - i] = temp;
		}
		
		System.out.println("List of K Max elements:");
		for(int i = 1; i <= k; i++) {
			System.out.print(input[input.length - i] + " ");
		}
	}
	
	public void heapify(int[] input, int len) {
		for(int i = (len - 1) / 2; i >=0; i--) {
			int largest = 0;
			int left = i * 2 + 1;
			int right = i * 2 + 2;
			if(right <= len && left <= len) {
					if(input[left] > input[right]) {
						largest = left;
					} else {
						largest = right;
					}
				} else if(left <= len){
					largest = left;
				}
			
			if(input[largest] > input[i]) {
				int temp = input[i];
				input[i] = input[largest];
				input[largest] = temp;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KMaximumInArray obj = new KMaximumInArray();
		int[] input ={100, 12, 0, 15, 18, 9, 20, 34, 3, 78, 200};
		obj.findKMax(input, 3);
	}
}
