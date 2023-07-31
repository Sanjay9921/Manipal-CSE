//Lab9
//Q1
//GCD

#include <iostream>
using namespace std;

int gcd(int a, int b){
    if(a==0){
        return b;
    }    

    if(b>a){
        return gcd(a,b-a);
    }
    else{
        return gcd(b,a-b);
    }
    
}

int main(){
    int result1 = gcd(9,24);
    int result2 = gcd(9,25);

    cout<<"Result1: "<<result1<<" Result2: "<<result2<<endl;
}