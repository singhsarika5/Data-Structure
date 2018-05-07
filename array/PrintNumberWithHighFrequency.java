
import java.util.*;

public class PrintNumberWithHighFrequency {
	
	public void pintFrequentNumber(int[] numbers) {
		
		Map<Integer, Integer> map = new HashMap<Integer,Integer>();
		
		map.put(numbers[0], 1);
		System.out.print(numbers[0] + " ");
		int count=0;
		for (int i = 1; i < numbers.length; i++)
		{
			if (map.containsValue(numbers[i]))
			{
				count = map.get(numbers[i]) + 1;
				
				map.replace(numbers[i], count +1);
				
			}
			else
			{
				
			}
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
