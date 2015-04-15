/*
 * SRM 654 Div2 Level 1
 * SquareScoresDiv2
 * @author: Sakshyam Dahal
 * Apr 15, 2015
*/

public class SquareScoresDiv2 {
	public int getscore(String s)
	{
		int score = 0;
		int n = s.length();
		char c;
		int count;
		for (int i = 0; i < n; i++)
		{
			c = s.charAt(i);
			count = 1;

			while(i+1 < n && s.charAt(i+1) == c)
			{
				count++;
				i++;
			}

			score += numSubstring(count);
		}
		return score;
	}

	public int numSubstring(int n)
	{
		int count = 0;

		for (int i = 0; i < n; i++)
		{
			for (int j = i; j < n; j++)
				count++;
		}

		return count;
	}
}