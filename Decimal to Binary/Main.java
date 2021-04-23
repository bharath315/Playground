#include<iostream>
using namespace std;
int dec_to_bin(int a)
{
  if(a==0)
    return 0;
  
  else 
    return (a%2 + (10*dec_to_bin(a/2))); 
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<dec_to_bin(n);
  return 0;
}