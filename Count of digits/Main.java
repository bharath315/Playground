#include<iostream>
int main()
{
  // Type your code here
  int n,i=0;
  std::cin>>n;
  do {
    n=n/10;
    i=i+1;
  }while(n>0);
  std::cout<<i;
}