import java.util.HashMap;

/*
 * SRM 647 Division 2 Level 1
 * PeacefulLine
 * @author: Sakshyam Dahal
 * Apr 15, 2015
*/
public class PeacefulLine {
	public static String makeLine(int[] x)
	{
		String p = "possible"; String im = "impossible";
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		for (int a : x)
		{
			if (map.containsKey(a))
				map.put(a, map.get(a) + 1);
			else
				map.put(a,  1);
		}
		
		Integer[] values =  map.values().toArray(new Integer[0]);
		int n = x.length;
		
		for (int k : values)
			if (k > (n+1)/2)
				return im;
		return p;
	}	
}
