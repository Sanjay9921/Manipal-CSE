//Lab7
//Q3
//Check if the string is palindrome

#include <iostream>
using namespace std;

int main(){
    const int MAX = 100;
    char str[MAX];
    cout<<"Enter a string..";
    cin.get(str,MAX);
    cout<<"The user entered: "<<str<<endl;

    int length=0;
    for(int i=0;str[i];i++){
        length++;
    }

    bool flag=true;

    for(int i=0;i<length/2;i++){
        if(str[i]!=str[length-i-1]){
            flag=false;
            break;
        }
    }

    if(flag){
        cout<<"Palindrome!"<<endl;
    }
    else{
        cout<<"Not a palindrome!"<<endl;
    }
}