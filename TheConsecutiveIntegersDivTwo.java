import java.util.Arrays;

public class TheConsecutiveIntegersDivTwo {
	public int find(int[] numbers, int k)
	{
		if (k != 2)
			return 0;

		Arrays.sort(numbers);
		int index = 0;
		int minDiff = numbers[1] - numbers[0];
		int n = numbers.length;

		for (int i = 1; i+1 < n; i++)
		{
			int currDiff = numbers[i+1] - numbers[i];
			if (currDiff < minDiff)
			{
				minDiff = currDiff;
				index = i;
			}
		}

		return minDiff - 1;
	}
}