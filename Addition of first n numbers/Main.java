#include<iostream>
using namespace std;
int sum(int n)
{
  if( n==0)
   return n;
  else 
  return n+sum(n-1);
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int o=sum(n);
  cout<<o;
  return 0;
}