#include <iostream>
using namespace std;
int check(int n,int a[])
{
  int even=0,odd=0;
  for (int i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      even=even+a[i];
    }
    else 
      odd=odd+a[i];
  }
  cout<<"The sum of the even numbers in the array is "<<even<<'\n';
  cout<<"The sum of the odd numbers in the array is "<<odd<<'\n';
}
int main()
{
  int n,a[n];
  cin>>n;
  for (int i=0;i<n;i++)
  {
    cin>>a[i];
  }
  check(n,a); 
  
  
  
}

