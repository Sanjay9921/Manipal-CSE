//Lab9
//Additional 2
//Multiply using recursion

#include <iostream>
using namespace std;

long multiply(int a, int b){
    if(b==1){
        return a;
    }
    else{
        return a+multiply(a, b-1);
    }
}

int main(){
    long result1 = multiply(3,5);
    cout<<result1<<endl;
}