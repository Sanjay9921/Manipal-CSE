#include<stdio.h>
#include<stdlib.h>

int log2phy_mem(int n,int seg_no,int limit[],int base[])
{
	int check_limit = limit[seg_no];
	printf("\nCheck_limit: %d\n",check_limit);
	if(n<=check_limit)
	{
		printf("%d\n",base[seg_no]+n);
	}
	else
	{
		printf("\nLimit exceeded\n");
	}
}

int main()
{
	int limit[] = {1000,400,400,1100,1000};//in order from s0 to s4
	int base[] = {1400,6300,4300,3200,4700};//in order from s0 to s4
	int choice,n,seg_no;

	while(1)
	{
		printf("\n1.Enter input 2.Exit\n");
		scanf("%d",&choice);
		if(choice==1)
		{
			printf("\nEnter num of bytes:\n");
			scanf("%d",&n);

			printf("\nEnter seg num (0 - 4):\n");
			scanf("%d",&seg_no);

			log2phy_mem(n,seg_no,limit,base);
		}
		else
		{
			exit(1);
		}
	}

	return 0;
}