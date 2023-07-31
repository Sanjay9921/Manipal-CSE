//Lab8
//Additional 2
//Find if the given string is Palindrome

#include <iostream>
using namespace std;

bool isPalim(char str[], int n){
    for(int i=0;i<n/2;i++){
        if(str[i]!=str[n-i-1])
            return false;
    }

    return true;
}

int main(){
    char str1[] = "aba";
    char str2[] = "abba";

    bool result1 = isPalim(str1, 3);
    bool result2 = isPalim(str2, 4);

    cout<<result1<<" "<<result2<<endl;

}