import java.util.HashSet;
/*
 * SRM 650 Division 2 Level 1
 * TaroJiroDividing
 * @author: Sakshyam Dahal
 * 15 Apr 2015
*/

public class TaroJiroDividing {
	public int getNumber(int A, int B)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		int count = 0;

		while(isEven(A))
		{
			set.add(A);
			A /= 2;
		}

		set.add(A);

		while(isEven(B))
		{
			if (set.contains(B)) count++;
			B /= 2;
		}

		if (set.contains(B)) count++;
		return count;
	}

	public boolean isEven(int n)
	{
		return n % 2 == 0;
	}
}