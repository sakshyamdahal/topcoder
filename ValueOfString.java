import java.util.HashMap;

/*
 * SRM 652 Divison 2 Level 1
 * ValueOfString
*/

public class ValueOfString {

	public int findValue(String s)
	{
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		int n = s.length();

		for (int i = 0; i < n; i++)
		{
			char c = s.charAt(i);
			if (!map.containsKey(c))
			{
				int value = 0;
				for (int j = 0; j < n; j++ )
					if (s.charAt(j) <= c)
						value++;
				map.put(c, value);
			}
		}


		int totalValue = 0;
		for (int i = 0; i < n; i++)
		{
			totalValue += (map.get(s.charAt(i))) * (s.charAt(i) - 'a' + 1);
		}

		return totalValue;
	}
}