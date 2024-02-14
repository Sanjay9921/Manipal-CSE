#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int n,nf;
int in[100];
int p[50];
int hit=0;
int i,j,k;
int pg_fault=0;
 
void inputData()
{
    printf("\nEnter length of page reference sequence:");
    scanf("%d",&n);
    printf("\nEnter the page reference sequence:");
    for(i=0; i<n; i++)
        scanf("%d",&in[i]);
    printf("\nEnter no of frames:");
    scanf("%d",&nf);
}
 
void init()
{
    pg_fault=0;
    for(i=0; i<nf; i++)
        p[i]=9999;
}
 
int isHit(int data)
{
    hit=0;
    for(j=0; j<nf; j++)
    {
        if(p[j]==data)
        {
            hit=1;
            break;
        }
 
    }
 
    return hit;
}
 
int getHitIndex(int data)
{
    int hitind;
    for(k=0; k<nf; k++)
    {
        if(p[k]==data)
        {
            hitind=k;
            break;
        }
    }
    return hitind;
}
 
void dispPages()
{
    for (k=0; k<nf; k++)
    {
        if(p[k]!=9999)
            printf(" %d",p[k]);
    }
 
}
 
void disppg_fault()
{
    printf("\nTotal no of page faults:%d",pg_fault);
}
 
void fifo()
{
    int m=0;
    init();
    for(i=0; i<n; i++)
    {
        printf("\nFor %d :",in[i]);
 
        if(isHit(in[i])==0)
        {
 
            p[m]=in[i];
            m=(m+1)%nf;
 
            pg_fault++;
            dispPages();
        }
        else
            printf("No page fault");
    }
    disppg_fault();
}
 
 
void optimal()
{
    init();
    int near[50];
    for(i=0; i<n; i++)
    {
 
        printf("\nFor %d :",in[i]);
 
        if(isHit(in[i])==0)
        {
 
            for(j=0; j<nf; j++)
            {
                int pg=p[j];
                int found=0;
                for(k=i; k<n; k++)
                {
                    if(pg==in[k])
                    {
                        near[j]=k;
                        found=1;
                        break;
                    }
                    else
                        found=0;
                }
                if(!found)
                    near[j]=9999;
            }
            int max=-9999;
            int repindex;
            for(j=0; j<nf; j++)
            {
                if(near[j]>max)
                {
                    max=near[j];
                    repindex=j;
                }
            }
            p[repindex]=in[i];
            pg_fault++;
 
            dispPages();
        }
        else
            printf("No page fault");
    }
    disppg_fault();
}
 
void lru()
{
    init();
 
    int least[50];
    for(i=0; i<n; i++)
    {
 
        printf("\nFor %d :",in[i]);
 
        if(isHit(in[i])==0)
        {
 
            for(j=0; j<nf; j++)
            {
                int pg=p[j];
                int found=0;
                for(k=i-1; k>=0; k--)
                {
                    if(pg==in[k])
                    {
                        least[j]=k;
                        found=1;
                        break;
                    }
                    else
                        found=0;
                }
                if(!found)
                    least[j]=-9999;
            }
            int min=9999;
            int repindex;
            for(j=0; j<nf; j++)
            {
                if(least[j]<min)
                {
                    min=least[j];
                    repindex=j;
                }
            }
            p[repindex]=in[i];
            pg_fault++;
 
            dispPages();
        }
        else
            printf("No page fault!");
    }
    disppg_fault();
}
 
void lfu()
{
    int usedcnt[100];
    int least,repin,sofarcnt=0,bn;
    init();
    for(i=0; i<nf; i++)
        usedcnt[i]=0;
 
    for(i=0; i<n; i++)
    {
 
        printf("\n For %d :",in[i]);
        if(isHit(in[i]))
        {
            int hitind=getHitIndex(in[i]);
            usedcnt[hitind]++;
            printf("No page fault!");
        }
        else
        {
            pg_fault++;
            if(bn<nf)
            {
                p[bn]=in[i];
                usedcnt[bn]=usedcnt[bn]+1;
                bn++;
            }
            else
            {
                least=9999;
                for(k=0; k<nf; k++)
                    if(usedcnt[k]<least)
                    {
                        least=usedcnt[k];
                        repin=k;
                    }
                p[repin]=in[i];
                sofarcnt=0;
                for(k=0; k<=i; k++)
                    if(in[i]==in[k])
                        sofarcnt=sofarcnt+1;
                usedcnt[repin]=sofarcnt;
            }
 
            dispPages();
        }
 
    }
    disppg_fault();
}

void mfu()
{
    int usedcnt1[100];
    int most,repout,sofar=0,fn;
    init();
    for(i=0; i<nf; i++)
        usedcnt1[i]=0;
 
    for(i=0; i<n; i++)
    {
 
        printf("\n For %d :",in[i]);
        if(isHit(in[i]))
        {
            int hitind=getHitIndex(in[i]);
            usedcnt1[hitind]++;
            printf("No page fault!");
        }
        else
        {
            pg_fault++;
            if(fn<nf)
            {
                p[fn]=in[i];
                usedcnt1[fn]=usedcnt1[fn]+1;
                fn++;
            }
            else
            {
                most=-9999;
                for(k=0; k<nf; k++)
                    if(usedcnt1[k]>most)
                    {
                        most=usedcnt1[k];
                        repout=k;
                    }
                p[repout]=in[i];
                sofar=0;
                for(k=0; k<=i; k++)
                    if(in[i]==in[k])
                        sofar=sofar+1;
                usedcnt1[repout]=sofar;
            }
 
            dispPages();
        }
 
    }
    disppg_fault();
}
 
void secondchance()
{
    int usedbit[50];
    int victimptr=0;
    init();
    for(i=0; i<nf; i++)
        usedbit[i]=0;
    for(i=0; i<n; i++)
    {
        printf("\nFor %d:",in[i]);
        if(isHit(in[i]))
        {
            printf("No page fault!");
            int hitindex=getHitIndex(in[i]);
            if(usedbit[hitindex]==0)
                usedbit[hitindex]=1;
        }
        else
        {
            pg_fault++;
            if(usedbit[victimptr]==1)
            {
                do
                {
                    usedbit[victimptr]=0;
                    victimptr++;
                    if(victimptr==nf)
                        victimptr=0;
                }
                while(usedbit[victimptr]!=0);
            }
            if(usedbit[victimptr]==0)
            {
                p[victimptr]=in[i];
                usedbit[victimptr]=1;
                victimptr++;
            }
            dispPages();
 
        }
        if(victimptr==nf)
            victimptr=0;
    }
    disppg_fault();
}
 
int main()
{
    int choice;
    while(1)
    {
        printf("\nPage Replacement Algorithms\n1.Enter data\n2.FIFO\n3.Optimal\n4.LRU\n5.LFU\n6.Second Chance\n7.MFU\n8.Exit\nEnter your choice:");
        scanf("%d",&choice);
        switch(choice)
        {
        case 1:
            inputData();
            break;
        case 2:
            fifo();
            break;
        case 3:
            optimal();
            break;
        case 4:
            lru();
            break;
        case 5:
            lfu();
            break;
        case 6:
            secondchance();
            break;
        case 7:
            mfu();
            break;
        default:
            return 0;
            break;
        }
    }
}
