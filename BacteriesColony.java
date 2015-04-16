/*
 * SRM 645 Division 2 Level 1
 * BacteriesColony
 * @author: Sakshyam Dahal
 * Apr 16, 2015
*/

public class BacteriesColony {
	public int[] performTheExperiment(int[] colonies)
	{
		boolean cont = true;
		int[] coloniesCopy;
		int n = colonies.length;

		while(cont)
		{
			cont = false;
			coloniesCopy = new int[n];
			for (int i = 0; i < n; i++) coloniesCopy[i] = colonies[i];

			for (int i = 1; i+1 < n; i++)
			{
				if (coloniesCopy[i] < coloniesCopy[i-1] && coloniesCopy[i] < coloniesCopy[i+1])
				{
					cont = true;
					colonies[i]++;
				}
				else if (coloniesCopy[i] > coloniesCopy[i-1] && coloniesCopy[i] > coloniesCopy[i+1])
				{
					colonies[i]--;
					cont = true;
				}
			}

		}

		return colonies;
	}
}