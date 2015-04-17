/*
 * SRM 643 Division 2 Level One
 * TheKingsArmyDiv2
 * @author: Sakshyam Dahal
 * Apr 17, 2015
 */

public class TheKingsArmyDiv2 {
	public static int getNumber(String[] state)
	{
		int stateLen = state.length;
		int armyLen = state[0].length();
		boolean happySoldier = false;

		int[] dx = {1, -1, 0, 0};
		int[] dy = {0, 0, 1, -1};

		for (int i = 0; i < stateLen; i++)
		{
			for (int j = 0; j < armyLen; j++)
			{
				if (state[i].charAt(j) == 'H')
				{
					happySoldier = true;

					for (int k = 0; k < 4; k++)
					{
						int x = i + dx[k];
						int y = j + dy[k];

						if ((x >= 0 && x < stateLen) && (y >= 0 && y < armyLen))
							if (state[x].charAt(y) == 'H')
							{
								System.out.println(x +" " + y);
								System.out.println(i + " " + j);
								return 0;
							}
					}
				}
			}
		}

		if (happySoldier)
			return 1;
		else
			return 2;
	}
