//Lab8
//Q2
//Use IsPrime() to generate first N prime numbers

#include <iostream>
using namespace std;

bool isPrime(int n){
    for(int i=2;i<=n/2;i++){
        if(n%i==0){
            return false;
        }
    }

    return true;
}

int main(){
    int n = 10;
    int i=0;
    int start=2;

    for(int i=0,j=2;i<n;j++){
        if(isPrime(j)){
            cout << j << " ";
            i++;
        }
    }

    cout<<endl;
    return 0;
}