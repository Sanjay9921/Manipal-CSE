public class break_in_nested
{
	public static void main(String[] args)
	{
		for(int i=1;i<5;i++)
		{
			for(int j=1;j<3;j++)
			{
				System.out.println("i = " + i + "; j = " + j);
				if(i==2)
				{
					break;//goes back to i loop skipping i=2 j=2 
				}
			}
		}
	}
}