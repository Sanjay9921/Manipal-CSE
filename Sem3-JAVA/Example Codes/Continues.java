public class Continues
{
	public static void main(String[] args)
	{
		int a[] = {10,20,30,40,50};
		for(int y:a)
		{
			if(y==30)
				continue;
				//break;
			System.out.println("y is : " +y);
		}
	}
}