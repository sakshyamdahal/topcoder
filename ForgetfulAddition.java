/*
 * SRM 642 Divison 2 Level One
 * ForgetfulAddition
 * @author: Sakshyam Dahal
 * Apr 18, 2015
*/

public class ForgetfulAddition {
	public int minNumber(String e)
	{
		int len = expression.length();

		// 2132
		if (len % 2 == 0)
			return Integer.parseInt(e.substring(0,len/2)) + Integer.parseInt(e.substring(len/2, len));
		else
		{
			// 12345
			int minIndex = (Integer.parseInt(e.substring(0, (len+1)/2)) < Integer.parseInt(e.subString(len/2, len))) ? (len+1)/2 : len/2;
			return Integer.parseInt(e.substring(0,minIndex)) + Integer.parseInt(e.substring(minIndex, len));
		}

	}
}