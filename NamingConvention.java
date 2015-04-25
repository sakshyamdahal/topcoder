/*
	SRM 638 Division 2 Level 1
	NamingConvention
	@author: Sakshyam Dahal
*/

public class NamingConvention {
	public static String toCamelCase(String variableName)
	{
		StringBuilder s = new StringBuilder();
		int len = variableName.length();
		for (int i = 0; i < len; i++)
		{
			
			if (variableName.charAt(i) == '_')
			{
				s.append(Character.toUpperCase(variableName.charAt(i+1)));
				i++;
			}
			else
				s.append(variableName.charAt(i));

		}

		return s.toString();
	}
}