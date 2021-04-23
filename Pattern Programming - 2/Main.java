#include <iostream>
using namespace std;

int main() 
{
   // Try out your code here
    int n,i,j;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    for(j=1;j<=i;j++)
    {
      cout<<i<<" ";
    }
    cout<<endl;
  }
    return 0;
}