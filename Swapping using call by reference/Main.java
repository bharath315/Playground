#include <iostream>
int swap(int n1,int &n2)
 {
  int temp;
  temp=n1;
  n1=n2;
  n2=temp;
  std::cout<<"After swapping a= "<<n1<<" and b="<<n2;
 }
int main()
{
  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b<<'\n';
  swap(a,b);
 } 