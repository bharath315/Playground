#include <iostream>
using namespace std;
int power(int a,int n)
{
    if(n==0)
    {
        return 1;
    }
  else
    if(n==1)
    {
        return a;
    }
  else
    if(n%2==1)
    {
        return a*power(a,n-1);
    }
  else
    {
        return power(a*a,n/2);
    }
}
int main()
{
    int a,n;
    cout<<"Enter the value of a\n";
    cin>>a;
    cout<<"Enter the value of n\n";
    cin>>n;
    int res=power(a,n);
    cout<<"The value of "<<a<<" power "<<n<<" is "<<res;
    return 0;
}