#include<iostream>
int main()
{
  int yr;
  std::cin>>yr;
  if (yr%4==0&&yr%100!=0)
    std::cout<<"Vicky can celebrate his birthday.";
  else if (yr%100==0&&yr%400==0)
    std::cout<<"Vicky can celebrate his birthday.";
  else if (yr%400==0)
    std::cout<<"Vicky can celebrate his birthday.";
  else 
    std::cout<<"Vicky can't celebrate.";
} 