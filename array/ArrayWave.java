package array;

//Problem: Arrange an array in wave form. Example : 3 5 6 7 8 9
//										Output : 5 3 7 6 9 8

//Brute Force: Brute force way to solve this problem is compare every third index number with its previous value and next value and swap.
public class ArrayWave {
	
	public void waveArray(int[] input) {
		int temp;
		for(int i = 1; i < input.length; i = i + 2) {
			
			if(i + 1 < input.length) {
				if(input[i - 1] < input[i]) {
					temp = input[i -1];
					input[i -1] = input[i];
					input[i] = temp;
				}
				if(input[i + 1] < input[i]) {
					temp = input[i + 1];
					input[i + 1] = input[i];
					input[i] = temp;
				}
			}
		}
		
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayWave obj = new ArrayWave();
		int[] input ={23,20, 14, 16, 19, 0, 2};
		obj.waveArray(input);
	}

}
