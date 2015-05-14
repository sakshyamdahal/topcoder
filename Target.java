import java.util.Arrays;

/*
 * SRM 633 Division 2 Level 1
 * Target
 * @author: Sakshyam Dahal
*/

public class Target {
	public static String[] draw(int n)
	{
		String[] tar = new String[n];
		int main = n;
		int numSquare = 0;
		char[] line;
		for (int i = 0; i < (n/2) + 1; i++)
		{
			line = new char[n];
			for (int l = 0; l < n; l++)
				line[l] = ' ';
			
			if (i%2 == 0)
			{
				if (numSquare == 0)
				{
					for (int j = 0; j < n; j++)
						line[j] = '#';
				}
				else
				{
					int first = 0;
					int last = n -1;
					
					for(int k = 0; k < numSquare; k++)
					{
						line[first] = '#';
						line[last] = '#';
						first += 2;
						last -= 2;
					}
					
					for(int hash = 0; hash < main; hash++)
						line[first++] = '#';
				}
				
				numSquare++;
				main -= 4;
			}
			else
			{
				int first = 0;
				int last = n -1;
				
				for(int k = 0; k < numSquare; k++)
				{
					line[first] = '#';
					line[last] = '#';
					first += 2;
					last -= 2;
				}
			}
			
			tar[i] = new String(line);
		}
		int j = 0;
		
		for (int i = n -1; i >= (n/2)+1; i--)
		{
			tar[i] = tar[j++];
		}
		
		return tar;
	}
	
	
	public static void main(String[] args)
	{
		String[] ans = draw(17);
		String[] truea = 
			{"#################",
				"#               #",
				"# ############# #",
				"# #           # #",
				"# # ######### # #",
				"# # #       # # #",
				"# # # ##### # # #",
				"# # # #   # # # #",
				"# # # # # # # # #",
				"# # # #   # # # #",
				"# # # ##### # # #",
				"# # #       # # #",
				"# # ######### # #",
				"# #           # #",
				"# ############# #",
				"#               #",
				"#################" }
;
		System.out.println(Arrays.deepEquals(ans, truea));
		print(draw(49));
	}
	
	public static void print(String[] args)
	{
		for (String a : args)
			System.out.println(a);
	}
}
