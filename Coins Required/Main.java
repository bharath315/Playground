#include<iostream>
using namespace std;

int main()
{
  //Type your code here
  int n,i,j,k,l,t;
  cin>>n;
  
  j=(n-4)/5;
  n=n-(j*5);
  if( n%2==0)
    i=2;
  else 
    i=1;
  k=n-(1*i); 
  l=k/2;
  t=i+j+l;
  cout<<t<<" "<<j<<" "<<l<<" "<<i;
  
  return 0;
}