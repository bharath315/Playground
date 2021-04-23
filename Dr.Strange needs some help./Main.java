#include<iostream>

int power(int a,int b)
{
  float result=1;
  while(b!=0)
  {
    result *= a;
        --b;
  }
  return result;
 }
int main()
{
  int a,b,n;
  std::cin>>a>>b>>n;
  int s= power(a,b);
  


if ( s>=n)
  std::cout<<"Doctor, you can proceed with your experiment.";
else 
  std::cout<<"Sorry Doctor! You need more bacteria.";
}