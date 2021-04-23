#include<iostream>
int main()
{
  int i,j=121,n,a=72;
  std::cin>>n;
  std::cout<<j<<" ";
   for (i=1;i<=n-1;i++)
  {
    a=a+32;
    j=j+a;
    std::cout<<j<<" ";
    if (i==n)
      break;
  }
}  