public class Short_Circuit
{
	public static void main(String[] args)
	{
		int d,n;
		n=10;
		//float f = 9.8;
		d=5;
		if(d!=0 && (n%d)==0)
		System.out.println(d + "is a factor of" +n);
	    //d=0;
	    //if(d!=0 && (n%d)==0)//with short circuit operator
	   // System.out.println(d + "is a factor of" +n);
	    if(d==0 & (n%d)!=0)//divide by zero error
	    {
	    	System.out.println("check");
	        System.out.println(d + "is a factor of" +n);
	    }
	}
}