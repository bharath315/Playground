#include<iostream>
int main()
{
  int max,n;
  std::cin>>max;
  std::cin>>n;
  if(n<max)
  {
    std::cout<<"Yes, you can enter.";
  }
  else if(n>max)
  {
    std::cout<<"Sorry, you can't enter";
  } 
  else if(n=max)
  {
    std::cout<<"Yes, you can enter. Kindly use a rope.";
  }
  
}  