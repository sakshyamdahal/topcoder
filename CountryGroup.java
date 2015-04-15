/*
 * SRM 653 Divison 2 Level 1
 * CountryGroup
 * @author: Sakshyam Dahal
 * Apr 15, 2015
*/

public class CountryGroup{
	public int solve(int[] a)
	{
		int numCountries = 0;
		int n = a.length;
		int i = 0;
		int curr;

		while(i < n)
		{
			curr = a[i];
			for (int j = i+1; j < i + curr; j++)
			{
				if (j >= n) return -1;
				else if (a[j] != curr) return -1;
			}

			numCountries++;
			i += curr;
		}

		return numCountries;
	}
}