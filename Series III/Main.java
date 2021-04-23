#include<iostream>
int main()
{
  int i,j=6,a,n;
  std::cin>>n;
  for ( i=0;i<=n-1;i++)
  {
    a=5*i;
    j=j+a;
    std::cout<<j<<" ";
    if( i==n)
      break;
  }
}  