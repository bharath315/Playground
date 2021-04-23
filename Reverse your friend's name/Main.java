#include<iostream>
#include<string>
int main() 
{ 
//Type your code here
  std::string s;
  std::getline(std::cin,s);
  for(auto i=s.crbegin();i<s.crend();i++)
  {
    std::cout<<*i;
  }
}