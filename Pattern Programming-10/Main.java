#include <iostream>
using namespace std;

int pyramid(int n)
{
  int num='A';
  int num1='1';
  int i,j,k;
  for(i=1;i<=n;i++)
  {
    for(k=1;k<=n-i;k++)
      cout<<" ";
    num='A';
    for(j=1;j<=i;j++)
    {
      cout<<(char)num++;
    }
     for(j=1;j<=i;j++)
    {
      cout<<j;
    }
    
    cout<<endl;
  }
  return 0;
}

int main() 
{
   // Try out your code here
    int n;
  cin>>n;
  pyramid(n);
    return 0;
}