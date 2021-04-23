#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  int r,u;
  while(n!=0)
  {
    r=n%10;
    u=u+r;
    n=n/10;
  }
  cout<<"Alice must go in path-"<<u;
}