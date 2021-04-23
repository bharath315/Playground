#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int k,n,j;
  cin>>k;
  for(int i=1;i<=k;i++)
  {
    j=0;
    cin>>n;
    do
    {
      n=n/2;
      j++;
    }while(n>0);
    cout<<j<<endl;
    
  }
  
}