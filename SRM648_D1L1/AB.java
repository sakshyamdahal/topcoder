/*
Problem statement for this problem can be found in
Single Round Match 648 Round 1 - Division I, Level One
http://community.topcoder.com/stat?c=problem_statement&pm=13642&rd=16312&rm=&cr=23015069
*/

public class AB { 

	public String createString(int n, int k)
	{
		int maxPairs;
		if (n % 2 == 0)
			maxPairs = (n/2) * (n/2);
		else
			maxPairs = (n/2) * ((n/2) + 1);

		if (k > maxPairs)
			return "";

		// loop till the lenght of string
		for (int b = 0;  b < n; b++)
		{
			char[] lunString = new char[n];

			// in each iteration fill the first b portion
			// of lunString with B and remaining with A
			for(int i = 0; i < b; i++)
				lunString[i] = 'B';

			for (int i = b; i < n; i++)
				lunString[i] = 'A';

			// play around with this array to check if we can get our k pairs
			int pairs = 0; // initally no pairs since B is at first

			// continue till we find k pairs or till we realize we cant make k pairs
			while(true) 
			{
				// yeah we found k pairs return the string
				if (pairs == k)
					return new String(lunString);

				// position we can change A and B and increase our pair count
				int pos = -1; 

				for (int i = 0; i < n - 1; i++)
				{
					// find swappable position
					if (lunString[i] == 'B' && lunString[i+1] == 'A')
					{
						pos = i;
						break;
					}

					// cant make new pairs
					if (pos == -1)
						break;

					pairs++;

				}
			}

		}

		return "";
	}
}