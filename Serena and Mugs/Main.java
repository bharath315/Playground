#include<iostream>
using namespace std;
int printresult(int n,int m,int a[])
{
  int sum=0;
  for (int i=0;i<n;i++)
  {
    sum=sum+a[i];
  }
  if( sum<=m)
  {
    cout<<"YES";
  }
  else 
    cout<<"NO";
}
int main()
{
  int n,m,a[n];
  cin>>n>>m;
  for (int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  printresult(n,m,a);
  return 0;
  
}
  
  