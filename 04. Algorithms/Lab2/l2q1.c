//GCD using consecutive integer checking method and analyse its time efficiency

#include<stdio.h>
#include<stdlib.h>
#include<time.h>

//func to return opcount
int gcd(int a,int b,int cnt,int index)
{
	if(a>b)
	{
		gcd(b,a,cnt,index);
	}
	for(int i=a;i>=1;i--)
	{
		cnt++;
		if(b%i==0 && a%i==0)
		{
			if(index==0)
			{
				return cnt;
			}
			else
			{
				return i;
			}			
		}
	}
}


int main()
{
	int opcount = 0,gcd_val;
	int m_add_n;
	int a,b;
	int index;
	printf("\nEnter a and b:\n");
	scanf("%d%d",&a,&b);
	m_add_n = a+b;
	printf("\nEnter index: 0 for opcount or 1 for gcd return:\n");
	scanf("%d",&index);
	if(index==0)
	{
		opcount = gcd(a,b,opcount,index);
		printf("\nThe opcount is: %d\n",opcount);
		return 0;
	}
	else
	{
		gcd_val = gcd(a,b,opcount,index);
		printf("\nthe gcd is: %d\n",gcd_val);
		return 0;
	}


	clock_t t;
	t = clock();
	opcount = gcd(a,b,0,index);
	t = clock() - t;
	double time_taken = ((double)t)/CLOCKS_PER_SEC;	
	
}
