public class Continue_variation
{
	public static void main(String[] args)
	{
		int a[] = {10,29,30,40,50};
		for(int y:a)
		{
			if(y%2!=0)
				//break;//prints only 10
				continue;//skips 20

			System.out.println("Processing: "+y+"\t");
		}
	}
}