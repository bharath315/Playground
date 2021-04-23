#include <iostream>
using namespace std;

int main() 
{
   
    int n,i,j,k,l;
  cin>>n;
  for(i=1;i<=n;i++)
  {
    for(k=1;k<=n-i;k++)
    {
      cout<<" ";
    }
    for(j=1;j<=(2*i)-1;j++)
    {
      cout<<"*";
     
    }
    cout<<endl;
  }
  for(i=1;i<=3;i++)
  {
    for(j=1;j<=(2*n)-1;j++)
    {
    if(j==1 || j==2 || j==3 || j==(2*n)-1 || j==(2*n)-2 || j==(2*n)-3 )
      cout<<"*";
      else 
        cout<<" ";
    }
    cout<<endl;
  }
    return 0;
}