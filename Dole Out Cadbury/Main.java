#include<iostream>
#include<vector>
#include<algorithm>

using namespace std;

//function to find the number of chocolate out of a given size
int findTotal(int a,int b){

    if(b == 1)
       return a;
    if(a==b)
       return 1;
    int p = a-b;
    return 1+ findTotal(max(p,b),min(p,b));
}


int main(){

    int a=5;
    int b=7;
    int c=3;
    int d=4;
    cin>>a>>b>>c>>d;
    int total =0;
    //two for loops to get all possible sizes of box .then count
    for(int i=a;i<=b;i++){
        for( int j=c;j<=d;j++){
       

          total+= findTotal(max(i,j),min(i,j));
        }

    }
    cout<<total<<endl;

  
return 0;

}