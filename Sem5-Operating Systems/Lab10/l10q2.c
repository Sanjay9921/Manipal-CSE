#include<stdio.h>
#include<stdlib.h>

int log2n(int n)
{
	return (n>1)?1+log2n(n/2):0;
}

int main()
{
	int pg_size = 32,tot_pgs = 8;
	int m = log2n(pg_size*tot_pgs); //logical addr space
	int n = log2n(pg_size);

	int pg_num = m-n;
	int offset = n;

	int choice,log_addr;
	while(1)
	{
		printf("\n 1.Insert Log addr(bytes) 2.Quit\n");
		scanf("%d",&choice);
		if(choice==1)
		{
			printf("\nInsert log addr bytes:\n");
			scanf("%d",&log_addr);

			int ret_pg_num = log_addr/pg_size;
			int ret_offset = log_addr%pg_size;

			printf("\nPg Num: %d\n",ret_pg_num);
			printf("\nOffset: %d\n",ret_offset);
		}
		else if(choice==2)
		{
			exit(1);
		}
	}
}