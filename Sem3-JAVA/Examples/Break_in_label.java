public class Break_in_label
{
	public static void main(String[] args)
	{
		first:
		for(int i=1;i<5;i++)
		{
			second:
			for(int j=1;j<3;j++)
			{
				System.out.println("i is: " + i + "; j is: " + j);
				if(i==2)
				{
					break first;//skips the i loop itself after printing i=2 j=1
				}
			}
		}
	}
}