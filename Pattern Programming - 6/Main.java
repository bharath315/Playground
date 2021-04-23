#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
   int n,i,j,k;
  cin>>n;
  for(i=n;i>0;i--)
  {
    for(k=1;k<=i-1;k++)
      cout<<" ";
    for(j=1;j<=i;j++)
    {
      cout<<"*";
    }
    cout<<endl;
  }
  for(i=2;i<=n;i++)
  {
    for(k=0;k<=i-2;k++)
      cout<<" ";
    for(j=1;j<=i;j++)
    {
      cout<<"*";
    }
    cout<<endl;
  }
    return 0;
}