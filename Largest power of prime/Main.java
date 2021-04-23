#include <iostream>
using namespace std;
int largest(int n, int p)
{
  int x=0;
  while(n>0)
  {
  n=n/p;
  x=x+n;
  }
  return x;
}
  int main() 
{
   // Try out your code here
  int t;
    cin>>t;
  while(t--)
  {
    int n,p;
    cin>>n>>p;
    int h=largest(n,p);
  
    cout<<h<<endl;
  }
    
  
    return 0;
}