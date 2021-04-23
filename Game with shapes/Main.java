#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,e;
  cin>>a>>b;
  e=a+a;
  if (b==e)
    std::cout<<"circle can be inside a square";
  else 
    std::cout<<"circle cannot be inside a square";
}