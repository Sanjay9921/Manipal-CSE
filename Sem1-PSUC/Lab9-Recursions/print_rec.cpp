//Lab9
//Additional 1
//Print Function

#include <iostream>
using namespace std;

void print_function(int n){
    if(n==1){
        cout<<"1"<<endl;
    }
    else{
        print_function(n-1);
        cout<<n<<endl;
    }
}

int main(){
    print_function(5);
    return 0;
}