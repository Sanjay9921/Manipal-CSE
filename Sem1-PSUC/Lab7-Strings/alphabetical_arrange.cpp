//Lab7
//Q4
//Arrange 'n' names in alphabetical order 
//Hint- use strcmp and strcpy

#include <iostream>
#include <cstring>
using namespace std;

int main(){
    char str[100][100];
    char temp[100];

    int n;
    cout<<"Enter the number of names (n): ";
    cin>>n;

    for(int i=0;i<n;i++){
        cin.get();
        cout<<"Name: "<<i+1<<" ";
        cin.get(str[i], 100);
    }

    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            if(strcmp(str[j],str[i])>0){
                strcpy(temp, str[i]);
                strcpy(str[i], str[j]);
                strcpy(str[j], temp);
            }    
        }
    }

    for(int i=0;i<n;i++){
        cout<<str[i]<<endl;
    }
}