//Lab8
//Additional1
//Find the Largest number from a given list of numbers

#include <iostream>
using namespace std;

int largest(int arr[], int n){
    int max_of_arr = arr[0];
    for(int i=1;i<n;i++){
        max_of_arr = (max_of_arr < arr[i] ? arr[i] : max_of_arr);
    }

    return max_of_arr;
}

int main(){
    int n;
    cout<<"Enter n (between 5-100): ";
    cin>>n;

    int arr[100];
    cout<<"Enter "<<n<<" values...";
    for(int i=0;i<n;i++){
        cin>>arr[i];
    }

    int result = largest(arr, n);
    cout<<"The largest of all the numbers: "<<result;
    return 0;
}