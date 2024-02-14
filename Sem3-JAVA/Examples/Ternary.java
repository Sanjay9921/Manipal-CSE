class Ternary
{
	public static void main(String[] args)
	{
		Double number = -5.5;
		String result;
		result = (number > 0.0)?"positive":"not positive";
		System.out.println(number + " is " + result);
		int amount = 10;
		String result1 = amount<=2?"couple":amount>2&&amount<5?"few":amount<=5?"several":"many";
		System.out.println(result1);
	}
}