#include<iostream>
#include <cstdlib>
#include <iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int a,c,d,e,f;
  float h,i,b,j,k,g;
  std::cin>>a>>b>>c>>d;
  e=a/6;
  std::cout<<e<<endl;
  f=d/6;
  g=d%6;
  h=g/10;
  i=f+h;
  std::cout<<i<<endl;
  j=(c/i);
  std::cout<<fixed<<setprecision(1)<<j<<endl;
  k=(b/50);
  std::cout<<fixed<<setprecision(1)<<k<<endl;
  if (j>=k)
    std::cout<<"Eligible to Win";
  else
    std::cout<<"Not Eligible to Win";

}