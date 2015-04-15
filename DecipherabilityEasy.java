/*
 * SRM 649 Division 2 Level 1
 * DecipherabilityEasy
 * @author Sakshyam Dahal
 * Apr 15, 2015
*/

public class DecipherabilityEasy {
	public String check(String s, String t)
	{
		int n = s.length();
		if (n - t.length() != 1) return "Impossible";
		for (int i = 0; i < n; i++)
		{
			String temp = s.substring(0,i) + s.substring(i+1, n);
			if (temp.equals(t)) return "Possible";
		}
		return "Impossible";
	}
}