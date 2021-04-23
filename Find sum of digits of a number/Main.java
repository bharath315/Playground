#include<iostream>
using namespace std;
int main()
{
  //Type your code here
  int n;
  cin>>n;
  int r,o;
  while(n!=0)
  {
    
    r=n%10;
    o=o+r;
    n=n/10;
  }
  cout<<o;
  return 0;
}