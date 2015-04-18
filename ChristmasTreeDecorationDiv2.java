/*
 * SRM 640 Division 2 Level 1
 * ChristmasTreeDecorationDiv2
 * @author: Sakshyam Dahal
 * Apr 18, 2015
*/

public class ChristmasTreeDecorationDiv2 {
	public int solve(int[] col, int[] x, int[] y)
	{
		int len = x.length;
		int beautiful = 0;
		for (int i = 0; i < len; i++)
		{
			if (col[x[i]-1] != col[y[i]-1])
				beautiful++;
		}
		return beautiful;
	}
}