#include <iostream>
int main() 
{
	// Type your code here
  int n,i;
  std::cin>>n;
  while (n>0)
  { 
    i=n%10;
    std::cout<<i;
    n=n/10;
  } 
	return 0;
}