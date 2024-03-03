#include <stdio.h>
#include <stdlib.h>

typedef struct hashnode {
	int data;
	struct hashnode *next;
}hn, *hnp;

typedef struct hash {
	hnp *heads;
	int count;
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
	ht->count = 0;
	ht->heads = (hnp *)calloc(10, sizeof(hnp));
	int i;
	for (i = 0; i < 10; ++i) {
		*((ht->heads) + i) = initHashNode(i);
	}
	return ht;
}

void insertToHash (HASH_p_t hash, int data) {
	int ht = getHash(data);
	hnp *heads = hash->heads;
	hnp head = *(heads + ht);
	while (head->next != NULL) {
		head = head->next;
	}
	head->next = initHashNode(data);
	hash->count += 1;
}

int searchHash (HASH_p_t hash, int key, int *kc) {
	int ht = getHash(key);
	hnp *heads = hash->heads;
	hnp head = *(heads + ht);
	head = head->next;
	while (head != NULL) {
		*kc += 1;
		if (head->data == key) {
			return 1;
		}
		head = head->next;
	}
	return -1;
}

void printHashTable (HASH_p_t hashtable) {

	printf("\nHASHTABLE [%d]:\n", hashtable->count);
	printf("\n---------------------\n");

	hnp *heads = hashtable->heads;

	int i;
	for (i = 0; i < 10; ++i) {
		printf("\n---------------------\n");
		printf("\n%d | ", i);
		hnp head = *(heads + i);
		head = head->next;
		while (head->next != NULL) {
			printf("%3d -> ", head->data);
			head = head->next;
		}
		printf("%d\n", head->data);
	}

	printf("\n\n");

}

int main () 
{
	printf("\nOpen Hash table: Key = %d\n",10);
	printf("\nTotal number of values in the hash table: %d\n",1024);
	
	HASH_p_t hashtable = initHashTable();
	int arr[1024];
	int k = 0;

	int i;
	for (i = 10; i < 600; i += 3) {
		arr[k++] = i;
		insertToHash(hashtable, i);
	}
	for (i = 601; i < 1000; i += 4) {
		arr[k++] = i;
		insertToHash(hashtable, i);
	}
	for (i = 1001; i < 1500; i += 6) {
		arr[k++] = i;
		insertToHash(hashtable, i);
	}
	for (i = 1501; i < 1809; i += 7) {
		arr[k++] = i;
		insertToHash(hashtable, i);
	}
	for (i = 1809; i < 2009; i += 10) {
		arr[k++] = i;
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