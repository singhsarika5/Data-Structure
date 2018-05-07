package Sortings;

public class ShellSort {

	public void shellSort(int[] input) {
		
		int size = input.length;
		int temp;
		int i,j;
		for(int gap = size/2; gap > 0; gap = gap / 2)
		{
			for(i = gap ; i < size; i++) {
				
				temp = input[i];
				for(j = i ; j >= gap && input[j - gap] > temp; j = j - gap) {
					input[j] = input[j - gap];
				}
				input[j] = temp;		
			}
		}
		
		for(i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShellSort obj = new ShellSort(); 
		int[] input ={4,5,3,6,2,8};
		obj.shellSort(input);
	}

}
