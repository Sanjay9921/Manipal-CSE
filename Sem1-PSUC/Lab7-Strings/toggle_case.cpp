//Lab7
//Q2
//Toggle the case of every character in a string

#include <iostream>
using namespace std;

int main(){
    const int MAX = 100;
    char str[MAX];
    cout<<"Enter a string..";
    cin.get(str,MAX);
    cout<<"The user entered: "<<str<<endl;

    for(int i=0;str[i];i++){
        if(str[i]>='A' && str[i]<='Z'){
            str[i]+=32;
        }
        else if(str[i]>='a' && str[i]<='z'){
            str[i]-=32;
        }
    }

    cout<<"Result..."<<str<<endl;
}