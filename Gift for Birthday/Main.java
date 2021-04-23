#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  if (n%4==0&&n%100!=0)
    std::cout<<n<<" is a leap year";
  else if (n%100==0&&n%400==0)
    std::cout<<n<<" is a leap year";
  else if (n%400==0)
    std::cout<<n<<" is a leap year";
  else
    std::cout<<n<<" is not a leap year";
}