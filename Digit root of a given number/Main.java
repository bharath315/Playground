#include<iostream>
int rec(int n)
{
  int i;
    
  if (n == 0)  
    return 0;  
    return (n % 10 + rec(n / 10)); 
} 

int main()
{
  int n,a;
  std::cin>>n;
  a=rec(n);
  std::cout<<rec(a);
  return 0;
  
}                    