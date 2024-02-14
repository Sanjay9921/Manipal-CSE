public class Continue_vs_Break
{
	public static void main(String[] args)
	{
		first:
		for(int i=1;i<6;i++)
		{
			second:
			for(int j=1;j<6;j++)
			{
				System.out.println("i: " + i + ";j: " + j);
				System.out.println("\n");
				if(i==3||j==2)
				{
					//break;
					//continue;
					//break first;
					//continue first;
					//break second;
					continue second;
				}
			}
		}
	}
}