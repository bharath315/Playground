#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int max,a,c,u,p,h;
  std::cin>>max;
  std::cin>>a;
  std::cin>>c;
  u=a*75;
  p=c*30;
  h=u+p;
  if(h<max)
    std::cout<<"Boat is stable";
  else
    std::cout<<"Boat will drow";
}  
  
