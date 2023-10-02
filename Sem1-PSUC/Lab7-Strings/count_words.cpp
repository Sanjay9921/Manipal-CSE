//Lab7
//Q1
//Count the number of words in a sentence

#include <iostream>
using namespace std;

int main(){
    const int MAX = 100;
    char str[MAX];
    cout<<"Enter a string..";
    cin.get(str,MAX);
    cout<<"The user entered: "<<str<<endl;

    int count=1;
    for(int i=0;str[i];i++){
        if(str[i]==' ' && str[i+1]!=' '){
            count++;
        }
    }

    cout<<"Number of words..."<<count<<endl;
}