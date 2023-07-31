//Lab8
//Additional3
//Return the corner sum of a matrix

#include <iostream>
using namespace std;

int mat_corner_sum(int mat[100][100], int m, int n){
    //m - rows
    //n - cols

    return mat[0][0] + mat[0][n-1] + mat[m-1][0] + mat[m-1][n-1];
}

int main(){
    int m,n;
    cout<<"Enter m (# rows) and n (# cols): ";
    cin>>m>>n;

    int mat[100][100];
    cout<<"Enter Matrix....";
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            cin>>mat[i][j];
        }
    }

    int result = mat_corner_sum(mat, m, n);
    cout<<result<<endl;

    return 0;
}