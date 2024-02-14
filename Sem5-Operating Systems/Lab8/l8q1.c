#include<stdio.h>
#include<stdlib.h>
#include<pthread.h>
#include<semaphore.h>

int buf[20],f,r;

sem_t mutex,full,empty;

void* produce(void *args)
{
	int i;
	for(i=0;i<20;i++)
	{
		sem_wait(&empty);
		sem_wait(&mutex);
		printf("\nProduced items is: %d\n",i);
		buf[(++r)] = i;
		sleep(1);
		sem_post(&mutex);
		sem_post(&full);
		//printf("\nFull: %d\n",full); 
	}
}

void* consume(void* args)
{
	int item,i;
	for(i=0;i<10;i++)
	{
		sem_wait(&full);
		//printf("\nFull: %d\n",full);
		sem_wait(&mutex);
		item = buf[(++f)];
		printf("\nConsumed items is: %d\n",item);
		sleep(1);
		sem_post(&mutex);
		sem_post(&empty);

		/*int val = sem_getvalue(&full,&val);

		if(val<10)
		{
			sem_post(&full);
		}*/
	}
}

int main()
{
	pthread_t t1,t2;

	sem_init(&mutex,0,1);
	sem_init(&full,0,0);
	sem_init(&empty,0,20);

	pthread_create(&t1,NULL,produce,NULL);
	pthread_create(&t2,NULL,consume,NULL);

	pthread_join(t1,NULL);
	pthread_join(t2,NULL);
}