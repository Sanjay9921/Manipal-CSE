//Lab9
//Example1
//Factorial Function

#include <iostream>
using namespace std;

long factorial(int n){
    if(n==1){
        return n;
    }

    return n*factorial(n-1);
}

int main(){

    long result = factorial(5);
    cout<<result;
    return 0;
}

