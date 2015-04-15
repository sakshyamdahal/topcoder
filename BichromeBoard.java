/*
 * SRM 655 Division 2 Level 1
 * BichromeBoard
*/

public class BichromeBoard{
	public String ableToDraw(String[] board)
	{
		// two cases exists
		// first char is 'W' or 'B'
		for (int k = 0; k <= 1; k++)
		{
			boolean able = true;

			for (int i = 0; i < board.length; i++)
				for (int j = 0; j < board[i].length(); j++)
					if (board[i].charAt(j) != '?')
						if (board[i].charAt(j) != ((i+j+k) % 2 == 0? 'W' : 'B'))
						{
							able = false;
							break;
						}

			if (able)
			return "Possible";
		}

		return "Impossible";

	}
}