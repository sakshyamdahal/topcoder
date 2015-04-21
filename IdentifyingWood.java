/*
 * SRM 635 Division 2 Level 1
 * IdentifyingWood
 * @author: Sakshyam Dahal
 * Apr 21, 2015
*/

public class IdentifyingWood
{
	public static String check(String s, String t)
	{
		int j = 0;
		for (int i = 0; i < s.length() && j < t.length(); i++)
		{
			if (s.charAt(i) == t.charAt(j))
			{
				j++;
				
			}		
		}
		return (j == t.length()) ? "Yep its a wood" : "Nope";
	}
}