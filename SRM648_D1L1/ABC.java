public class ABC {

	public String createString(int N, int K)
	{
		for (int countC = 0; countC < N; countC++)
		{
			for(int countB = 0; countB < N; countB++ )
			{
				char[] lunString= new char[N];

				for (int i = 0; i < countC; i++)
					lunString[i] = 'C';
				for (int i = countC; i < countB; i++)
					lunString[i] = 'B';
				for (int i = countB; i < N; i++)
					lunString[i] = 'A';

				int pairs = 0;

				while(true)
				{
					if (pairs == K)
						return new String(lunString);

					int index = -1;
					String change = "";

					for (int i = 0; i < N - 1; i++)
					{
						if (lunString[i].compareTo(lunString[i+1]) > 0)
						{
							index = i;
							change = lunString[i] + "" + lunString[i+1];

						}
					}

					if (index == -1)
						break;

					lunString[index] = change.charAt(1);
					lunString[index+1] = change.charAt(2);
					pairs++;
				}

			}
		}

		return "";
	}
}