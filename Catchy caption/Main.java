#include <cstring>
#include <iostream>
int main()
{
   //Your code goes here
  char str[200];
  int count=0,i;
  std::cin.getline(str,100);
  int len=strlen(str);
  for(int i=0;i<len;i++)
  {
    if(str[i]==' ')
    {
      count++;
    }
  }
    if(count<=10)
    {
      std::cout<<"Caption eligible for the contest";
    }
    else 
    {
      std::cout<<"Caption not eligible for the contest";
    }
  }
