package array;

// An array has both negative and positive numbers. Arrange negative numbers one side and positive numbers one side of the array.

public class ArrangeNegativePostitive {
	
	public void arrangeNumbers(int[] input) {
		
		int neg = 0;
		int pos = input.length - 1;
		while(neg < pos) {
			if(input[neg] < 0) {
				neg++;
			}
			if(input[pos] >= 0) {
				pos--;
			}
			if(input[neg] >= 0 && input[pos] < 0) {
				int temp = input[neg];
				input[neg] = input[pos];
				input[pos] = temp;
				neg++;
				pos--;
			}
 		}
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		ArrangeNegativePostitive obj = new ArrangeNegativePostitive();
		int[] input = {2,-1,5,0,-10,8,-9};
		obj.arrangeNumbers(input);
	}

}
