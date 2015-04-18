import java.util.HashSet;

/*
 * SRM 639 Division 2 Level 1
 * ElectronicPetEasy
 * @author : Sakshyam Dahal
 * Apr 18, 2015
*/

public class ElectronicPetEasy {
	public String isDifficult(int st1, int p1, int t1, int st2, int p2, int t2)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		String d = "Difficult"; String e = "Easy";

		for (int i = 0; i < t1; i++)
		{
			set.add(st1 + (i * p1));
		}

		for (int i = 0; i < t2; i++)
		{
			if (set.contains(st2 + (i * p2)))
				return d;
		}

		return e;
	}
}