//GCD using middle school method and analyse its time efficiency

#include<stdio.h>
#include<stdlib.h>
#include<time.h>

int gcd(int a,int b,int cnt,int index)
{
	if(a>b)
		gcd(b,a,cnt,index);
	int i=2;
	int temp_a = a;
	int gcd_val = 1;
	if(a==1)
	{
		if(index==0)
		{
			return 1;
		}
		else
		{
			return 1;
		}
	}
	for(i=2;i<=temp_a;i++)
	{
		cnt++;
		while((a%i==0)&&(b%i==0))
		{
			cnt++;
			gcd_val*=i;
			b = b/i;
			a = a/i;
			if(a==0||b==0)
			{
				if(index==0)
					return cnt;
				else
					return gcd_val;
			}
		}
	}
	if(index==0)
		return cnt;
	else
		return gcd_val;
}

int main()
{
	int a,b,opcount=0,gcd_val;
	printf("\nEnter a and b:\n");
	scanf("%d%d",&a,&b);
	int index;
	printf("\nEnter index = 0 for opcount or 1 for gcd:\n");
	scanf("%d",&index);
	if(index==0)
	{
		opcount = gcd(a,b,opcount,index);
		printf("\nOpcount is: %d\n",opcount);
	}
	else
	{
		gcd_val = gcd(a,b,opcount,index);
		printf("\ngcd_val is: %d\n",gcd_val);
	}

	clock_t t;
	t = clock();
	opcount = gcd(a,b,0,index);
	t = clock() - t;
	double time_taken = ((double)t)/CLOCKS_PER_SEC;
}
