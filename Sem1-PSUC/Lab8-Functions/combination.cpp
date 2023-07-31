//Lab8
//Q1
//Find the Combination (nCr) using Factorial function

#include <iostream>
using namespace std;

long fact(int n){
    if(n==1){
        return 1;
    }

    return n*fact(n-1);
}

long nCr(int n, int r){
    return fact(n)/(fact(n-r)*fact(r));
}

int main(){
    long result1 = nCr(7,3);
    cout<< result1 << endl;
    return 0;
}