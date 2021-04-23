#include<iostream>
#include<cmath>
using namespace std;


long long int fib(long int n)
{
  //Type your code here
  long int j=0,k;
   float h;
  cin>>n;
  long long int f[n+1];
  f[0]=1;f[1]=0;f[2]=1;
  for(long int i=3;i<=n;i++)
  {
   f[i]=((i-1)*(f[i-1]+f[i-2]))%100000007;
  }
   return f[n];
}
int main()
{
  long long int n;
  cin >> n;
  cout << fib(n); 
  return 0; 
}
