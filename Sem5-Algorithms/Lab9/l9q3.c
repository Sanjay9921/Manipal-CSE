#include <stdio.h>
#include <stdlib.h>

#define LIMIT 5 // Max number of nodes that can be put in a list

typedef enum { NO, YES } BOOL;

typedef struct hashnode {
	int data;
	struct hashnode *next;
} hn, *hnp;

typedef struct hash {
	hnp *heads;
	int count[10];
	int totalcount;
} h, *HASH_p_t;

int getHash (int data) {
	return (data % 10);
}

hnp initHashNode (int data) {
	hnp hnode = (hnp)malloc(sizeof(hn));
	hnode->data = data;
	hnode->next = NULL;
	return hnode;
}

HASH_p_t initHashTable () {
	HASH_p_t ht = (HASH_p_t)malloc(sizeof(h));
	ht->totalcount = 0;
	ht->heads = (hnp *)calloc(10, sizeof(hnp));
	int i;
	for (i = 0; i < 10; ++i) {
		ht->count[i] = 0;
		*((ht->heads) + i) = initHashNode(i);
	}
	return ht;
}

BOOL insertToHash (HASH_p_t hash, int data) {
	if (hash->totalcount == 50) 
		return NO;
	int ht = getHash(data);
	int ct = hash->count[ht];
	while (ct == LIMIT) { 
		ht = (ht + 1) % 10;
		ct = hash->count[ht];
	}
	hnp *heads = hash->heads;
	hnp head = *(heads + ht);
	while (head->next != NULL) {
		head = head->next;
	}
	head->next = initHashNode(data);
	hash->count[ht] += 1;
	hash->totalcount += 1;
	return YES;
}

int searchHash (HASH_p_t hash, int key, int *kc) {
	int ht = getHash(key);
	int zt = ht;
	hnp *heads = hash->heads;
	do {
		hnp head = *(heads + ht);
		head = head->next;
		while (head != NULL) {
			*kc += 1;
			if (head->data == key) {
				return ht;
			}
			head = head->next;
		}
		ht = (ht + 1) % 10;
	} while (ht != zt);
	return -1;
}

void printHashTable (HASH_p_t hashtable) {

	printf("HASHTABLE [%d]:\n", hashtable->totalcount);

	hnp *heads = hashtable->heads;

	int i;
	for (i = 0; i < 10; ++i) {
		printf("\n-------------------\n");
		printf("\n%d | ", i);
		hnp head = *(heads + i);
		head = head->next;
		while (head->next != NULL) {
			printf("%3d -> ", head->data);
			head = head->next;
		}
		printf("%d\n", head->data);
	}

	printf("\n");

}

int main () 
{
	
	HASH_p_t hashtable = initHashTable();
	int arr[1024];
	int k = 0;

	int i;
	for (i = 10; i < 60; i += 3) {
		arr[k++] = i;
		if (k < 50)
			insertToHash(hashtable, i);
	}
	for (i = 61; i < 100; i += 4) {
		arr[k++] = i;
		if (k < 50)
			insertToHash(hashtable, i);
	}
	for (i = 101; i < 150; i += 6) {
		arr[k++] = i;
		if (k < 50)
			insertToHash(hashtable, i);
	}
	for (i = 151; i < 189; i += 7) {
		arr[k++] = i;
		if (k < 50)
			insertToHash(hashtable, i);
	}
	for (i = 189; i < 249; i += 10) {
		arr[k++] = i;
		if (k < 50)
			insertToHash(hashtable, i);
	}

	printHashTable(hashtable);

	int kc;
	float ac = 0.0;

	for (i = 0; i < k; ++i) {
		int key = arr[i];
		kc = 0;
		searchHash(hashtable, key, &kc);
		ac += kc;
		// printf("Search %d, Comparisions %d\n", key, kc);
	}

	ac /= k;
	printf("\n\nAverage Comparisions = %.2lf\n\n", ac);

	return 0;
}