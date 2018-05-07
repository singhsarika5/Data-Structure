package array;


// Problem : We are given an encrypted array of size n. Encrypted array has been found by replacing each element of the original array by sum of
//   remaining elements. We need to find original array.
  
/*Let n = 4, and
the original array be ori[] = {a, b, c, d}
encrypted array is given as:
arr[] = {b+c+d, a+c+d, a+b+d, a+b+c}

Elements of encrypted array are :
arr[0] = (b+c+d), arr[1] = (a+c+d), 
arr[2] = (a+b+d), arr[3] = (a+b+c)
add up all the elements
sum =  arr[0] + arr[1] + arr[2] + arr[3]
       = (b+c+d) + (a+c+d) + (a+b+d) + (a+b+c)
       = 3(a+b+c+d) 
Sum of elements of ori[] = sum / n-1
                        = sum/3 
                        = (a+b+c+d)
Thus, for a given encrypted array arr[] of size n, the sum of 
the elements of the original array ori[] can be calculated as:
sum =  (arr[0]+arr[1]+....+arr[n-1]) / (n-1)

Then, elements of ori[] are calculated as:
ori[0] = sum - arr[0]
ori[1] = sum - arr[1] 
        .
        .
ori[n-1] = sum - arr[n-1] */ 
		
public class OriginalArrayFromEncrypted {
	
	public void findOriginalArray(int[] input) {
	
		int sumArray = 0;
		
		for(int i = 0; i < input.length; i++) {
			sumArray = sumArray + input[i];
		}
	
		int sumOriginal = sumArray /(input.length - 1);
		
		
		// Replacing each array element with original element(sumOroginal - element)
		for(int i = 0; i < input.length; i++) {
			input[i] = sumOriginal - input[i];
		}
		
		for(int i = 0; i < input.length; i++) {
			System.out.print(input[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		
		OriginalArrayFromEncrypted obj = new OriginalArrayFromEncrypted();
		int[] input = {10, 14, 12, 13, 11};
		obj.findOriginalArray(input);
	}

}
