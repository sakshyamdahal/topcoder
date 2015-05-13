/*
 * SRM 634 Divison 2 Level 1
 * MountainRanges
 * @author: Sakshyam Dahal
*/

public class MountainRanges {
	public static int countPeaks(int[] heights)
	{
		int peaks = 0;
		int len = heights.length;
		
		if (len == 1)
			return 1;
		
		if (heights[0] > heights[1])
			peaks++;
		if (heights[len -1] > heights[len-2])
			peaks++;
		
		for (int i = 1; i < len -1; i++)
		{
			if (heights[i] > heights[i-1] && heights[i] > heights[i+1])
				peaks++;
		}
		
		return peaks;
	}
}
