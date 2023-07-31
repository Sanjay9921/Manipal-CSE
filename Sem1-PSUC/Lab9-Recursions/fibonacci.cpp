//Lab9
//Q2
//Fibonacci Nth term

#include <iostream>
using namespace std;

int fib(int n){
    if(n==0 || n==1){
        return n;
    }

    return fib(n-1) + fib(n-2);
}

int main(){
    int n = 5; //5th term
    cout << fib(n-1); //if n=1, then result=0 which is possible only when n=0
    return 0;
}