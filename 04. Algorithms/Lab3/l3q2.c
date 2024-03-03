//String matching
//time efficiency

#include<stdio.h>
#include<stdlib.h>
#include<time.h>
#include<string.h>
#define MAX 10000

int stringMatchBF(char str[],char substr[],int opcount)
{
	int n = strlen(str);
	int m = strlen(substr);

	if(m>n)
		return 0;

	int i=0;
	int j=0;

	while(i<n)
	{
		opcount++;
		while(j<m && str[i+j]==substr[j])
		{
			opcount++;
			j++;
		}
		if(j==m)
			return opcount-1;
		else
		{
			j = 0;
		}
		i++;
	}

	return opcount;
}

int main()
{
	
	char str[MAX],substr[MAX];
	printf("\nEnter String:\n");
	gets(str);

	printf("\nEnter Substring: \n");
	gets(substr);

	printf("\nString is: %s",str);
	printf("\nSubString is: %s",substr);

	

	clock_t t;
	t = clock();
	int opcount = stringMatchBF(str,substr,0);
	t = clock() - t;
	double time_taken = ((double)t)/CLOCKS_PER_SEC;


	printf("\nOpcount is: %d\n",opcount);
	printf("\nTime in microseconds: %.5f\n",time_taken);

	return 0;
}