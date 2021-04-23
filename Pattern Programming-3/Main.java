#include<iostream>
using namespace std;
int main()
{
  int n,i,j;
  cin>>n;
  int num=1;
  for(i=0;i<n;i++)
  {
    for(j=0;j<=i;j++)
    {
      cout<<num<<" ";
      num=num+1;
    }
    cout<<endl;
  }
  return 0;
}