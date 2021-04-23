#include<iostream>
using namespace std;
int nodigit(int n)
{
  if(n==0)
    return n;
  else 
    return 1+nodigit(n/10);
}
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"Enter the value of n"<<endl;
  cout<<"The number of digits in "<<n<<" is "<<nodigit(n);
}