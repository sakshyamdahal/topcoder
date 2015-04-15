/*
 * SRM 648 Division 2 Level One
 * @author: Sakshyam Dahal
 * Apr 15, 2015
*/

public class KitayutaMart2 {
	public static int numBought(int K, int T)
	{
		int price = 0;
		int numApple = 0;
		while(price != T)
		{
			price += Math.pow(2, numApple) * K;
			numApple++;
		}
		
		return numApple;
	}