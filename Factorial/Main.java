#include<iostream>
using namespace std;
int fact(int a)
{
  if(a==0 || a==1)
    return 1;
  else 
    return a*fact(a-1);
}
    
int main()
{
  //Type your code here.
  int n;
  cin>>n;
  cout<<"The factorial of "<<n<<" is "<<fact(n);
}