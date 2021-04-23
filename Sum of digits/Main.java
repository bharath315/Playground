#include<iostream>
using namespace std;
int sumof(int n)
{
  int r;
 if(n==0)
   return n;
  else 
   r=n%10;
  n=n/10;
  return r + sumof(n);
}
int main()
{
  int n;
  cin>>n;
  cout<<"Enter the value of n"<<endl;
  cout<<"The sum of digits in "<<n<<" is "<<sumof(n);
  return 0;
}